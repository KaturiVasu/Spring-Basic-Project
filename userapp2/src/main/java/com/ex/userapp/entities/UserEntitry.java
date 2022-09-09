package com.ex.userapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User_Table")
public class UserEntitry {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private long sal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSal() {
		return sal;
	}

	public void setSal(long sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "UserEntitry [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

}
