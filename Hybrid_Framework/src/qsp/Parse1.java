package qsp;

import org.testng.annotations.Test;

public class Parse1 {
	@Test
	public void test1()
	{
		String a="10";
		int b = Integer.parseInt(a);
		System.out.println(b);
	}
	@Test
	public void test2()
	{
		String a="10";
		double b = Double.parseDouble(a);
		System.out.println(b);
	}
	@Test
	public void test3()
	{
		String a="10";
		float b = Float.parseFloat(a);
		System.out.println(b);
	}

}
