package com.bit.exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class BookTEST {
	public static Scanner sc;
	public static void printmenu() {
		System.out.println("***도서관리 프로그램***");
		System.out.println("1.등록  2.수정  3.삭제  4.모두출력(오름차순)  0.종료");
		System.out.print("메뉴를 선택하세요==>");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		ArrayList<Book> list = new ArrayList<Book>();
		int menu;
		while(true) {
			printmenu();
			menu = sc.nextInt();
			if (menu == 0) {
				break;
		}

			switch (menu) {
			case 1:insertBook(list);break;
			case 2:updateBook(list);break;
			case 3:deleteBook(list);break;
			case 4:printAllBook(list);break;
			}
	}System.out.println("프로그램이 종료되었습니다.");

	}
	private static void sortBook(ArrayList<Book> list) { 			//정렬 
		// TODO Auto-generated method stub
		for(int i =0; i < list.size(); i++) {
			for(int j = i+1; j < list.size(); j++) {
				if(list.get(j).getPrice()  <  list.get(i).getPrice()) {
					Book temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
	}
	private static void printAllBook(ArrayList<Book> list) {
		// TODO Auto-generated method stub
		System.out.println("**도서목록***");
		System.out.println("도서번호\t 도서명\t 저자\t 가격\t 출판사");
		
		sortBook(list);
	
		for(Book b : list) {
			
			System.out.println(b.getNo()+"\t"+b.getTitle()+"\t"+b.getWriter()+"\t"+b.getPrice()+"\t"+b.getPublisher());
		
		}
	}
	private static void deleteBook(ArrayList<Book> list) {
		// TODO Auto-generated method stub
		System.out.println("***도서삭제***");
		int no;
		boolean flag = false;
		System.out.print("삭제할 도서 번호를 입력==>");
		no = sc.nextInt();
		for(Book b : list) {
			if(b.getNo() == no) {
				list.remove(b);
				System.out.println("해당도서를 삭제하였습니다.");
				flag = true;
				break;
			}
		}
		if(flag== false) {
			System.out.println("삭제에 실패하였습니다.");
		}
		
	}
	
	private static void updateBook(ArrayList<Book> list) {
		// TODO Auto-generated method stub
		System.out.println("***도서수정***");
		int no,price;
		String title, writer, publisher;
		
		System.out.print("수정할 도서의 도서번호:");
		no = sc.nextInt();
		System.out.print("수정할 도서의 도서명:");
		title = sc.next();
		System.out.print("수정할 도서의 저자:");
		writer = sc.next();
		System.out.print("수정할 도서의 가격:");
		price = sc.nextInt();
		System.out.print("수정할 도서의 출판사:");
		publisher = sc.next();
		
		Book b = new Book(no,title,writer,price,publisher);
		int i;
		for( i = 0; i < list.size(); i++) {
			if(list.get(i).getNo() == no   ) {
				list.set(i, b);
				System.out.println("해당도서를 수정했습니다.");
				break;
			}
		}
		if(i == list.size()) {
			System.out.println("해당도서는 존재하지 않습니다.");
		}
	}
		
	
	

	private static void insertBook(ArrayList<Book> list) {
		// TODO Auto-generated method stub
		int no,price;
		String title, writer, publisher;
		
		System.out.println("**도서등록**");
		System.out.print("등록할 도서의 도서번호:");
		no = sc.nextInt();
		System.out.print("등록할 도서의 도서명:");
		title = sc.next();
		System.out.print("등록할 도서의 저자:");
		writer = sc.next();
		System.out.print("등록할 도서의 가격:");
		price = sc.nextInt();
		System.out.print("등록할 도서의 출판사:");
		publisher = sc.next();
		
		Book b = new Book(no,title,writer,price,publisher);
		list.add(b);	
	}
}
