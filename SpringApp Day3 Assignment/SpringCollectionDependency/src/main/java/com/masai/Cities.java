package com.masai;

import java.util.Map;

public class Cities {

	private Map<Student, String> map;

	public void setMap(Map<Student, String> map) {
		this.map = map;
	}

	public void showCity() {
		System.out.println("inside show of Cities  ");
		System.out.println(map.toString()); //or normal map print
	}
}
