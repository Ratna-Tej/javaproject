package mats;

public class jaggered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat=new int[2][];
		mat[0]=new int[] {1,2};
		mat[1]=new int[] {2,4,5,6};
		System.out.println("J array:");
		for(int x[]:mat) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
	}

}
