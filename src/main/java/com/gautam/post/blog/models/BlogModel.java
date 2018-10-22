package com.gautam.post.blog.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gautam.post.blog.enums.BlogStatus;

@Table(name = "blog")
@Entity
public class BlogModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "title", nullable = false, length = 20)
	private String title;
	
	@Column(name = "subtitle")
	private String subtitle;
	
	@Column(name = "abstract_summary")
	private String abstractSummary;
	
	@Column(name = "blog_post", nullable = false, length = 10000, columnDefinition="TEXT")
	private String blog_post;
	
	@Column(name = "published_date")
	private Date publishedDate;
	
	@Column(name = "status")
	@Enumerated(EnumType.STRING)
	private BlogStatus status;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private User author;

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

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Blog [id=" + id + ", title=" + title + ", subtitle=" + subtitle + ", abstractSummary=" + abstractSummary
				+ ", blog_post=" + blog_post + ", publishedDate=" + publishedDate + ", status=" + status + ", author="
				+ author + "]";
	}
	
	
	
	
}
