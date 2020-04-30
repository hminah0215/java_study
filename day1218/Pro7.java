class Student
{
	protected String name;	//�̸�
	protected String number;	//�й�
	protected String major;	//�Ҽ��а�
	protected String grade;	//�г�
	protected String score;	//�̼�����

	public Student(String name, String number, String major
							, String grade, String score){
		this.name = name;
		this.number = number;
		this.major = major;
		this.grade = grade;
		this.score = score;
	}
	public Student(){		
	}

	//������ 
	public String getName(){
		return name;
	}
	public String getNumber(){
		return number;
	}
	public String getMajor(){
		return major;
	}
	public String getGrade(){
		return grade;
	}
	public String getScore(){
		return score;
	}

	//������ 
	public void  setName(){
		this.name = name;
	}
	public void  setNumber(){
		this.number = number;
	}
	public void  setMajor(){
		this.major = major;
	}
	public void setGrade(){
		this.grade = grade;
	}
	public void  setScore(){
		this.score = score;
	}

	public String toString(){
		return "�̸�: "+name +", �й�: "+ number +", �а�: "+ major +
					", �г�: "+ grade +", �̼�����: "+ score ;
		/*
		String r ="";
		r = r+"�̸� :" + name+ "\n";
		r = r+"�й� :" + number+ "\n";
		r = r+"�а� :" +major+ "\n";
		r = r+"�г� :" + grade+ "\n";
		r = r+"�̼����� :" + score+ "\n";
		return r;   

		�̷������� r�� ������ �����ؼ� ����Ʈ���� ����ص� ��.
		*/
	}
}

class UnderGraduate extends Student
{
	private String hr;	//���Ƹ���

	public UnderGraduate(String name, String number, String major, String grade
										,String score, String hr){
		super( name, number, major, grade, score);
		this.hr = hr;
	}
	public UnderGraduate(){
		
	}
	public String getHr(){
		return hr;
	}
	public void setHr(){
		this.hr = hr;
	}
	public String toString(){
		return super.toString() +", ���Ƹ���: "+hr;
		/*
		String r = "" ;
		r = r + super.toString();
		r = r +"���Ƹ�:" + hr;
		return r;
		*/
	}
}


class Graduate extends Student
{
	private String jo;	//��������(��������, ��������)
	private double scolar;	//���бݺ���

	public Graduate(String name, String number, String major, String grade
								,String score, String jo, double scolar){
		super( name, number, major, grade, score);
		this.jo = jo;
		this.scolar = scolar;
	}
	public Graduate(){
		
	}
	public String getJo(){
		return jo;
	}
	public double getScolar(){
		return scolar;
	}
	public void setJo(){
		this.jo = jo;
	}
	public void setScolar(){
		this.scolar = scolar;
	}
	public String toString(){
		return super.toString() + ", ��������: " +jo+", ���бݺ���: "+scolar;
		/*
		String r = "\n" ;
		r = r + super.toString();
		r = r +"��������:" + jo+ "\n";
		r= r + "���б� ����:" + scolar + "\n";
		return r;
		*/
	}
}



class Pro7
{
	public static void main(String[] args) 
	{
		UnderGraduate u1 = new UnderGraduate( "����","222", "�濵","2"
																					,"60", "��嵿�Ƹ�");
		Graduate g1 = new Graduate("����","025","����","4","115","��������",0.5);
		System.out.println(u1);
		System.out.println(g1);

	}
}
