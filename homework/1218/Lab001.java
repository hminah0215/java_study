abstract class Vehicle
{
	protected int speed;

	public abstract double getKilosPerLiter();
	
	public  printSpeed( int speed ){
		this.speed = speed;
	}
	public String toString(){
		String r = "";
		r = r +"���� ���ǵ��? : "+speed+"\n";
		return r;
	}

}



class Lab001
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
