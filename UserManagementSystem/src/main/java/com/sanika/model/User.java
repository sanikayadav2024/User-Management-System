package com.sanika.model;

import jakarta.persistence.*;

@Entity
public class User {
  @Id
  @GeneratedValue
  private long id;
  private String username;
  private String name;
  private String email;
  
  public User() {
	  super();
  }
  public User(Long id, String username, String name, String email) {
	  this.id = id;
	  this.name = name;
	  this.username = username;
	  this.email = email;
  }
  public Long getId() {
	  return id;
  }
  public void setId(Long id) {
	  this.id = id;
  }
  public void setname(String name) {
	  this.name = name;
  }
  public String getname() {
	  return name;
  }
  public void setusername(String username) {
	  this.username = username;
  }
  public String getusername() {
	  return username;
  }
  public void setemail(String email) {
	  this.email = email;
  }
  public String getemail() {
	  return email;
  }
  
  public String toString() {
	  return "ID = " + id + "Name = " + name + "User Name = " + username + "Email = " + email;
  }
}
