class Family
{
	//���ٸ����� �����ϰ� static����
	public String name;
	public int age;
	//�� �ΰ��� �Ϲݸ��
	public static String addr; //static������ ��������̴ϱ� private�� ������� �ʰ� public! 
	//Ŭ�������� : ��ü���ٰ������� ����ϴ� ������or��ü���̵� ����� ������
	
	//������
	public Family(String name, int age ){
		this.name = name;
		this.age = age;
	}
	
	//�Ϲݸ޼ҵ� : ��ü�� �����ϰ�, ��ü�ȿ����� �۵�
	public void info(){
		System.out.println(name+","+age+","+addr);
	}

	//Ŭ�����޼ҵ� : ��ü���̵� ������ ��밡�� 
	public static void move(){
		addr = "����� ������ �ż���";
		System.out.println("�츮���� �̻簩�ϴ�.\n" + addr);
		//name = "ȫ�浿"; ==>Stactic�޼ҵ� �ȿ����� static������� ������ �� �ִ�.
		//age =50;					�׷��� �� �ΰ��� �ȵ�.
	}
}


class  StaticTest02
{
	public static void main(String[] args) 
	{
		/*
		Family.addr = "����� ���빮�� ȫ����"; //Ŭ�������� ����.�������� ����ϴ� �޸�
		
		Family f1 = new Family("�̼���",20);
		Family f2 = new Family("�̿���",23);
		
		f1.info();
		f2.info();   */

		Family.move();
		
		
		
	}
}