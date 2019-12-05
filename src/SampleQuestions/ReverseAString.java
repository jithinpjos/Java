package SampleQuestions;

public class ReverseAString {

	public static void main(String[] args) {

		String s="Selenum";
		String rev="";
	
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		
		System.out.println(rev);

	

		
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
	}	
}
