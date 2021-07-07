package com.eomcs.pms;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    System.out.println("[회원]");

    Scanner scan = new Scanner(System.in);
    //line 3에서 Scanner 패키지 선언이 안되어 있으면
    // 매번 java.util.Scanner scan = new java.util.Scanner(System.in); 으로 작성

    System.out.print("번호?");
    int no = scan.nextInt();
    scan.nextLine(); // 키보드 메모리에 남아있는 찌꺼기 엔터 코드 제거 

    System.out.print("이름?");
    String name = scan.nextLine();

    System.out.print("이메일?");
    String mail = scan.nextLine();

    System.out.print("암호?");
    String password = scan.nextLine();

    System.out.print("사진?");
    String photo = scan.nextLine();

    System.out.print("전화?");
    String tel = scan.nextLine();

    System.out.println("가입일?");

    java.sql.Date registerdDate = new java.sql.Date(System.currentTimeMillis());
    System.out.println(registerdDate );

    scan.close();

    System.out.println("----------------------------");

    System.out.println("번호:" + no);
    System.out.println("이름:" + name);
    System.out.println("이메일:" + mail);
    System.out.println("암호:" + password);
    System.out.println("사진:" + photo);
    System.out.println("전화:" + tel);
    System.out.println("가입일:" + registerdDate);


  }
}
