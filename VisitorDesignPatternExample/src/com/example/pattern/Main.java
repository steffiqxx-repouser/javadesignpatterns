package com.example.pattern;

public class Main {
	
	public static void main(String[] args) {
		Examination exam=new OnlineExamination();
		exam.conduct();
		
		Examination exam1=new WrittenExam();
		exam1.evaluate();
	}

}
