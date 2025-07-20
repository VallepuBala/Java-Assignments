class calci
{
	int num1;
	int num2;
	int result;
	public calci()
	{
		num1=1;
		num2=2;
		System.out.println("value is");
	}
	public calci(int n, int m)
	{
		num1=n;
		num2=m;
		}
	
}
public class Constructor
{
	public static void main(String args[])
	{
		calci obj = new calci(5,9);
		System.out.println(obj.num1);
		System.out.println(obj.num2);
	}

	
}



