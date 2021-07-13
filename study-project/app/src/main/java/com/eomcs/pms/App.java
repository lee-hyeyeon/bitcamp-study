package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  static Scanner keyboardScan = new Scanner(System.in);

  // 회원 정보
  static final int LENGTH = 100;
  static int[] no = new int[LENGTH];
  static String[] name = new String[LENGTH];
  static String[] email = new String[LENGTH];
  static String[] password = new String[LENGTH];
  static  String[] photo = new String[LENGTH];
  static  String[] tel = new String[LENGTH];
  static  Date[] registeredDate = new Date[LENGTH];
  static  int size = 0;

  // 프로젝트 정보
  static final int PROJECT_LENGTH = 1000;
  static int[] pNo = new int[PROJECT_LENGTH];
  static String[] pTitle = new String[PROJECT_LENGTH];
  static  String[] pContent = new String[PROJECT_LENGTH];
  static Date[] pStartDate = new Date[PROJECT_LENGTH];
  static  Date[] pEndDate = new Date[PROJECT_LENGTH];
  static  String[] pOwner = new String[PROJECT_LENGTH];
  static  String[] pMembers = new String[PROJECT_LENGTH];
  static  int pSize = 0;

  // 작업 정보
  static final int TASK_LENGTH = 100;
  static int[] tNo = new int[TASK_LENGTH];
  static String[] tContent = new String[TASK_LENGTH];
  static Date[] tDeadline = new Date[TASK_LENGTH];
  static String[] tOwner = new String[TASK_LENGTH];
  static int[] tStatus = new int[TASK_LENGTH];
  static int tSize = 0;

  //  static String input;

  public static void main(String[] args) {

    while (true) {

      String input = promptString("명령> ");

      if (input.equals("exit") || input.equals("quit")) {
        System.out.println("안녕!");
        break;
      } else if (input.equals("/member/add")) {
        addMember();

      } else if (input.equals("/member/list")) {
        listMember();

      }  else if (input.equals("/project/add")) {
        addProject();

      }  else if (input.equals("/project/list")) {
        System.out.println("[프로젝트 목록]");
        listProjects();

      }  else if (input.equals("/task/add")) {
        addTask();

      }  else if (input.equals("/task/list")) {
        listTasks();

      } else {
        System.out.println("실행할 수 없는 명령입니다.");
      }
      System.out.println();
    }

    keyboardScan.close();
  }

  static void addMember() {
    System.out.println("[회원 등록]");

    no[size] = promptInt("번호? ");
    name[size] =  promptString("이름? ");
    email[size] =  promptString("이메일? ");
    password[size] =  promptString("암호? ");
    photo[size] =  promptString("사진? ");
    tel[size] =  promptString("전화? ");
    registeredDate[size] = new Date(System.currentTimeMillis());
    size++;
  }

  static void listMember() {
    System.out.println("[회원 목록]");
    for (int i = 0; i < size; i++) {
      // 번호, 이름, 이메일, 전화, 가입일
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          no[i], name[i], email[i], tel[i], registeredDate[i]);
    }
  }

  static void addProject() {
    System.out.println("[프로젝트 등록]");

    pNo[pSize] = promptInt("번호? ");
    pTitle[pSize] = promptString("프로젝트명? ");
    pContent[pSize] = promptString("내용? ");
    pStartDate[pSize] = promptDate("시작일? ");
    pEndDate[pSize] = promptDate("종료일? ");
    pOwner[pSize] = promptString("만든이? ");
    pMembers[pSize] = promptString("팀원? ");

    pSize++;
  }

  static void listProjects() {
    for (int i = 0; i < pSize; i++) {
      // 번호, 프로젝트명, 시작일, 종료일, 만든이
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          pNo[i], pTitle[i], pStartDate[i], pEndDate[i], pOwner[i]);
    }
  }

  static void addTask() {
    System.out.println("[작업 등록]");

    tNo[tSize] = promptInt("번호? ");
    tContent[tSize] = promptString("내용? ");
    tDeadline[tSize] = promptDate("마감일? ");

    System.out.println("상태?");
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");

    tStatus[tSize] = promptInt("> ");
    tOwner[tSize] = promptString("담당자? ");

    tSize++;

  }

  static void listTasks() {
    System.out.println("[작업 목록]");

    for (int i = 0; i < tSize; i++) {
      String stateLabel = null;
      switch (tStatus[i]) {
        case 1:
          stateLabel = "진행중";
          break;
        case 2:
          stateLabel = "완료";
          break;
        default:
          stateLabel = "신규";
      }
      // 번호, 작업명, 마감일, 프로젝트, 상태, 담당자
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          tNo[i], tContent[i], tDeadline[i], stateLabel, tOwner[i]);
    }

  }

  static String promptString(String title) {
    System.out.print(title);
    return keyboardScan.nextLine();
  }

  static int promptInt(String title) {
    System.out.print(title);
    return Integer.parseInt(keyboardScan.nextLine());
  }

  static Date promptDate(String title) {
    System.out.print(title);
    return Date.valueOf(keyboardScan.nextLine());

  }
}
