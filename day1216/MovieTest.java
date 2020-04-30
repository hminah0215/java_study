class Movie
{
	private String title;
	private String director;
	private String actors;
	private String open_date;
	private String madeBy;
	private double rate;
	private int runningTime;

	//생성자
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

	//설정자 set
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

	//접근자 get
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
	
	//출력하기 편하게 
	public void info(){
		System.out.println("영화제목: " + title );
		System.out.println("감독이름: " + director );
		System.out.println("주연배우: " + actors );
		System.out.println("개봉날짜: " + open_date );
		System.out.println("제작국가: " + madeBy );
		System.out.println("평점: " + rate );
		System.out.println("상영시간: " +  runningTime + "분");		
	}
	
}

class  MovieTest
{
	public static void main(String[] args) 
	{
		Movie m = new Movie("겨울왕국","크리스 벅","엘사","2019/11/21","미국",8.93,103);
		m.info();

				
	}
}
