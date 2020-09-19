/*
Problem Statement
https://drive.google.com/file/d/1Xoew5clyFtZEfskUYCofDYVgMdmFjM7k/view?usp=sharing

Sample Example:
inputs : java PasswordGenerator 12 1313 122 678 898
output : The password is :983
*/

import java.util.*;
public class PasswordGenerator {
public static void main(String a[]){
ArrayList<Integer> inputs = new ArrayList<Integer>();
//taking inputs
int i,j;
int stableSum=0,unstableSum = 0;
for(i=0;i<5;i++)
inputs.add(Integer.parseInt(a[i]));
Boolean b = false;
for(i=0;i<5;i++){
b=findFreq(inputs.get(i));//frequency stable or not
if(b==true){
stableSum += inputs.get(i);
}
else
unstableSum += inputs.get(i);
}

System.out.println("The password is :" + (stableSum-unstableSum));
}

public static boolean findFreq(int n) {
  int temp[] = {0,0,0,0,0,0,0,0,0,0};
  if(n == 0){
  temp[n]++; 
  return true;
  }
  else if(n>0 && n<=9) return true;
  else{
  while(n!=0)
  {
		
		temp[n%10]++;
		n/=10;
  }//increament freqs
  ArrayList<Integer> freqs = new ArrayList<Integer>();
  //remove 0's
  for(int i=0;i<temp.length;i++){
	if(temp[i]!=0){
	freqs.add(temp[i]);
	}
  }
  //check all freqs are same or not
  for(int i:freqs){
  if(freqs.get(0)!=i){
  return false;
  }
  }
  return true;
  
  }

}
}
