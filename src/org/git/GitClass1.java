package org.git;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GitClass1 {
	
	public static void main(String[] args) {
		
		
		List l= new ArrayList();
		
		l.add(25);
		l.add("Jari");
		l.add("Nilan");
		l.add(25.67);
		l.add('F');
		
		System.out.println(l);
		
		int num;
		System.out.println("Enter the number for multiplication table :");
		
		Scanner s= new Scanner(System.in);
		num=s.nextInt();
		
		for (int i = 1; i <=10; i++) {
			
			System.out.println(num+"*"+i+"="+num*i);
		}
		
		
		
		
		
	}

}
