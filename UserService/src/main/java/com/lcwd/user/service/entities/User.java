package com.lcwd.user.service.entities;

import java.util.ArrayList;
//import jakarta.persistence.Entity;
//import jakarta.persistence.*;
//import jakarta.persistence.Table;
import java.util.List;
import javax.persistence.*;


@Entity
@Table(name="micro_users")
public class User {
	@Id
    @Column(name = "ID")
    private String userId;

    @Column(name = "NAME", length = 20)
    private String name;

    @Column(name = "EMAIL")
    private String email;
    
    @Column(name = "ABOUT")
    private String about;
    //other user properties that you want
  @Transient
  private List<Rating> ratings=new ArrayList<>();

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}
	
	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", about=" + about + ", ratings="
				+ ratings + "]";
	}
}
