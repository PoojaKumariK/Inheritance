package com.tnsif.program;

public class ContinueStatement {
	public static void main(String[] args) {
		for(int k=1; k<20;k++) {
			if (k%2!=0)//odd number is skipped:
				continue;
			System.out.println(k);//print even number:
		}
	}

}
