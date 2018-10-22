package com.gautam.post.blog.dtos;

import java.util.Date;

import com.gautam.post.blog.enums.BlogStatus;

public class BlogDTO {
	
	private Long id;
	
	private String title;
	
	private String subtitle;
	
	private String abstractSummary;
	
	private String blog_post;
	
	private Date publishedDate;
	
	private BlogStatus status;
	
	private Long author;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getAbstractSummary() {
		return abstractSummary;
	}

	public void setAbstractSummary(String abstractSummary) {
		this.abstractSummary = abstractSummary;
	}

	public String getBlog_post() {
		return blog_post;
	}

	public void setBlog_post(String blog_post) {
		this.blog_post = blog_post;
	}

	public Date getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

	public BlogStatus getStatus() {
		return status;
	}

	public void setStatus(BlogStatus status) {
		this.status = status;
	}

	public Long getAuthor() {
		return author;
	}

	public void setAuthor(Long author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Blog [id=" + id + ", title=" + title + ", subtitle=" + subtitle + ", abstractSummary=" + abstractSummary
				+ ", blog_post=" + blog_post + ", publishedDate=" + publishedDate + ", status=" + status + ", author="
				+ author + "]";
	}
	
	
	
	
}
