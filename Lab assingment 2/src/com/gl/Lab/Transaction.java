package com.gl.Lab;

public class Transaction{
	
	public int istargetAcheived(int[] array,int target) {
		int status= -1;
		long sum= 01;
		for(int i=0;i<array.length;i++) {
			sum +=array[i];

			if(sum>=target) {
				status = i+1;
				break;
			}
		}
		return status;
	}
}


