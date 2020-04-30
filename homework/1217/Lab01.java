//13번을 못함. 
class Human
{
	protected String name;
	protected int age;
	protected String profession;

	//생성자
	public Human(String name, int age,String profession){
		this.name = name;
		this.age = age;
		this.profession = profession;
	}
	public Human(){
		
	}

	//설정자
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setProfession(String profession){
		this.profession = profession;
	}
	//접근자
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getProfession(){
		return profession;
	}

	//토스트링
	public String toString(){
		return name+","+age+"세,"+profession;
	}
	

}

class Student extends Human
{
	private String major;

	//생성자 
	public Student( String name, int age, String profession, String major){
		super(name, age, profession);
		this.major = major;
	}
	public Student(){
		
	}

	//설정자, 접근자
	public void setMajor( String major ){
		this.major = major;
	}
	public String getMajor(){
		return major;
	}

	//투스트링_부모에있는 투스트링 부르기!
		public String toString(){
		return super.toString()+","+major;	
	}
}


class Lab01 
{
	public static void main(String[] args) 
	{
		Human h1 = new Human("춘향",18,"학생");
		Human h2 = new Human("몽룡",21,"암행어사");
		Human h3 = new Human("사또",50,"탐관오리");
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
				System.out.println();
		Student s1 = new Student("명진",21,"학생","컴퓨터");
		Student s2 = new Student("미현",22,"백수","경영");
		Student s3 = new Student("용준",24,"자영업","경제");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		//변수선언은 휴먼에서 했지만 메소드는 자식에서 돌아감 
		//System.out.println(s1.getProfession());

	}
}
