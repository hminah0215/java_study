class Movie
{
	private String title;
	private String director;
	private String madeBy;
	

	//생성자
	public Movie(String title, String director,String madeBy){
	this.title = title;
	this.director = director;
	this.madeBy = madeBy;
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
	
	public void setMadeBy( String madeBy ){
		this.madeBy = madeBy;
	}
	

	//접근자 get
	public String getTitle( ){
		return title;
	}
	public String getDirector( ){
		return director;
	}
	public String getMadeBy( ){
		return madeBy;
	}
	
	//출력하기 편하게 
	public void info(){
		System.out.println("영화제목: " + title );
		System.out.println("감독이름: " + director );
		System.out.println("제작사: " + madeBy +"\n" );
		
	}
	
}

class  Pro4
{
	public static void main(String[] args) 
	{
		Movie m = new Movie("겨울왕국","크리스 벅","디즈니");
		m.info();
		
		Movie m2 = new Movie();
		m2.info();

				
	}
}
