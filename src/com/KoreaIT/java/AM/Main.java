package com.KoreaIT.java.AM;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("==프로그램 시작==");
		Scanner sc = new Scanner(System.in);
		int num = 1;

		while (true) {
			System.out.print("명령어 > ");
			String command = sc.nextLine();
			
			if(command.equals("article list")) {
				System.out.println("게시글이 없습니다.");
				
			} else if (command.equals("article write")) {
				System.out.print("제목 : ");
				String title = sc.nextLine();
				System.out.print("내용 : ");
				String body = sc.nextLine();
				System.out.println(num + "번글이 생성되었습니다.");
				num++;
				
			} else if(command.equals("exit")) {
				break;
				
			} else if (command.length() == 0) {
				System.out.println("명령어를 입력해주세요.");
				
			} else {
				System.out.println("존재하지 않는 명령어입니다");
				
			}
			
		}

		System.out.println("==프로그램 끝==");

		sc.close();
	}
}