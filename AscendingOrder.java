class AscendingOrder
{
	public static void main(String [] args)
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int a,b,c;
		System.out.print("Enter the three numbers :");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b)
		{
			int t=a;
			a=b;
			b=t;
		}
		if(a>c)
		{
			int t=a;
			a=c;
			c=t;
		}
		if(b>c)
		{
			int t=b;
			b=c;
			c=t;
		}
		System.out.println("Result :"+a+"\t"+b+"\t"+c);
	}
}