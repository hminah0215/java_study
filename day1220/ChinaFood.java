class Father
{
	public void make(){
		System.out.println("�⺻¥���� ������");
	}
}

class Child extends Father
{
	public void make(){
		System.out.println("��¥���� ������");
	}
	public void service(){
		System.out.println("������ �������ѿ�");
	}
}

class  ChinaFood
{
	public static void main(String[] args) 
	{
		Father f = new Father();
		f.make();
		System.out.println();

		Father c = new Child();
		c.make();
		((Child)c).service();   
		//���������� �ƺ��̹Ƿ� �ڽ����� ĳ��������� ���񽺸� ��������.
	}
}