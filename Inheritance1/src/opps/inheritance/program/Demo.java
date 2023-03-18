package opps.inheritance.program;

class Bicycle
{
	public int gear;
	public int speed;
	
	public Bicycle(int gear,int speed)//Parameterized constructor
	{
		this.gear=gear;
		this.speed=speed;
	}
	
	public void applyBreak(int decrement)
	{
		speed -= decrement;
	}
	public void seepdUp(int increment)
	{
		speed += increment;
	}
	
	public String toString()
	{
		return ("no of gear = "+gear+ "speed of bicycle is = "+speed);
	}
	
}

class MountainBike extends Bicycle
{
	public int seatHeight;
	public MountainBike(int gear,int speed,int seatHeight)
	{
		super(gear,speed);
		this.seatHeight=seatHeight;
		
	}
	public void setHeight(int newvalue)
	{
		seatHeight=newvalue;
	}
	@Override
	public String toString() {
		return (super.toString()+"\n seatHeight is = "+seatHeight);
	}
	
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike mb = new MountainBike(3,100,25);
		System.out.println(mb.toString());
		

}
}

