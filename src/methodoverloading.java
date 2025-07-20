class casio
{
	public void add(int i,int j) //method1
	{
		System.out.println(i+j);
	}
	public void add(int i,int j,int k)  //method2
	{
		System.out.println(i+j+k);
	}
}
public class methodoverloading 
{
	public static void main(String args[])
	{
		casio obj = new casio();
		obj.add(77, 88);
		obj.add(55,66,77);
	}
}
