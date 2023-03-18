package opps.inheritance.program;

class SolarSystem {
}
class Earth extends SolarSystem {
}
class Mars extends SolarSystem {
}
public class InstanceOfOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolarSystem s = new SolarSystem();
		Earth e = new Earth();
		Mars m = new Mars();

		System.out.println(s instanceof SolarSystem);
		System.out.println(e instanceof Earth);
		System.out.println(m instanceof SolarSystem);
		System.out.println(e instanceof SolarSystem);

	}

}
