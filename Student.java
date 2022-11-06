package com.model;

public class Student {

	int sid;
	String name;
	int score;
	public Student(Integer sid, String name, int score) {
		// TODO Auto-generated constructor stub
		this.sid = sid;
		this.name = name;
        this.score = score;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [Sid=" + sid + ", name=" + name + ", score=" + score + "]";
	}
}
