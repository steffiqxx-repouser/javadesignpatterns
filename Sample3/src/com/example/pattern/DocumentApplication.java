package com.example.pattern;

public class DocumentApplication {
	  public void process(
	            DocumentReader reader,
	            String filePath) {

	        String result = reader.readDocument(filePath);
	        System.out.println(result);
	    }
}
