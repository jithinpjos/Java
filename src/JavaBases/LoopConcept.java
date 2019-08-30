package JavaBases;

public class LoopConcept {
	public static void main(String[] args)
	{
		//1.while Loop
		//Disadvantage of while loop:it will generate infinite loop if you do not give incremental or decremental operator
		System.out.println("while loop for print numbers from 1 to 10");
		
		int a=1;//Initialization 
		while(a<=10) //Conditional 
		{
			System.out.println(a);
			a++; //incremental or decremental operator
		}
		
		//2.do while Loop
		
		System.out.println("do while loop for print numbers from 1 to 10");
		
		int b=1;       //Initialization 
		do {
			System.out.println(b);
			b++;      //incremental or decremental operator
		}while(b<=10);//Conditional 
		
		
		//3.for loop
		System.out.println("for loop for print numbers from 1 to 10");
		for(int i=1;i<=10;i++)//Initialization,Conditional,incremental or decremental
		{
			System.out.println(i);
		}
		
		//In for Loop we can use two types of jumping statements
		//1.break
		//2.continue
		
		System.out.println("for loop for print numbers from 1 to 10 with break");
		
		for(int i=1;i<=10;i++)//Initialization,Conditional,incremental or decremental
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);//1,2,3,4
		}
		
		System.out.println("for loop for print numbers from 1 to 10 with continue");
		
		for(int i=1;i<=10;i++)//Initialization,Conditional,incremental or decremental
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);//1,2,3,4,6,7,8,9,10 :5 is not printed
		}
		
		//4.for each loop
		//for each loop is used for array,arraylist,hashmap..etc
		System.out.println("for each loop for print integer array");
		int array[]= {100,200,300,400,500};
		for(int i:array)
		{
			System.out.println(i);//100,200,300,400,500
		}
		
		System.out.println("for each loop for print integer array");
		String arrayString[]= {"test","test1","test2","test3"};
		for(String i:arrayString)
		{
			System.out.println(i);//test,test1,test2,test3
		}
		
	}
}
