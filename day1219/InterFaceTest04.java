interface A
{
	public void pro();
}

interface B //�������̽��� �����߻�. abstract����
{
	public void info();
}

class C implements A, B 
{
	public void pro(){
		System.out.println("pro�Դϴ�.");
	}
	public void info(){
		System.out.println("info�Դϴ�.");
	}
}



class InterFaceTest04
{
	public static void main(String[] args) 
	{
		C ob = new C();
		ob.info();
		ob.pro();
	}
}
