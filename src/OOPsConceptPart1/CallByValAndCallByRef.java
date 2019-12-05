package OOPsConceptPart1;

public class CallByValAndCallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByValAndCallByRef obj=new CallByValAndCallByRef();
		int x=10;
		int y=20;
		obj.sum(x,y);//Call by value or pass by value
		
		obj.p=100;
		obj.q=200;
		obj.swap(obj); //call by reference
		
		//After Swap
		System.out.println(obj.p);//200
		System.out.println(obj.q);//100
	}
	
	public int sum(int a,int b) {
		int sum;
		sum=a+b;
		return sum;
	}
	
	public void swap(CallByValAndCallByRef r)
	{
		int temp=r.p;
		r.p=r.q;
		r.q=temp;
	}

}
