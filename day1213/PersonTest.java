/*
��� Person
	�Ӽ� 
			�̸�		String name;       "�̼���"
			����		String gender ;   "����", "����"
			����		int age;			20

	����
	
		      �Դ´�	void eat (String food)
		      �����ܴ�	void sleep()
*/

class Person{    //���ο� �ڷ��� �����

	String name;
	String gender;			//�Ӽ� : �������
	int age;

	void eat( String food ){			//���� : ����޼ҵ�
		System.out.println("������ " + gender + "�̰� ���̰� " + age + " �� �� "+ name +
										"��(��) " + food +" ��(��) �Ծ��.");
	}													
	void sleep( ){
		System.out.println(name + "��(��) ����~ �ڿ�~");
	}
}   //Ŭ������ �����ߴ�. 



class  PersonTest
{
	public static void main(String[] args) 
	{
		Person p = new Person( );  //Ŭ������ ��ü�� ����
		p.name = "�ֿ���";
		p.age = 28;
		p.gender = "����";
		p. eat("����");
		p.sleep();
	}
}
