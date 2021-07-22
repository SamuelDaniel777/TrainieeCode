class DemoApp3
{
	public static void main(String args[])
	{
	
	 int n=args[0];
	 if(n>0)
	 {
	   int sum=Math.pow(n*(n+1)/2,2);
	   System.out.println("Result is "+sum);
	 }
	 else
	 System.out.println("Invalid Entry");

}



