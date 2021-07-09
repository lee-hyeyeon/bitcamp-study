package com.eomcs.pms;

import java.util.Date;
import java.util.Scanner;

//1) 배열 사용 전 -3개정도 OK!
//2) 배열 사용 후 -3개정도 OK!!
//3) 반복문 적용 : while OK!!!
//4) 반복문 적용 : for OK!!!!
//5) 여러 문장에서 반복해서 사용하는 값은 변수에 담아서 사용한다. OK!!!!
//6) 조회용으로만 사용할 변수라면 상수로 선언한다. OK!!!!
//7) 특정 조건에 따라 반복을 멈춘다 "계속 입력하시겠습니까?" OK!!!!!
//8) 날짜의 출력형식을 "yyyy-MM-dd"로 변경한다.

public class App {

  public static void main(String[] args) {
    System.out.println("[회원]");

    final int MAX_LENGTH = 2;

    int[] no = new int[MAX_LENGTH];
    String[] name = new String[MAX_LENGTH];
    String[] email = new String[MAX_LENGTH];
    String[] password = new String[MAX_LENGTH];
    String[] photo = new String[MAX_LENGTH];
    String[] tel = new String[MAX_LENGTH];
    Date[] registeredDate = new Date[MAX_LENGTH];

    Scanner scan = new Scanner(System.in);

    int size = 0;

    for (int i = 0; i < MAX_LENGTH; i++) {

      System.out.print("번호? ");
      no[i] = Integer.parseInt(scan.nextLine());

      System.out.print("이름? ");
      name[i] = scan.nextLine();

      System.out.print("이메일? ");
      email[i] = scan.nextLine();

      System.out.print("암호? ");
      password[i] = scan.nextLine();

      System.out.print("사진? ");
      photo[i] = scan.nextLine();

      System.out.print("전화? ");
      tel[i] = scan.nextLine();

      registeredDate[i] = new Date();
      size = size + 1;
      System.out.println();

      System.out.print("계속 입력하시겠습니까? (y/N)");
      String input = scan.nextLine();

      if (input.equalsIgnoreCase("N") || input.equals("")) {
        break;
      }
    }

    scan.close();

    System.out.println("--------------------------------");

    for (int i = 0; i < size; i++) {


      System.out.printf("%d, %s, %s, %s, %tY-%5$tm-%5$td\n", 
          no[i], name[i], email[i], tel[i], registeredDate[i]);

    }
  }
}

