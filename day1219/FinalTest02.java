//��� �޼ҵ� �տ� �ִ� ���̳�
class Person
{
	final public void sayHello(){ //�����ؼ� �������̵� ������Ű�� ����!
		System.out.println("�ȳ��ϼ���.");
	}
}

class Student extends Person
{
	/*�̷��� ������ ����
	FinalTest02.java:12: error: sayHello() in Student cannot override sayHello() in
	Person
        public void sayHello(){
                    ^
	overridden method is final
	1 error
	*/
	public void sayHello(){ 
		System.out.println("�����ߺô�?");
	}
}
class  FinalTest02
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.sayHello();
	}
}
