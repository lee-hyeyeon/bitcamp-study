package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;
public class App02a_App2 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("[");
    System.out.print("프로젝트");
    System.out.println("]");

    System.out.print("번호? ");
    int no = Integer.parseInt(scan.nextLine());

    System.out.print("프로젝트명? ");
    String title = scan.nextLine();

    System.out.print("내용? ");
    String content = scan.nextLine();

    System.out.print("시작일? ");
    Date startDate = Date.valueOf(scan.nextLine());

    System.out.print("종료일? ");
    Date endDate = Date.valueOf(scan.nextLine());

    System.out.print("만든이? ");
    String owner = scan.nextLine();

    System.out.print("팀원? ");
    String members = scan.nextLine();

    System.out.println("------------------------------------");

    System.out.println("번호: " + no);
    System.out.println("프로젝트명: " + title);
    System.out.println("내용: " + content);
    System.out.println("시작일: " + startDate);
    System.out.println("종료일: " + endDate);
    System.out.println("만든이: " + owner);
    System.out.println("팀원: " + members);
  }

}
