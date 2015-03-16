package bolos;

import java.util.Scanner;

public class Bolos_Locos {

	public static void main(String[] args) {
		Scanner nj=new Scanner(System.in);
	 	int[][] bolos;
		int f , b, i, k, m=1, n=1;
		
		f=nj.nextInt();
	
		while(f!=0){
		
		b= nj.nextInt();
		nj.nextLine();
		
		for(i=0;i<f;i++){
			for(k=0;k<m;k++){
				bolos[i][k]=n;
				n=n+1;
				System.out.print(bolos[i][k]);
			}
			System.out.println(" ");
		}
		
		}
	}

}
