package mats;
import java.util.*;
public class String_rep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name_1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string: ");
		
		String name=sc.nextLine();
		int s=name.length();
		name_1=name.substring(0,2);
		System.out.println(name_1.repeat(s));
		
		

	}

}
