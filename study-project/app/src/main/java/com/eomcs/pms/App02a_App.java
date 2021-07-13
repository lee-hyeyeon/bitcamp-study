package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;
public class App02a_App {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("[회원]");

    System.out.print("번호? ");
    String no = scan.nextLine();

    System.out.print("이름? ");
    String name = scan.nextLine();

    System.out.print("이메일? ");
    String email = scan.nextLine();

    System.out.print("암호? ");
    String password = scan.nextLine();

    System.out.print("사진? ");
    String photo = scan.nextLine();

    System.out.print("전화? ");
    String tel = scan.nextLine();

    Date now = new Date(System.currentTimeMillis());

    scan.close();

    System.out.println("--------------------------------------------");

    System.out.println("번호: " + no);
    System.out.println("이름: " + name);
    System.out.println("이메일: " + email);
    System.out.println("암호: " + password);
    System.out.println("사진: " + photo);
    System.out.println("전화: " + tel);
    System.out.println("가입일: " + now);

  }

}
