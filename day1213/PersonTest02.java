class Person{	
	private String name;
	private String gender;
	private int age;
	
	public void setName(	String n ){
		name= n;
	}

	public String getName( ){
		return name;
	}
	
	public String getGender(){
		return gender;
	}
	
	public void setGender(  String g ){
		gender = g;
	}

	public void setAge( int a){
		age = a;
	}

	public int getAge(){
		return age;
	}

	public void eat( String food ){
		System.out.println( gender + "," + age+"��" + name +" ��(��)" +food +"��(��)�Ծ��");
	}
	 public void sleep(){
		System.out.println(name + "��(��) ����~ �ڿ�~");
	 }
}




class PersonTest02 
{
	public static void main(String[] args) 
	{
		Person p = new Person();
		//p.name = "�ֿ���";
		p.setName("�ֿ���");
		p.setGender("����");
		p.setAge(20);
		p.eat(" ���� ");
		p.sleep();
		//System.out.println( p.getName() );
		//System.out.println( p.getGender() );
		//System.out.println ( p.getAge() );
	}
}
