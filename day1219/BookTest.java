//인터페이스와 다형성 pdf 프로그래밍 10번 

abstract class Book
{
	protected int number;
	protected String title;
	protected String author;
	
	public Book( int number, String title, String author){
		this.number = number;
		this.title = title;
		this.author = author;
	}
	public String toString(){
		return number +","+ title + ","+ author ;
	}

	public boolean equals(Object obj){
		Book b =(Book)obj;
		if( number == b.number){
			return true;
		}else{
			return false;
		}
	}

	abstract public int getLateFees(int days);
}

class Novel extends Book
{	
	public int getLateFees(int days){
		return 300 * days;
	}
	public Novel( int number, String title, String author){
		super( number, title, author );
	}
}

class Poet extends Book
{
	public int getLateFees(int days){
		return 200 * days;
	}
	public Poet( int number, String title, String author){
		super( number, title, author );
	}
}

class ScienceFiction extends Book
{
	public int getLateFees(int days){
		return 600 * days;
	}
	public ScienceFiction( int number, String title, String author){
		super( number, title, author );
	}
}

class  BookTest
{
	public static void main(String[] args) 
	{
		Novel  n1 = new Novel(100, "자바와 놀자", "이수인");
		Poet p1 = new Poet(200,"즐겁게 살자 ","이원우");	
		
		System.out.println(n1 + ",연체료:" + n1.getLateFees(2));
		System.out.println(p1 + ",연체료:" + p1.getLateFees(2));

		Poet p2 = new Poet(200,"즐겁게 살자 ","이원우"); //같은책인지 비교.
		if(p1.equals(p2)){
			System.out.println("같은 책 입니다.");
		}else{
			System.out.println("다른 책 입니다.");
		}
	}
}
