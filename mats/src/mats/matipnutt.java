package mats;

import java.util.Scanner;

public class matipnutt {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int r,c,i,j;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter size:");
		    r=sc.nextInt();
		    c=sc.nextInt();
		    int mat[][]=new int[r][c];
		    System.out.println("Enter");
		    for(i=0;i<r;i++)
		    {
		    	for (j=0;j<c;j++) {
		    		mat[i][j]=sc.nextInt();
		    	}
		     }
		    System.out.println("Array ele:");
		    for(i=0;i<mat.length;i++) {
		    	for(j=0;j<mat.length;j++) {
		    		System.out.print(mat[i][j]+" ");
		    	}
		    	System.out.println();
		    }
		}

	}
