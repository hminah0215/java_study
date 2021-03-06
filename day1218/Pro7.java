class Student
{
	protected String name;	//이름
	protected String number;	//학번
	protected String major;	//소속학과
	protected String grade;	//학년
	protected String score;	//이수학점

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

	//접근자 
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

	//설정자 
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
		return "이름: "+name +", 학번: "+ number +", 학과: "+ major +
					", 학년: "+ grade +", 이수학점: "+ score ;
		/*
		String r ="";
		r = r+"이름 :" + name+ "\n";
		r = r+"학번 :" + number+ "\n";
		r = r+"학과 :" +major+ "\n";
		r = r+"학년 :" + grade+ "\n";
		r = r+"이수학점 :" + score+ "\n";
		return r;   

		이런식으로 r에 내용을 저장해서 투스트링을 사용해도 됨.
		*/
	}
}

class UnderGraduate extends Student
{
	private String hr;	//동아리명

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
		return super.toString() +", 동아리명: "+hr;
		/*
		String r = "" ;
		r = r + super.toString();
		r = r +"동아리:" + hr;
		return r;
		*/
	}
}


class Graduate extends Student
{
	private String jo;	//조교유형(교육조교, 연구조교)
	private double scolar;	//장학금비율

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
		return super.toString() + ", 조교유형: " +jo+", 장학금비율: "+scolar;
		/*
		String r = "\n" ;
		r = r + super.toString();
		r = r +"조교유형:" + jo+ "\n";
		r= r + "장학금 비율:" + scolar + "\n";
		return r;
		*/
	}
}



class Pro7
{
	public static void main(String[] args) 
	{
		UnderGraduate u1 = new UnderGraduate( "에릭","222", "경영","2"
																					,"60", "밴드동아리");
		Graduate g1 = new Graduate("경훈","025","과학","4","115","연구조교",0.5);
		System.out.println(u1);
		System.out.println(g1);

	}
}
