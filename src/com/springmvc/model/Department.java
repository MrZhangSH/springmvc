package com.springmvc.model;

public class Department {

	private Integer id;
	private String name;

	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int i, String string) {
		this.id = i;
		this.name = string;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + name + "]";
	}

}
