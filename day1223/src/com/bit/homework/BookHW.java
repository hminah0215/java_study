package com.bit.homework;

import java.util.ArrayList;
import java.util.Scanner;

import com.bit.exam08.Student;
// 도서 등록,수정, 삭제, 목록출력 다 되는데... 정렬을 못함 

public class BookHW {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Book> list = new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);
		
		int menu;
		while(true) {
			printMenu();
			menu = sc.nextInt();
			if(menu == 0) {
				break;		
			}
			
			switch(menu) {
				case 1: registerBook(list);break;
				case 2: revisionBook(list);break;
				case 3: deleteBook(list);break;
				case 4: printAllBook(list);break;
			}
			
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
	
	private static void registerBook(ArrayList<Book> list) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);	
		String bookNo, title, author, company;
		int price;
		
		System.out.println("새로운 도서를 등록합니다.");
		System.out.print("도서번호를 입력하세요==>");
		bookNo = sc.next();
		System.out.print("도서명을 입력하세요==>");
		title = sc.next();
		System.out.print("책의 저자를 입력하세요==>");
		author = sc.next();
		System.out.print("가격을 입력하세요==>");
		price = sc.nextInt();
		System.out.print("출판사를 입력하세요==>");
		company = sc.next();
		
		list.add(new Book(bookNo,title,author,price,company));
		System.out.println("도서등록이 완료되었습니다.");
	}
	
	private static void revisionBook(ArrayList<Book> list) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String name;
		int d=0;
		
		System.out.println("**도서 데이터 수정**");
		System.out.println("수정할 도서의 제목을 입력해주세요.");
		name = sc.next();
		
		for( Book b : list ) {
			if(b.getTitle().equals(name)) {
				list.remove(b);
				System.out.println("해당도서의 데이터를 수정할준비가 끝났습니다.");
		}
			String bookNo, title, author, company;
			int price;
			
			System.out.println("수정된 도서의 데이터를 입력해주세요");
			System.out.print("도서번호를 입력하세요==>");
			bookNo = sc.next();
			System.out.print("도서명을 입력하세요==>");
			title = sc.next();
			System.out.print("책의 저자를 입력하세요==>");
			author = sc.next();
			System.out.print("가격을 입력하세요==>");
			price = sc.nextInt();
			System.out.print("출판사를 입력하세요==>");
			company = sc.next();
			
			list.add(new Book(bookNo,title,author,price,company));
			System.out.println("도서 데이터 수정이 완료되었습니다.");
		
		}
	}
	
	private static void deleteBook(ArrayList<Book> list) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String title;
		int d=0;
		
		System.out.println("**도서 데이터 삭제**");
		System.out.println("삭제할 도서의 제목을 입력해주세요.");
		title = sc.next();
		
		for( Book b : list ) {
			if(b.getTitle().equals(title)) {
				list.remove(b);
				System.out.println("해당도서의 데이터를 삭제하였습니다.");
				d = 1;
				break;
			}
		}
		if(d == 0) {
			System.out.println("삭제하려는 도서의 데이터는 없습니다.");
		}
	}
	
	
	private static void printAllBook(ArrayList<Book> list) {
		// TODO Auto-generated method stub
		
		System.out.println("***모든 도서 정보 출력***");
		System.out.println("번호\t도서명\t저자\t가격\t출판사");
		
		 for( Book b : list) {
			 System.out.println(b.getBookNo()+"\t"+b.getTitle()+"\t"+b.getAuthor()+"\t"+
					 			b.getPrice()+"\t"+b.getCompany());
		 } 
	}

	
	public static void printMenu() {
		System.out.println();
		System.out.println("1: 도서등록");
		System.out.println("2: 도서수정");
		System.out.println("3: 도서삭제");
		System.out.println("4: 도서목록출력");
		System.out.println("0: 종료");
		System.out.print("메뉴를 선택하세요===>");
	}

	
	

}
