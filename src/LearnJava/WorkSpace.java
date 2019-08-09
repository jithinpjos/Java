package LearnJava;

import java.util.Scanner;

public class WorkSpace {
	
	int rows;
	int number=1;
	
	void floydtriangle(int rows) {
		
		for(int count=1;count<=rows;count++)
		{
			for(int j=1;j<=count;j++)
			{
				System.out.print(number+" ");
				number++;
			}
			
			System.out.println();
		}
		
	}
	
void pascaltriangle(int rows) {
		
		for(int count=1;count<=rows;count++)
		{
		
		}
	}
		
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter the number of rows for floyd's triangle : ");
		int row=input.nextInt();
		WorkSpace work1=new WorkSpace();
		//work1.floydtriangle(row);
		
		work1.pascaltriangle(row);
		
	}

}
