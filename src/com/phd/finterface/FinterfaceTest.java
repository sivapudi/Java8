package com.phd.finterface;

import com.phd.interfacem.Square;

public class FinterfaceTest {
	
	public static void main(String[] args) {
		 int w=12;
		Square s= (int x)-> x*x;
		System.out.println(s.calculate(w));
//		s.testMethod();
	}

}
