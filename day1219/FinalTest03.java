//Ŭ���� �տ� �ִ� ���̳�
final class Person 
/* ��ӱ���
FinalTest03.java:9: error: cannot inherit from final Person
class Student extends Person
*/
{
	 public void sayHello(){ 
		System.out.println("�ȳ��ϼ���.");
	}
}

class Student extends Person
{
	
	public void sayHello(){ 
		System.out.println("�����ߺô�?");
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
