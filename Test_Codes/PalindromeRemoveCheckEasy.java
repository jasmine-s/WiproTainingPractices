public class PalindromeRemoveCheckEasy {

public static int digitRemove_Palin(int input1)

{
String s1 = Integer.toString(input1);
		StringBuffer s2 = new StringBuffer(s1);
		char ch = ' ';
		s2.reverse();
		if(s1.equals(s2.toString())){return -1;}
		else{
			for(int i = 0;i < s1.length();i++) {
				StringBuffer s3 = new StringBuffer(s1);
				ch = s1.charAt(i);
				s3.deleteCharAt(i);
				if(s3.toString().equals(s3.reverse().toString())) {
        break;
        }
			}
			return(ch - '0');
		}
		
		
		public static void main(String a[]) {
	
	System.out.println(digitRemove_Palin(Integer.parseInt(a[0])));
	}

}
