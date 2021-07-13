package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;
public class App02a_App3 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("[작업]");

    System.out.print("프로젝트? ");
    String project = scan.nextLine();

    System.out.print("번호? ");
    int no = Integer.parseInt(scan.nextLine());

    System.out.print("내용? ");
    String content = scan.nextLine();

    System.out.print("완료일? ");
    Date deadline = Date.valueOf(scan.nextLine());

    System.out.println("상태?");
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    System.out.print(">");
    int status = Integer.parseInt(scan.nextLine());

    System.out.print("담당자? ");
    String owner = scan.nextLine();

    System.out.println("--------------------------------------------");

    System.out.println("프로젝트: " + project);
    System.out.println("번호: " + no);
    System.out.println("내용: " + content);
    System.out.println("완료일: " + deadline);

    switch (status) {
      case 1:
        System.out.println("상태 : 진행중");
        break;

      case 2:
        System.out.println("상태: 완료");
        break;

      default:
        System.out.println("상태: 신규");
    }

    System.out.println("담당자: " + owner);


  }

}
