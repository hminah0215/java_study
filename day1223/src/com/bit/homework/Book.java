package com.bit.homework;


public class Book {
		private String bookNo;			//도서번호
		private String title;			//도서명
		private String author;			//저자
		private int price;			//가격
		private String company;			//출판사
		
		public Book(String bookNo, String title, String author, int price, String company) {
			super();
			this.bookNo = bookNo;
			this.title = title;
			this.author = author;
			this.price = price;
			this.company = company;
		}
		public String getBookNo() {
			return bookNo;
		}
		public void setBookNo(String bookNo) {
			this.bookNo = bookNo;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
	}

