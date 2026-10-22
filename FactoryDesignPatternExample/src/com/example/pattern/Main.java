package com.example.pattern;

public class Main {
	  public static void main(String[] args) {

	        DocumentExporter exporter =
	                ExporterFactory.createExporter("PDF");

	        exporter.export("Factory Design Pattern");
	    }
}
