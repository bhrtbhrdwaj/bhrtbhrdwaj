package com.training.servlet;

public class Demo {
private int id;
private String name;
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

public Demo() {}
public Demo(int id, String name) {
	this.id = id;
	this.name = name;
}
@Override
public String toString() {
	return "Demo [id=" + id + ", name=" + name + "]";
}


}
