interface A
{
	public void pro();
}

interface B //인터페이스는 완전추상. abstract생략
{
	public void info();
}

class C implements A, B 
{
	public void pro(){
		System.out.println("pro입니다.");
	}
	public void info(){
		System.out.println("info입니다.");
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
