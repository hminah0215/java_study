class Singer{
	private	String name;
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	
	public void sing(){
		System.out.println(name+"이(가) 노래를 불러요.");
	}
}


class  SingerTest
{
	public static void main(String[] args) 
	{
		Singer s = new Singer();
		s.setName("박유철");
		s.sing();
	}
}
