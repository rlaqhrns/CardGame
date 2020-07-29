
public class Car {
	Tire[] tire = new Tire[3];

	Car() {
		for (Tire i : tire) {
			i = new Tire();
		}
	}

	void drivingCar() {
		System.out.println("나는 부모카 운전중");
	}
}
