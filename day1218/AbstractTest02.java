class A
{
	public void pro(){
		System.out.println("A�� pro�Դϴ�.");
	}
	public void test(){
		System.out.println("test �Դϴ�.");
	}
}

class B extends A
{
	public void pro(){
		System.out.println("B�� pro�Դϴ�.");
	}
}

class AbstractTest02
{
	public static void main(String[] args) 
	{
		B ob = new B();
		ob.pro();
		ob.test();
	}
}
