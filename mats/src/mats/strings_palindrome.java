package mats;

import java.util.Scanner;

public class strings_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String name=sc.nextLine();
		StringBuffer name2=new StringBuffer(name);
		name2.reverse();
		if(name.contentEquals(name2)){
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
				
		
		
	}

}
