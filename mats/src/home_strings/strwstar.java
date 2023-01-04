package home_strings;
import java.util.*;
public class strwstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string with*");
		String name=sc.nextLine();
		String name1="";
		
			for(int i=0;i<name.length();i++) 
			{
				
				if(i==0&&name.charAt(i)!='*') {
					name1=name1+name.charAt(i);
				}
			    if(i>0 && name.charAt(i)!='*'&&name.charAt(i-1)!='*') {
			    	name1=name1+name.charAt(i);
			    }
			    if(i>0 && name.charAt(i)=='*'&&name.charAt(i-1)!='*') {
			    	name1=name1.substring(0,name1.length()-1);
			    }
			    
			}
		System.out.println(name1);
			
		

		}

	}



