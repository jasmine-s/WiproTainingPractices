//Uninitialized values will give error even default value is 0 beacause default values for only field values
/*
Feild Value- outside the block/method
int x
{
	print x
}

every local variable must be initialized.

*/
class Prac6
{
	
	public static void main(String args[])
	{
		int i;
		System.out.println(i);
	}
}
//Compiletime Error