package OOPsConceptPart1;

public class WrapperClasses {

	public static void main(String[] args) {

        String x="100";
        System.out.println(x+20); //10020
        
        //data conversion:String to Integer
        int i=Integer.parseInt(x);
        System.out.println(i+20); //120
        
        //String to double
        String a="12.33";
        double d=Double.parseDouble(a);
        System.out.println(d); //12.33
        
        //String to boolean
        String b="true";
        boolean t=Boolean.parseBoolean(b);
        System.out.println(t); //true
        
        //Integer to String
        int y=10;
        String s=String.valueOf(y);
        System.out.println(s+20); //1020
        
		String z="100A";
		int l=Integer.parseInt(z);
		System.out.println(l); // throw NumberFormatException (In string A is present)
		

	}

}
