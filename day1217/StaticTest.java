class Family
{
	//���ٸ����� �����ϰ� static����
	public String name;
	public int age;
	public static String addr; 
	//Ŭ�������� : ��ü���ٰ������� ����ϴ� ������or��ü���̵� ����� ������
}


class  StaticTest
{
	public static void main(String[] args) 
	{
		Family.addr = "����� ���빮�� ȫ����"; //Ŭ�������� ����.�������� ����ϴ� �޸�
		
		Family f1 = new Family();
		Family f2 = new Family();
		f1.name = "�̼���";
		f1.age = 20;
		f2.name = "������";
		f2.age = 21;
		System.out.println(f1.name+"\t" + f1.addr);
		System.out.println(f2.name+"\t" + f2.addr);

		f1.addr = "�λ걤���� ���� �ż���";
		System.out.println(f1.name+"\t" + f1.addr);
		System.out.println(f2.name+"\t" + f2.addr);
		
		System.out.println("�츮������ �ּ�: " + Family.addr);
	}
}