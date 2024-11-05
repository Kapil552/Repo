package com.springdidemo2.entity;

import java.util.Map;

public class Candidate {

	private Map<String, String> interviews;

	public Candidate(Map<String, String> interviews) {
		this.interviews = interviews;
	}

	public Map<String, String> getInterviews() {
		return interviews;
	}

	public void setInterviews(Map<String, String> interviews) {
		this.interviews = interviews;
	}
}
