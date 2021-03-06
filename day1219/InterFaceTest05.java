class Person
{
	public void sayHello(){
		System.out.println("안녕");
	}
}

interface A
{
	public void pro();
}

interface B //인터페이스는 완전추상. abstract생략
{
	public void info();
}

class C extends Person implements A, B //extends는 1개만 implements는 여러개가능
{
	public void pro(){
		System.out.println("pro입니다.");
	}
	public void info(){
		System.out.println("info입니다.");
	}
}



class InterFaceTest05
{
	public static void main(String[] args) 
	{
		C ob = new C();
		ob.info();
		ob.pro();
		ob.sayHello();
	}
}
