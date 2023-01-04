package mats;
import java.util.*;

public class strings_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		String s1="RT";
		String s2 = "RT"; //Stored in String pool
		String s3=new String("RT"); // new obj created in heap memory  
		//String s3=new String("RT").intern();// creates in pool mem instead of heap 
		String s4=new String("RT"); //new another ob   ''  ''   ''
		System.out.println(s1+s2+s3+s4);
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s4));//true points to val
		System.out.println(s1==s3);//false points to different obj mem 
		String s8=new String("rt");
		System.out.println(s1.equalsIgnoreCase(s8));// to equate lower upper
		System.out.println("Length "+s1.length());// Length of string in int
		System.out.println("Character at index 1 is: "+s1.charAt(1));//displays character at that index
		String s9= "ratnateja";
		System.out.println("Subs string  "+s9.substring(0, 5));//splitting string
		String s11="Ratna";
		String s12="Teja";
		System.out.println("Concating "+s11.concat(s12));// or + (s11+s12)
	
	}

}
