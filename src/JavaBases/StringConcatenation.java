package JavaBases;

public class StringConcatenation {
	
	public static void main(String args[])
	{
		
    	//+	 ->Concatenation operator
		//println	 ->is used to print on the console with a new line
		//print		 ->is just used to print on the console
		
		int a=100;
		int b=200;
		
		String x="Hello";
		String y="World";
		
		double i=10.33;
		double j=11.33;
				
		
		System.out.println(a+b); //300
		System.out.println(x+y); //HelloWorld
		
		System.out.println(a+b+x+y); //300HelloWorld
		System.out.println(x+y+a+b); //HelloWorld100200
		System.out.println(x+y+(a+b)); //HelloWorld300
		
		System.out.println(a+b+x+y+a+x+b+y); //300HelloWorld100Hello200World
		System.out.println(a+b+x+y+a+b);   //300HelloWorld100200
		
		System.out.println(i+j); //21.66
		System.out.println(x+y+i+j); //HelloWorld10.3311.33
		
		System.out.println("HelloWorld"); //HelloWorld
		System.out.println(a); //100
		
		System.out.println("the value of a is:"+a); //the value of a is:100
		System.out.println("the value of b is:"+b); //the value of b is:200
		System.out.println("the sum of a and b is:"+a+b); //the sum of a and b is:100200
		System.out.println("the sum of a and b is"+(a+b)); //the sum of a and b is300
		
		System.out.print("this is a print");
		System.out.println("this is a print line new");//this is a printthis is a print line new
		
		
		/*
		  	•	s1.length()
			•	s1.concat(s2)
			•	s1.equals(s2) return true or false
			•	s1.equalsignoreCase(s2) -ignore the case sensitivity(Upper case and lower case)
			•	s1.contains("a") return true or false
			•	s1.substring(starting index, ending index)
					0 1 2 3 4 5 6 ----->starting index
					W E L C O M E
					1 2 3 4 5 6 7------->Ending index
					s.substing(2,5)------>LCO
			•	s1.replace('e','a')
			       s1.replace("com","rom")
	   */

		
		String s1="Hello";
		String s2="World";
		String s3="HELLO";
		
		System.out.println(s1.length()); //5
		System.out.println(s1.concat(s2)); //HelloWorld
		
		System.out.println(s1.equals(s3)); //false
		System.out.println(s1.equalsIgnoreCase(s3)); //true
		
		System.out.println(s1.contains("e")); //true
		System.out.println(s1.substring(1, 4)); //ell
		System.out.println(s1.replace('l','R')); //HeRRo
		System.out.println(s1.replace("ell", "ELL")); //HELLo
		
		

	}
	 
}

