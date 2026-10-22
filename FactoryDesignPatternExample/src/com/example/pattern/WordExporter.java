package com.example.pattern;

public class WordExporter implements DocumentExporter {

	@Override
	public void export(String content) {
		// TODO Auto-generated method stub
		  System.out.println("Exporting as Word: " + content);
	}

}
