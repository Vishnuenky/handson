package com.program.basic;

import java.util.Random;

public class RandomNumGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int ran=r.nextInt(10);//int ran=r.nextInt(5)
		System.out.println(ran);
	}

}
