package com.library.model;

public class Author{
	private String name;
	private int age;
	
	// Constructor
	public Author(String name, int age) {
        this.name = name;
        this.age = age;
    }
	
	// getters, setters, and other methods
	
	
	@Override
	public String toString(){
		return "Author{" +
				"name='" + name + '\'' +
				", age='" + age +
				'}';	
	}
}