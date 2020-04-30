package com.bit.exam08;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {

	public static void registerStudent(ArrayList<Student>list) {
		String name, addr, tel;
		Scanner sc = new Scanner(System.in);
		System.out.println("새로운 학생을 등록합니다.");
		System.out.print("학생의 이름을 입력하세요==>");
		name = sc.next();
		System.out.print("학생의 주소를 입력하세요==>");
		addr = sc.next();
		System.out.print("학생의 전화를 입력하세요==>");
		tel = sc.next();
		
//		Student st = new Student(name,addr,tel);
//		list.add(st);  변수생성 안하고 아래처럼 한줄로 만드는게 더 깔끔.
		list.add(new Student(name,addr,tel));
	}
	
	public static void printAllStudent(ArrayList<Student> list) {
		// TODO Auto-generated method stub
		
		 System.out.println("***모든 학생 목록***");
		 System.out.println("이름\t주소\t전화");
		 for( Student st : list) {
			 System.out.println(st.getName()+"\t"+st.getAddr()+"\t"+st.getTel());
		 }
	}

	public static void deleteStudent(ArrayList<Student> list) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String name;
		int re = 0;
		
		System.out.println("***학생 삭제***");
		System.out.print("삭제하려는 학생의 이름을 입력하세요==>");
		name = sc.next();
		
		for( Student st : list ) {
			if(st.getName().equals(name)) {
				list.remove(st);
				System.out.println("해당학생의 정보를 삭제하였습니다.");
				re = 1;
				break;
			}
		}
		if(re == 0) {
			System.out.println("삭제하려는 학생은 데이터에 없습니다.");
		}
	}

	public static void searchStudent(ArrayList<Student> list) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = false;
		String name;
		
		System.out.println("***학생 검색***");
		System.out.print("찾고자 하는 학생의 이름을 입력하세요==>");
		name = sc.next();
		
		for(Student st : list ) {
			if(st.getName().equals(name)) {
				System.out.println("찾고자 하는 학생의 정보는 다음과 같습니다.");
				System.out.println("이름:"+st.getName());
				System.out.println("주소:"+st.getAddr());
				System.out.println("전화:"+st.getTel());
				flag = true;
				break;
			}
		}
		
		if(flag == false) {
			System.out.println(name + "학생의 자료는 없습니다");
		}
	}
	
	public static void printMenu() {
		System.out.println();
		System.out.println("1: 학생등록");
		System.out.println("2: 학생검색");
		System.out.println("3: 학생삭제");
		System.out.println("4: 모두출력");
		System.out.println("0: 종료");
		System.out.print("메뉴를 선택하세요===>");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		
		int menu;
		while(true) {
			printMenu();
			menu = sc.nextInt();
			if(menu == 0) {
				break;		//while을 탈출하는 브레이크
			}
			
			switch(menu) {
				case 1: registerStudent(list);break;
				case 2: searchStudent(list);break;
				case 3: deleteStudent(list);break;
				case 4: printAllStudent(list);break;
			}
			
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

	

}
