//인터페이스와 다형성 pdf 프로그래밍 10번 
import java.util.Scanner;

abstract class Book
{
	protected int number;
	protected String title;
	protected String author;
	
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

class  BookTest02
{
	public static void main(String[] args) 
	{
		Book[] arr = new Book[5];
		arr[0] = new Novel(100, "수인아 놀자", "이원우");
		arr[1] = new Novel(101, "재미있는 자바","이원우");
		arr[2] = new Novel(102, "즐거운 자바","한주련");
		arr[3] = new Poet(200, "즐거운 인생","이원우");
		arr[4] = new ScienceFiction(300,"자바의 미래","서동욱");
		
		Scanner sc = new Scanner(System.in);
		
		int searchNumber;

		System.out.print("찾을 도서번호를 입력하세요==>");
		searchNumber = sc.nextInt();
		//배열 순회시에는 for each문이 더 자주쓰임. 이걸로 하다가...
		//찾았으니 탈출해줘야해서 인덱스로 ....!
		int i;
		for( i =0; i < arr.length ; i++ ){
			if( searchNumber == arr[i].getNumber() ){
				System.out.println("도서를 찾았습니다.");
				System.out.println(arr[i]);
				break;
			}
		}
		if( i == arr.length ){ //찾는책이 없었을때까지 for를 끝까지 돌았는지!
			System.out.println("찾는 도서가 없습니다.");
		}
	}
}
