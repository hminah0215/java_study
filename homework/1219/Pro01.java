//����3. �������̽��� ������ pdf ���α׷��� 1�� 

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
		return "�𵨸�: "+model+"\n"+"����Ŀ: "+maker+"\n"+"����: "+price; 
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
		return "�𵨸�: "+model+"\n"+"����Ŀ: "+maker+"\n"+"����: "+price; 
	}
}



class  Pro01
{
	public static void main(String[] args) 
	{
		Television t = new Television("�÷���","����",300);
		System.out.println(t);
		System.out.println();

		Refrigerator r = new Refrigerator("�繮��","�Ｚ",400);
		
		System.out.print(r.getModel());
		System.out.printf("%10d", r.getPrice());
		System.out.println();
		System.out.println();	
	
		Refrigerator r1 = new Refrigerator("����ũ","�Ｚ",200);
		System.out.println(r1);
		
		/*
		private static void printPrice(){
		System.out.printf("%10d", item.getPrice());
	}		
	*/
	}
}