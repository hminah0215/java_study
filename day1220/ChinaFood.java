class Father
{
	public void make(){
		System.out.println("기본짜장을 만들어요");
	}
}

class Child extends Father
{
	public void make(){
		System.out.println("간짜장을 만들어요");
	}
	public void service(){
		System.out.println("고객을 감동시켜요");
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
		//참조변수가 아빠이므로 자식으로 캐스팅해줘야 서비스를 쓸수있음.
	}
}
