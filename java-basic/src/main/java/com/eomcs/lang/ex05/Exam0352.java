package com.eomcs.lang.ex05;

//# 비트 연산자 & 를 이용하여 % 연산 구현하기 응용 I
//
public class Exam0352 {
  public static void main(String[] args) {
    // % 연산자를 이용하여 짝수/홀수 알아내기
    System.out.println(57 % 2 == 0 ? "짝수" : "홀수");
    // 아마추어

    // & 연산자를 이용하여 짝수/홀수 알아내기
    System.out.println((57 & 8) == 0 ? "짝수" : "홀수");
    System.out.println((57 & 0x111) == 0 ? "짝수" : "홀수"); // 57&7
    System.out.println((57 & 16) == 0 ? "짝수" : "홀수");
    System.out.println((57 & 0x1111) == 0 ? "짝수" : "홀수"); // 57&15 = 57 & 0xf
    // 맨끝에 1비트를 가져와서 연산했을때 끝 값이 0ㅣ라면 홀수, 아니면 짝수
    // 한개 비트 2로 나눈 나머지, 비트 추출 하는 정도에 따라 계산

  }
}

