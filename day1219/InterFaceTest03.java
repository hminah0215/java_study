abstract class A
{
	abstract public void pro();
}

interface B //인터페이스는 완전추상. abstract생략
{
	public void info();
}

class C extends A implements B //내가만드는 c는 a를 확장하고 b를 구현한다.
{
	public void pro(){
		System.out.println("pro입니다.");
	}
	public void info(){
		System.out.println("info입니다.");
	}
}



class InterFaceTest03
{
	public static void main(String[] args) 
	{
		C ob = new C();
		ob.info();
		ob.pro();
	}
}
