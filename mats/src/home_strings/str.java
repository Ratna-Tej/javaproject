package home_strings;
import java.util.*;
public class str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String name=sc.nextLine();
		int len_=name.length();
		System.out.println(name.substring(1, len_-1));

	}

}
