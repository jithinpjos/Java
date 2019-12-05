package OOPsConceptPart2;

public class NewCar {

	public static void main(String[] args) {
		
		//Static polymorphism--compile time polymorphism
		BMWCar bmw=new BMWCar();
		bmw.start();
		bmw.theftSafety();
		bmw.stop();
		bmw.refuel();
		
		
		Car car=new Car();
		car.start();
		car.stop();
		car.refuel();
		
		//Top-casting
		Car car1=new BMWCar();//child class object can be referred by parent class reference variable---dynamic polymorphism--run time polymorphism
		car1.start();
		car1.stop();
		car1.refuel();
		
		//Down-casting
		BMWCar bmw1=(BMWCar)new Car();
		bmw1.theftSafety();  // throw ClassCastException
	}

}
