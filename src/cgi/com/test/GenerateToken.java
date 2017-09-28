package cgi.com.test;

import java.util.Random;

public class GenerateToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Generated Token=");
		System.out.println(gentoken());

	}

	
	private static double gentoken()
	{
		return new Random().nextGaussian();
	}

}
