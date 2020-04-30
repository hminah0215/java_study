//pdf 상속 프로그래밍 1번 
abstract class Employee
{
	protected String name;
	protected String no;
		
	
	public Employee(String name, String no){
		this.name = name;
		this.no = no;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setNo(String no){
		this.no = no;
	}

	public String getName(){
		return name;
	}
	public String getNo(){
		return no;
	}

	public String toString(){
		String r = "";
		r = r +"이름: "+name+"\n";
		r = r +"사번: "+no+"\n";
		return r;
	}
	 public abstract void computeSalary();
}

class SalariedEmployee extends Employee
{
	private int salary;

	public SalariedEmployee(String name, String no, int salary){
		super(name, no);
		this.salary = salary;
	}
	public void setSalary(int salary){
		this.salary = salary;
	}
	public int getSalary(){
		return salary;
	}
	public String toString(){
		String r = "";
		r = r +super.toString();
		r = r +"급여: "+salary+"\n";
		return r;
	}

	public void computeSalary(){
		salary = salary;
	}

}

class HourlyEmployee extends Employee
{
	protected int pay;
	private int per;
	private int hour;

	public HourlyEmployee( String name, String no,int per, int hour ){
		super(name, no);
		this.per = per;
		this.hour = hour;
		
	}

	public void setPer(int per){
		this.per = per;
	}
	public void setHour(int hour){
		this.hour = hour;
	}
	
	public int getPer(){
		return per;
	}
	public int getHour(){
		return hour;
	}
	
	public String toString(){
		String r = "";
		r = r +super.toString();
		r = r +"시간당 임금: "+per+"\n";
		r = r +"일한 시간: "+hour+"\n";
		r = r + "일 급여: "+pay;
		return r;
	}
	public void computeSalary(){
		pay = per * hour;
	}
}


class  Pro1
{
	public static void main(String[] args) 
	{
		SalariedEmployee s1 = new SalariedEmployee("민아", "19999", 500);
		HourlyEmployee h1 = new HourlyEmployee("현경","21111", 20, 5 );
		
		s1.computeSalary();
		h1.computeSalary();

		System.out.println(s1);
		System.out.println(h1);
		
	}
}
