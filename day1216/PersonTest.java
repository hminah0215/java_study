class Person
{
	private String name;
	private int age;
	private boolean aa;
	
	public void info(){
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		System.out.println("�Ҹ�: " + aa);
	}
}



class PersonTest 
{
	public static void main(String[] args) 
	{
		Person p = new Person(); //�����ڸ� ������ �ʾƵ� �⺻�����ڰ� �����ȴ�. 
		//�⺻�����ڴ� �Ű������� ����, ����Ÿ�Կ� ���� �ʱ�ȭ�ȴ�. 
		//�����ڰ� �Ѱ��� ������ �⺻�����ڴ� �������� �ʴ´�. 
		//�����ڰ� ������� ������ �����Ϸ��� �⺻ �����ڸ� �߰��Ѵ�.
		p.info(); //�̸� : null
					 //���� : 0 ���� ��µ�.
					 //�Ҹ� : flase �� ��µ�
	}
}
