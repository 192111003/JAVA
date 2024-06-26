class swapping
{
	public static void main(String arg[])
	{
		int a,b;
		a=1;
		b=2;
  		System.out.println("Before Swapping A="+a);
		System.out.println("Before Swapping B="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping A="+a);
		System.out.println("After Swapping B="+b);
	}
}