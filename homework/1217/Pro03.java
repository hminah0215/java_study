class Book
{
	protected String title;
	protected int pages;
	protected String author;

	//생성자 
	public Book(String title, int pages, String author){
		this.title = title;
		this.pages = pages;
		this.author = author;
	}
	public Book(){
		
	}
	//설정자 
	public void setTitle(String title){
		this.title = title;
	}
	public void setPages(int pages){
		this.pages = pages;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	//접근자 
	public String getTitle(){
		return title;
	}
	public int getPages(){
		return pages;
	}
	public String getAuthor(){
		return author;
	}

	//투스트링 
	public String toString(){
		return title+","+pages+","+author;
	}

}


class Pro03 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
