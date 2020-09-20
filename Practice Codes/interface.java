//Example for Interfaces
interface I1{
 int a = 100;
void m1();
}
interface A1 implements I1 {
public void m1() {
System.out.println("In m1");
}

}
/*

D:\WT_Java>javac A1.java
A1.java:3: error: modifier static not allowed here
static void m1();
            ^
A1.java:10: error: call to this must be first statement in constructor
this();
    ^
2 errors

D:\WT_Java>javac A1.java
A1.java:3: error: modifier static not allowed here
static void m1();
            ^
1 error

D:\WT_Java>javac A1.java

D:\WT_Java>java A1
Error: Main method not found in class A1, please define the main method as:
   public static void main(String[] args)

D:\WT_Java>javac A1.java
A1.java:3: error: modifier final not allowed here
final void m1();
           ^
1 error

D:\WT_Java>javac A1.java
A1.java:3: error: modifier private not allowed here
private void m1();
             ^
1 error

D:\WT_Java>javac A1.java
A1.java:3: error: modifier protected not allowed here
protected void m1();
               ^
1 error

D:\WT_Java>javac A1.java //Public -----|
                                       |-----> for method m1()
D:\WT_Java>javac A1.java//default -----|

D:\WT_Java>javac A1.java// public -----|
                                       |-----> for variable a
D:\WT_Java>javac A1.java //default-----|

D:\WT_Java>javac A1.java
A1.java:2: error: modifier private not allowed here
private  int a = 100;
             ^
1 error

D:\WT_Java>javac A1.java
A1.java:2: error: modifier protected not allowed here
protected  int a = 100;
               ^
1 error
*/
