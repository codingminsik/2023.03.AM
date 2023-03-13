package com.KoreaIT.java.AM;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("===프로그램 시작===");
		int id = 1;
		
		while (true) {
			System.out.print("명령어 ) ");
			String command = sc.nextLine();
			
			if (command.equals("post write")) {
				System.out.print("제목 : ");
				String title = sc.nextLine();
				System.out.print("내용 : ");
				String body = sc.nextLine();
				System.out.printf("%d번 글이 생성되었습니다.\n", id);
				id++;
			}
			
			if (command.equals("post list")) {
				System.out.println("게시글이 없습니다.");
//				System.out.println("번호   ||   제목");
			}
			
			if (command.equals("exit")){
				break;
			}
		}
		System.out.println("===프로그램 종료===");
		sc.close();
	}
}

class Article {
	int id;
	String title;
	String body;
}