package mats;

public class reverse_matrix {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		int e=args.length;
		int i,j;
		int a[][]=new int[2][2];
		if(e<4) {
			System.out.println("Enter crct numbers");
			
		}
		if(e==4)
		{
			int l=0;
		
		
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				a[i][j]=Integer.parseInt(args[l]);
				l=l+1;
				
			}
		}
		System.out.println("Reverse:");
		for(i=1;i>=0;i--) {
			for(j=1;j>=0;j--) {
			System.out.print(a[i][j]+" ");
			}
				System.out.println();
			}
		}
	}
		

}
