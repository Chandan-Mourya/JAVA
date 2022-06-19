package com.question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class City {
		public static void main(String[] args) {
			List<String> l1=new ArrayList<>();
			l1.add("Boisar");
			l1.add("Plaghar");
			l1.add("Vasai");
			l1.add("Virar");
			l1.add("Dahanu");
			l1.add("Kelva");
			System.out.println(l1);
		
		Collections.sort(l1, (s1,s2) ->s1.compareTo(s2));
		System.out.println(l1);
			
		}
}
