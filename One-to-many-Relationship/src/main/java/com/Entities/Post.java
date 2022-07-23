package com.Entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String title;
	private String description;
	
	@OneToMany(cascade = CascadeType.ALL) //it means agar post ka object save kiya 
	//to usse releted sare comments bhi save ho jayenge alag se save karne
	//ki need nhi
	@JoinColumn(name="pc_fid", referencedColumnName = "id")//post ki refrence id
	List<Comments> comments=new ArrayList<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Comments> getComments() {
		return comments;
	}

	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}
	
	public Post() {
		// TODO Auto-generated constructor stub
	}
	public Post(long id, String title, String description, List<Comments> comments) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", description=" + description + ", comments=" + comments + "]";
	}
	
	
	
}
