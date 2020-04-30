//13���� ����. 
class Human
{
	protected String name;
	protected int age;
	protected String profession;

	//������
	public Human(String name, int age,String profession){
		this.name = name;
		this.age = age;
		this.profession = profession;
	}
	public Human(){
		
	}

	//������
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setProfession(String profession){
		this.profession = profession;
	}
	//������
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getProfession(){
		return profession;
	}

	//�佺Ʈ��
	public String toString(){
		return name+","+age+"��,"+profession;
	}
	

}

class Student extends Human
{
	private String major;

	//������ 
	public Student( String name, int age, String profession, String major){
		super(name, age, profession);
		this.major = major;
	}
	public Student(){
		
	}

	//������, ������
	public void setMajor( String major ){
		this.major = major;
	}
	public String getMajor(){
		return major;
	}

	//����Ʈ��_�θ��ִ� ����Ʈ�� �θ���!
		public String toString(){
		return super.toString()+","+major;	
	}
}


class Lab01 
{
	public static void main(String[] args) 
	{
		Human h1 = new Human("����",18,"�л�");
		Human h2 = new Human("����",21,"������");
		Human h3 = new Human("���",50,"Ž������");
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
				System.out.println();
		Student s1 = new Student("����",21,"�л�","��ǻ��");
		Student s2 = new Student("����",22,"���","�濵");
		Student s3 = new Student("����",24,"�ڿ���","����");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		//���������� �޸տ��� ������ �޼ҵ�� �ڽĿ��� ���ư� 
		//System.out.println(s1.getProfession());

	}
}