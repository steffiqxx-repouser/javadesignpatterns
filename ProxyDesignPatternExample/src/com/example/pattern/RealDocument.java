package com.example.pattern;

public class RealDocument implements Document {

	private String filename;

    public RealDocument(String filename) {
        this.filename = filename;
        loadDocument();
    }

    private void loadDocument() {
        System.out.println("Loading document: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying confidential document: "
                           + filename);
    }
}
