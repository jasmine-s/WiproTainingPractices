//Instance variables
class Prac10
{
int i; static int b=1000;
public static void main(String a[])
{
Prac10 s = new Prac10();
System.out.println(s.i);//0
s.i=10;
System.out.println(s.i+s.b);
/*1010 bcs still the object creats memory for 
static but it will consider the value initialised to a static variable*/

}
}