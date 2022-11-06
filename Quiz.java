package com.model;

public class Quiz {
	String questions=null;
	String options=null;
	public Quiz(String questions, String options) {
		super();
		this.questions = questions;
		this.options = options;
	}
	
	public Quiz() {
		// TODO Auto-generated constructor stub
	}

	public String getQuestions() {
		return questions;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
	}

	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	@Override
	public String toString() {
		return "Quiz [questions=" + questions + ", options=" + options + "]";
	}
	

}
