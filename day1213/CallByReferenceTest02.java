class Person  {  //����� ���� �ڷ���! ���ο� �ڷ����� �������. 

	String name;
	int age;

}

class  CallByReferenceTest02
{

	//Person�� �Ű������� ���޹޾� ���̸� 1�����ϴ� �޼ҵ带 ���� 
	public static void plus(Person p){
		p.age = p.age +1;
	}
	public static void main(String[] args) 
	{
		Person suin = new Person(); //���⼭ suin �� ��ü��������
		suin.name = "�̼���"; //suin�� �ٶ󺸰� �ִ� ���� �ִ� �̸��� �̼��������ض�.
		suin.age = 20; //suin�� �ٶ󺸰� �ִ� ���� �ִ� ���̸� 20���� �ض�. 

		plus( suin );  //������ ���� ȣ��.
		System.out.println(suin.name);
		System.out.println(suin.age);

	}
}
