package com.gautam.post.blog.serviceImpls;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gautam.post.blog.dtos.BlogDTO;
import com.gautam.post.blog.enums.RoleName;
import com.gautam.post.blog.exceptions.ApiException;
import com.gautam.post.blog.models.BlogModel;
import com.gautam.post.blog.models.Role;
import com.gautam.post.blog.models.User;
import com.gautam.post.blog.repositories.util.BlogRepositoryUtil;
import com.gautam.post.blog.repositories.util.UserRepositoryUtil;
import com.gautam.post.blog.serviceImpls.utils.BlogServiceUtil;
import com.gautam.post.blog.services.BlogService;

@Service
public class BlogServiceImpl implements BlogService {
	private static Logger LOGGER = Logger.getLogger(BlogServiceImpl.class.getName());
	private BlogServiceUtil blogServiceUtil = new BlogServiceUtil();
	
	@Autowired
	private BlogRepositoryUtil blogRepoUtil;
	@Autowired
	private UserRepositoryUtil userRepoUtil;

	@Override
	public List<BlogDTO> getAllBlogs() {
		List<BlogDTO> blogDTOs = new ArrayList<>();
		try {
			List<BlogModel> blogModels = blogRepoUtil.getLiveBlogs();
			LOGGER.log(Level.INFO, "Models retrived:\n" + blogModels);
			for (BlogModel model : blogModels) {
				blogDTOs.add(blogServiceUtil.convertModelToDTO(model));
			}

		} catch (ApiException ex) {
			LOGGER.log(Level.SEVERE, "Exception in getAllBlogs", ex);
		}
		return blogDTOs;
	}


	@Override
	public BlogDTO saveBlog(BlogDTO blog) {
		BlogModel model = null;
		if (blogServiceUtil.valid(blog)) {
			model = blogServiceUtil.convertDTOToModel(blog);
			blogRepoUtil.save(model);
		} else {
			// throw new ValidationException("Blog is not valid",
			// HttpStatus.NOT_ACCEPTABLE);
		}

		return blogServiceUtil.convertModelToDTO(model);
	}

	@Override
	public BlogDTO getBlogById(Long id) {
		BlogDTO dto = null;

		try {
			BlogModel model = blogRepoUtil.getOne(id);
			dto = blogServiceUtil.convertModelToDTO(model);
		} catch (ApiException ex) {
			LOGGER.log(Level.SEVERE, "Exception in getBlogById", ex);
		}
		return dto;
	}

	@Override
	public List<BlogDTO> getBlogsByUserId(Long userId, Boolean deleted) {
		
		List<BlogDTO> blogDTOs = new ArrayList<>();
		List<BlogModel> blogModels = null;
		try {
			User user = userRepoUtil.getOne(userId);
			Role role = user.getRoles().iterator().next();

			if (deleted)
				blogModels = blogRepoUtil.getDeadBlogByUserId(userId);

			else if (role.getName() == RoleName.END_USER) {
				blogModels = blogRepoUtil.findUsersUndeadBlogs(userId);
			} else if (role.getName() == RoleName.JUNIOR_EDITOR) {
				blogModels = blogRepoUtil.getInReviewBlogsByUserId(userId);
			} else if (role.getName() == RoleName.SENIOR_EDITOR) {
				blogModels = blogRepoUtil.getSubmitableBlogsByUserId(userId);
			}
			for(BlogModel model : blogModels) {
				blogDTOs.add(blogServiceUtil.convertModelToDTO(model));
			}
		} catch (ApiException ex) {
			LOGGER.log(Level.SEVERE, "Exception in getBlogsByUserId", ex);
		}
		return blogDTOs;
	}



}
