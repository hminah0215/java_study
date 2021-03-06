//인터페이스와 다형성 pdf 프로그래밍 10번 
import java.util.Scanner;

 class Book
{
	protected int number;
	protected String title;
	protected String author;
	
	public boolean equals( Object obj ){
		Book b = (Book)obj; 
		if(number == b.number){
			return true;
		}else{
			return false;
		}
	}
	public int getNumber(){
		return number;
	}
	public Book( int number, String title, String author){
		this.number = number;
		this.title = title;
		this.author = author;
	}
	public String toString(){
		return number +","+ title + ","+ author ;
	}	
}



class  BookTest03
{
	public static void main(String[] args) 
	{
		Book b1 = new Book(100,"재미있는 자바","이원우");
		Book b2 = new Book(100,"재미있는 자바","이원식");
		

		if( b1.equals(b2) ){
			System.out.println("같은 책 입니다.");
		}else{
			System.out.println("다른책입니다.");
		}
	}
}