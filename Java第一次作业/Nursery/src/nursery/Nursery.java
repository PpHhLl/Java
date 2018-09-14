package nursery;

public class Nursery {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n=99;
		String s="bottles";
for(int i=n;n>=0;n--)
{
	if(n==1)
	{
	s="bottle";
	}
	if(n!=0)
	{
			System.out.println(n+" "+s+" "+"of beer on the wall,"+n+" "+s+" "+"of beer.");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
	}
	if(n==2)
	{
		s="bottle";
	}
	if(n!=1&&n!=0)
	{
	System.out.println(n-1+" "+s+" "+"of beer on the wall.\n");
	}
	if(n==1)
		System.out.println("No more bottles of beer on the wall.\n");
}
	}

}
