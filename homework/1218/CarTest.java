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
		r = r +"���� ���ǵ��? : "+speed+"\n";
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
		r = r +"Ű�δ�?: "+kilo+"\n";
		r = r +"���ʹ�?: "+liter+"\n";
		r = r + "Ű��/���ʹ�?: "+kilosPerLiter;
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

/*����â���� 

���� ���ǵ��? : 50
Ű�δ�?: 10.0
���ʹ�?: 2.5
Ű��/���ʹ�?: 4.0
�̷��� ���� 

*/


