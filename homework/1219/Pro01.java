//숙제3. 인터페이스와 다형성 pdf 프로그래밍 1번 

interface Buyable
{
	public int getPrice();
}

class Television implements Buyable
{
	
	private String model;
	private String maker;
	private int price;

	public Television( String model, String maker, int price){
		this.model = model;
		this.maker = maker;
		this.price = price; 
	}
	
	public String getModel(){
		return model;
	}

	public int getPrice(){
		return price;
	}

	public String toString(){
		return "모델명: "+model+"\n"+"메이커: "+maker+"\n"+"가격: "+price; 
	}
	
}
	
	

class Refrigerator implements Buyable 
{
	private String model;
	private String maker;
	private int price;

	public Refrigerator( String model, String maker, int price){
		this.model = model;
		this.maker = maker;
		this.price = price; 
	}
	public String getModel(){
		return model;
	}

	public int getPrice(){
		return price;
	}
	public String toString(){
		return "모델명: "+model+"\n"+"메이커: "+maker+"\n"+"가격: "+price; 
	}
}



class  Pro01
{
	public static void main(String[] args) 
	{
		Television t = new Television("올레드","엘지",300);
		System.out.println(t);
		System.out.println();

		Refrigerator r = new Refrigerator("양문형","삼성",400);
		
		System.out.print(r.getModel());
		System.out.printf("%10d", r.getPrice());
		System.out.println();
		System.out.println();	
	
		Refrigerator r1 = new Refrigerator("비스포크","삼성",200);
		System.out.println(r1);
		
		/*
		private static void printPrice(){
		System.out.printf("%10d", item.getPrice());
	}		
	*/
	}
}
