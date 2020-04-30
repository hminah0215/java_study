class Movie
{
	private String title;
	private String director;
	private String actors;
	private String open_date;
	private String madeBy;
	private double rate;
	private int runningTime;

	//������
	public Movie(String title, String director,String actors, String open_date,String madeBy,
						double rate,int runningTime){
	this.title = title;
	this.director = director;
	this.actors = actors;
	this.open_date = open_date;
	this.madeBy = madeBy;
	this.rate = rate;
	this.runningTime = runningTime;
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
	public void setActors( String actors ){
		this.actors = actors;
	}
	public void setOpen_date( String open_date ){
		this.open_date = open_date;
	}
	public void setMadeBy( String madeBy ){
		this.madeBy = madeBy;
	}
	public void setRate( double rate ){
		this.rate = rate;
	}
	public void setRunningTime( int runningTime ){
		this.runningTime = runningTime;
	}

	//������ get
	public String getTitle( ){
		return title;
	}
	public String getDirector( ){
		return director;
	}
	public String getActors( ){
		return actors;
	}
	public String getOpen_date( ){
		return open_date;
	}
	public String getMadeBy( ){
		return madeBy;
	}
	public double getRate( ){
		return rate;
	}
	public int getRunningTime( ){
		return runningTime;
	}
	
	//����ϱ� ���ϰ� 
	public void info(){
		System.out.println("��ȭ����: " + title );
		System.out.println("�����̸�: " + director );
		System.out.println("�ֿ����: " + actors );
		System.out.println("������¥: " + open_date );
		System.out.println("���۱���: " + madeBy );
		System.out.println("����: " + rate );
		System.out.println("�󿵽ð�: " +  runningTime + "��");		
	}
	
}

class  MovieTest
{
	public static void main(String[] args) 
	{
		Movie m = new Movie("�ܿ�ձ�","ũ���� ��","����","2019/11/21","�̱�",8.93,103);
		m.info();

				
	}
}
