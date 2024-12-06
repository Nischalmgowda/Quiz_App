package com.telusko.quizapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;

    @ManyToMany
    private List<Question> questions;

	public void setQuestions(List<Question> questions2) {
		// TODO Auto-generated method stub
		
	}

	public void setTitle(String title2) {
		// TODO Auto-generated method stub
		
	}

	public List<Question> getQuestions() {
		// TODO Auto-generated method stub
		return null;
	}

}
