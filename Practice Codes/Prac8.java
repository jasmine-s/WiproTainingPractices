//instance variable,static variable example
class Prac8
{
	int i;// fields should be accessed or printed by objects only
	static int p;// here p value is 0 as it is a default field value
	
	public static void main(String args[])
	{
		Prac8 d=new Prac8();
		System.out.println(d.i);
	System.out.println(p);
	}
}