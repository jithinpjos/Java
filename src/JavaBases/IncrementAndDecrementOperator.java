package JavaBases;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		//++
		//--
		
		int a=1;
		int b=a++; //post increment 
		System.out.println(a); //2
		System.out.println(b); //1
		
		int c=1;
		int d=++c; //pre increment 
		System.out.println(c); //2
		System.out.println(d); //2
		
		int e=2;
		int f=e--; //post decrement 
		System.out.println(e); //1
		System.out.println(f); //2
		
		int g=2;
		int h=--g; //pre decrement 
		System.out.println(g); //1
		System.out.println(h); //1
	}

}
