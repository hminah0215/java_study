class Employee{
	private String name;
	private String cellNum;
	private int salary;
	
	//출력 메소드
	public void print(){
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + cellNum);
		System.out.println("월급: " + salary);
	}

	//생성자
	public Employee(){
		name = "홍길동";
		cellNum ="000-000-0000";
		salary = 200;
	}
	public Employee( String name, String cellNum, int salary){
		this.name = name;
		this.cellNum = cellNum;
		this.salary = salary;
	}

	//설정자 
	public void setName( String name ){
		this.name = name;
	}

	public void setCellNum( String cellNum ){
		this.cellNum = cellNum;
	}
	
	public void setSalary( int salary  ){
		this.salary = salary ;
	}
	
	//접근자
	public String getName(){
		return name;
	}

	public String getCellNum(){
		return cellNum;
	}

	public int getSalary(){
		return salary;
	}

}



class  EmployeeTest
{
	public static void main(String[] args) 
	{
		 Employee e1 = new  Employee();
		 Employee e2 = new  Employee( "이원우","010-123-4567", 300 );
		
		 System.out.println("직원의 정보" );
		 e1.print();
		 System.out.println();
		 e2.print();
	
	}
}
