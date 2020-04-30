//pdf 상속 프로그래밍 1번 
class Employee
{
	protected String name;
	protected String no;

	//생성자
	public Employee(String name, String no){
		this.name =name;
		this.no = no;
	}
	public Employee(){
		
	}
	//설정자
	public void setName(String name){
		this.name = name;
	}
	public void setNo(String no){
		this.no = no;
	}
	//접근자 
	public String getName(){
		return name;
	}
	public String getNo(){
		return no;
	}
	// computeSalary()를 구현하라. 

}



class  Pro01
{
	public static void main(String[] args) 
	{
		
	}
}
