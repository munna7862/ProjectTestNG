package utils;

import java.util.Random;

public class HelperMethods {
	
	public long RandomNumber(int n)
	{
		long num =  (long) ((Math.random()*(Math.pow(10, n))));
		return num;
	}

	public String RandomString(int n)
	{
		String a = "abcdefghijklmnopqrstuvwxyz";
		String b = "";
		Random random = new Random();
		for(int i=0;i<n;i++)
		{
		 b = b+a.charAt(random.nextInt(a.length()));
		}
		return b;
	}

	public String email()
	{
		String s = RandomString(6)+(RandomNumber(4))+"@"+RandomString(4)+".com";
		return s;
	}
	
	public String Name()
	{
		String s = RandomString(5);
		char ch = Character.toUpperCase(s.charAt(0));
		return ch+s.substring(1);
	}
	

	public String Passw()
	{
		String s = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ123456789@#$%!";
		String s1 = "";
		String s2 = "123456789";
		String s3 = "@#$%!";
		Random random = new Random();
		for(int i=0;i<6;i++)
		{
			s1=s1+s.charAt(random.nextInt(s.length()));
		}
		return s1+s2.charAt(random.nextInt(s2.length()))+s3.charAt(random.nextInt(s3.length()));
		
	}
	
	
}
