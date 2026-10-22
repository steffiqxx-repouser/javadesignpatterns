package com.example.pattern;

public class ExporterFactory {
	  public static DocumentExporter createExporter(String format) {
	        if (format == null) {
	            throw new IllegalArgumentException("Format cannot be null");
	        }

	        switch (format.toUpperCase()) {
	            case "PDF":
	                return new PdfExporter();

	            case "WORD":
	                return new WordExporter();

	            case "HTML":
	                return new HtmlExporter();

	            default:
	                throw new IllegalArgumentException(
	                    "Unsupported format: " + format
	                );
	        }
	    }
}
