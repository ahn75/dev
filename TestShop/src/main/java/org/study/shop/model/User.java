package org.study.shop.model;

public class User {
	
	private String id;
	private String name;
	private int age;
	private String hoddy;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHoddy() {
		return hoddy;
	}
	public void setHoddy(String hoddy) {
		this.hoddy = hoddy;
	}
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", hoddy=" + hoddy + "]";
	}
	
}
