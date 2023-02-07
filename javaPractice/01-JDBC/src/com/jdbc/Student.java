package com.jdbc;

public class Student {
private int id;
private String Fast_name;
private String Last_name;
private String DateOfBirth;
public Student(String fast_name, String last_name, String dateOfBirth) {
	super();
//	this.id = id;
	Fast_name = fast_name;
	Last_name = last_name;
	DateOfBirth = dateOfBirth;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFast_name() {
	return Fast_name;
}
public void setFast_name(String fast_name) {
	Fast_name = fast_name;
}
public String getLast_name() {
	return Last_name;
}
public void setLast_name(String last_name) {
	Last_name = last_name;
}
public String getDateOfBirth() {
	return DateOfBirth;
}
public void setDateOfBirth(String dateOfBirth) {
	DateOfBirth = dateOfBirth;
}
@Override
public String toString() {
	return "Student [id=" + id + ", Fast_name=" + Fast_name + ", Last_name=" + Last_name + ", DateOfBirth="
			+ DateOfBirth + "]";
}
}
