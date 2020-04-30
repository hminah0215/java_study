class A
{
	public void pro(){
		System.out.println("A의 pro입니다.");
	}
	public void test(){
		System.out.println("test 입니다.");
	}
}

class B extends A
{
	public void pro(){
		System.out.println("B의 pro입니다.");
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
