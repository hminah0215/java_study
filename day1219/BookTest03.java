//�������̽��� ������ pdf ���α׷��� 10�� 
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
		Book b1 = new Book(100,"����ִ� �ڹ�","�̿���");
		Book b2 = new Book(100,"����ִ� �ڹ�","�̿���");
		

		if( b1.equals(b2) ){
			System.out.println("���� å �Դϴ�.");
		}else{
			System.out.println("�ٸ�å�Դϴ�.");
		}
	}
}