//�������̽��� ������ pdf ���α׷��� 10�� 
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
		arr[0] = new Novel(100, "���ξ� ����", "�̿���");
		arr[1] = new Novel(101, "����ִ� �ڹ�","�̿���");
		arr[2] = new Novel(102, "��ſ� �ڹ�","���ַ�");
		arr[3] = new Poet(200, "��ſ� �λ�","�̿���");
		arr[4] = new ScienceFiction(300,"�ڹ��� �̷�","������");
		
		Scanner sc = new Scanner(System.in);
		
		int searchNumber;

		System.out.print("ã�� ������ȣ�� �Է��ϼ���==>");
		searchNumber = sc.nextInt();
		//�迭 ��ȸ�ÿ��� for each���� �� ���־���. �̰ɷ� �ϴٰ�...
		//ã������ Ż��������ؼ� �ε����� ....!
		int i;
		for( i =0; i < arr.length ; i++ ){
			if( searchNumber == arr[i].getNumber() ){
				System.out.println("������ ã�ҽ��ϴ�.");
				System.out.println(arr[i]);
				break;
			}
		}
		if( i == arr.length ){ //ã��å�� ������������ for�� ������ ���Ҵ���!
			System.out.println("ã�� ������ �����ϴ�.");
		}
	}
}