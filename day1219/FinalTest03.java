//클래스 앞에 있는 파이널
final class Person 
/* 상속금지
FinalTest03.java:9: error: cannot inherit from final Person
class Student extends Person
*/
{
	 public void sayHello(){ 
		System.out.println("안녕하세요.");
	}
}

class Student extends Person
{
	
	public void sayHello(){ 
		System.out.println("시험잘봤니?");
	}
}
class  FinalTest03
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.sayHello();
	}
}
