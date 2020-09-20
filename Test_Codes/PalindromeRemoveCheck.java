
import java.io.*;
import  java.util.*;

// Read only region start
class PalindromeRemoveCheck
{
public static int digitRemove_Palin(int input1)

{
ArrayList<Integer> a = new ArrayList<Integer>();
		while(input1!=0){
			a.add(input1%10);
			input1/=10;
		}
		//System.out.println(a);
		int temp = 0;
		if(isPalindrome(a)){
			return -1;
		}
		else {
		for(int i = 0;i<a.size();i++){
			temp = a.get(i);
			a.remove(i);
			
			if((isPalindrome(a))){
			//	System.out.println(isPalindrome(a));
				return temp;
			}
			
			a.add(i,temp);

		}
		return 0;
		}
	}
    public static boolean isPalindrome(ArrayList<Integer> a){
		int n = 0;
		for(int i: a){
			n *=10;
			n +=i;
		}
		//System.out.println(n);
		String s = String.valueOf(n);
		StringBuffer ss = new StringBuffer(s);
		 ss.reverse().toString();
		// System.out.println("Stringd " + ss);
		//int r = Integer.parseInt(s);
		if(s.equals(ss.toString()))
		return true;
		else
		return false;
	}
   public static void main(String a[]) {
	
	    System.out.println(digitRemove_Palin(Integer.parseInt(a[0])));
	}


}
