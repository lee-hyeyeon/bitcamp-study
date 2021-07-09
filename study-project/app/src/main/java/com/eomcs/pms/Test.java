package com.eomcs.pms;

//import java.sql.Date;
import java.util.Date;
import java.util.Scanner;
public class Test {

  public static void main(String[] args) {
    System.out.println("[프로젝트]");

    Scanner scan = new Scanner(System.in);
    Date date = new Date();
    int length = 100;

    int[] no = new int[length];
    String[] title = new String[length];
    String[] content = new String[length];
    Date[] startDate = new Date[length];
    Date[] endDate = new Date[length];
    String[] owner = new String[length];
    String[] member = new String[length];

    int size = 0;

    for (int i = 0; i < length ; i = i + 1) {
      System.out.print("번호? ");
      no[i] = Integer.parseInt(scan.nextLine());

      System.out.print("프로젝트명? ");
      title[i] = scan.nextLine();

      System.out.print("내용? ");
      content[i] = scan.nextLine();

      System.out.print("시작일? ");
      startDate[i] = Date.valueOf(scan.nextLine());

      System.out.print("종료일? ");
      endDate[i] = date.getDate(scan.nextLine());

      System.out.print("만든이? ");
      owner[i] = scan.nextLine();

      System.out.print("팀원? ");
      member[i] = scan.nextLine();

      System.out.println();

      size = size + 1;

      System.out.print("계속 입력하시겠습니까?(y/N)");

      String input = scan.nextLine();
      if(input.equalsIgnoreCase("N") || input.equals("")) {
        break;
      }
      scan.close();

      System.out.println("---------------------------------------");
    }

    for (int i = 0; i < size ; i++) {
      System.out.printf("%d, %s, %tY-%3$tm-%3$td, %tY-%4$tm-%4$td\n", 
          no[i], title[i], startDate[i], endDate[i]);
    }



  }







}


