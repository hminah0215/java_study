abstract class Bird
{
	public abstract void sound();
}

class Dove extends Bird
{
	public void sound(){
		System.out.println("coo coo");
	}

}

class  BirdTest
{
	public static void main(String[] args) 
	{
		//Bird a = new Bird(); ��ü�� �����ϴ� ���� �߻�Ŭ������ ��üȭ �� �� ����.
		Bird b = new Dove();
		b.sound();

		//Bird b[] = new Bird[5]; 
		//���带 ������ ����(��ü��������)�� 5�� ����°��̶� ����.
	}
}
