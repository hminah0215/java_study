class Movie
{
	private String title;
	private String director;
	private String madeBy;
	

	//������
	public Movie(String title, String director,String madeBy){
	this.title = title;
	this.director = director;
	this.madeBy = madeBy;
     }

	public Movie(){
	
	}

	//������ set
	public void setTitle( String title ){
		this.title = title;
	}
	public void setDirector( String director ){
		this.director = director;
	}
	
	public void setMadeBy( String madeBy ){
		this.madeBy = madeBy;
	}
	

	//������ get
	public String getTitle( ){
		return title;
	}
	public String getDirector( ){
		return director;
	}
	public String getMadeBy( ){
		return madeBy;
	}
	
	//����ϱ� ���ϰ� 
	public void info(){
		System.out.println("��ȭ����: " + title );
		System.out.println("�����̸�: " + director );
		System.out.println("���ۻ�: " + madeBy +"\n" );
		
	}
	
}

class  Pro4
{
	public static void main(String[] args) 
	{
		Movie m = new Movie("�ܿ�ձ�","ũ���� ��","�����");
		m.info();
		
		Movie m2 = new Movie();
		m2.info();

				
	}
}