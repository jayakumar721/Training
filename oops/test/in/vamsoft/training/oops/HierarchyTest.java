package in.vamsoft.training.oops;

public class HierarchyTest {

	public static void main(String[] args) {
		SportsCar car = new SportsCar("Xuv");
		car.brake();
		Car c = new SportsCar();
		System.out.println(car);
		System.out.println(c);
	}
}
