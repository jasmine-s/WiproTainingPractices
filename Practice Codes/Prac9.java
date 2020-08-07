//static variable example 
class Prac9
{
	static int p;// here p value is 0 as it is a default field value
	public static void main(String args[]){
		Prac8 d=new Prac8();
		//System.out.println(d.i);
	System.out.println(p);
	System.out.println(d.p);//can also print by creating objects
	
	//changing values 
	p=10;
	System.out.println(d.p);/*value is 0 - objects will create a memory again to store hence 
	if we update value for only static it will never reflects on object's static variable*/
	System.out.println(p);//value is 10
	d.p=59;
	System.out.println(d.p);//59
	System.out.println(p);//10
	
	}
}