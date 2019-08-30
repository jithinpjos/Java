package JavaBases;

import java.util.Scanner;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//array:to store similar data type values in a array variable
		//One dimensional array
		//dis-advantage of array
		//1.Size is fixed--static array--to overcome this problem we use collections--ArrayList,HashTable---dynamic array
		//2.Stores only similar data types--to overcome this problem,we use Object array.
		
		//1:integer array
		//lowest bound/index=0
		//upper bound/index=n-1(n is size of array)
		
		int i[]=new int [4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[2]); //30
		System.out.println(i[3]); //40
		
		//System.out.println(i[4]); //ArrayIndexOutOfBoundsException
		System.out.println(i.length); //4 Give the size/length of array
		
		//Print all the values of array
		for(int j=0;j<i.length;j++)
		{
			System.out.println(i[j]); //10,20,30,40
		}

		
		for(int j:i)
		{
			System.out.println(j); //10,20,30,40
		}
		
		
		//2:Double array
		double d[]=new double[3];
		d[0]=10.33;
		d[1]=11.23;
		d[2]=14.28;
		
		System.out.println(d[2]); //14.28
		
		//3.char array
		char c[]=new char[3];
		c[0]='s';
		c[1]=2;
		c[2]='$';
		for(char h:c)
		{
			System.out.println(h);
		}
		
		//4.boolean Array
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		
		
		//5.String Array
		String s[]=new String[3];
		s[0]="test";
		s[1]="hello";
		s[2]="world";
		System.out.println(s.length);//3
		
		//6.Object Array:(Object is class)--is used to store different data types values
		Object ob[]=new Object[6];
		ob[0]="Tom";
		ob[1]=25;
		ob[2]=12.33;
		ob[3]="1/1/1990";
		ob[4]='M';
		ob[5]="London";
		
		System.out.println(ob.length);//6
		for(Object z:ob)
		{
			System.out.println(z);
		}
	}

}
