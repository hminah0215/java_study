abstract class Vehicle
{
	protected int speed;
	
	public Vehicle(int speed){
		this.speed = speed;
	}
	public abstract double getKilosPerLiter();
	
	public  void printSpeed( int speed ){
		this.speed = speed;
	}
	public  void printSpeed(){
	}

	public void setSpeed( int speed ){
		this.speed = speed;
	}
	public int getSpeed(){
		return speed;
	}

	public String toString(){
		String r = "";
		r = r +"현재 스피드는? : "+speed+"\n";
		return r;
	}
}

class Car extends Vehicle
{
	private double  kilosPerLiter;
	private double kilo;
	private double liter;

	
	public Car( int speed, double kilo, double liter){
		super(speed);
		this.kilo = kilo;
		this.liter = liter;
	}

	
	public void setKilo( double kilo ){
		this.kilo = kilo;
	}
	public void setLiter( double Liter ){
		this.liter = liter;
	}

	public void kilosPerLiter(){
		kilosPerLiter = kilo / liter;
	}

	public double getKilosPerLiter(){
		return kilosPerLiter;
	}
	public double getKilo(){
		return kilo;
	}
	public double Liter(){
		return liter;
	}
	public String toString(){
		String r = "";
		r = r +super.toString();
		r = r +"키로는?: "+kilo+"\n";
		r = r +"리터는?: "+liter+"\n";
		r = r + "키로/리터는?: "+kilosPerLiter;
		return r;
	}
}


public class CarTest
{
	public static void main(String args[]){

		Car c1 = new Car(50, 10.0, 2.5);
		c1.kilosPerLiter();
		System.out.println(c1);
	}
}

/*실행창에서 

현재 스피드는? : 50
키로는?: 10.0
리터는?: 2.5
키로/리터는?: 4.0
이렇게 나옴 

*/



