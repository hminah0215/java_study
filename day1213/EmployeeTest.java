class Employee{
	private String name;
	private String cellNum;
	private int salary;
	
	//��� �޼ҵ�
	public void print(){
		System.out.println("�̸�: " + name);
		System.out.println("��ȭ��ȣ: " + cellNum);
		System.out.println("����: " + salary);
	}

	//������
	public Employee(){
		name = "ȫ�浿";
		cellNum ="000-000-0000";
		salary = 200;
	}
	public Employee( String name, String cellNum, int salary){
		this.name = name;
		this.cellNum = cellNum;
		this.salary = salary;
	}

	//������ 
	public void setName( String name ){
		this.name = name;
	}

	public void setCellNum( String cellNum ){
		this.cellNum = cellNum;
	}
	
	public void setSalary( int salary  ){
		this.salary = salary ;
	}
	
	//������
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
		 Employee e2 = new  Employee( "�̿���","010-123-4567", 300 );
		
		 System.out.println("������ ����" );
		 e1.print();
		 System.out.println();
		 e2.print();
	
	}
}