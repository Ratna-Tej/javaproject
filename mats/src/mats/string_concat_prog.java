package mats;
import java.util.*;
public class string_concat_prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name_1=sc.nextLine();
		String name_2=sc.nextLine();
		name_1=name_1.toLowerCase();
		name_2=name_2.toLowerCase();
		int a=name_1.length();
		int b =name_2.length();
		if(name_1.charAt(a-1)==name_2.charAt(0)) {
			String c=name_2.substring(1);
			System.out.println(name_1.concat(c));
			
		}
		else {
			System.out.println(name_1.concat(name_2));
		}
		
	}

}
