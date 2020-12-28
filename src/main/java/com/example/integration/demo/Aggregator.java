package com.example.integration.demo;

public class Aggregator {

	public String aggregate(List<String> substrings){
		StringBuilder buffer = new StringBuilder();
		for (String substring: substrings){
			buffer.append(substring);
		}
		
		return buffer.toString();
	}
}
