package com.ex.userapp.beans;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String name;
	private int id;
	private long sal;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getSal() {
		return sal;
	}

	public void setSal(long sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", sal=" + sal + "]";
	}

}
