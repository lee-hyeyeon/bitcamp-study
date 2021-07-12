package com.eomcs.lang.ex05;

//# 증감 연산자 : 후위(post-fix) 증감 연산자 응용 II
//
public class Exam0640_ok {
  public static void main(String[] args) {
    int i = 2;
    int result = i++ + i++ * i++;
    // <연산순서> _ 증감 연산자 : 값이 참조되고 그 이후로 넘어갈 때 값이 증/감 된다.
    // 1. int result = i++(첫번째 참조, 2, 값 변화x) + i++(두번째 참조, 3) * i++(세번째 참조, 4)
    // 1-1. result = 2 + 3 * 4 = 2 + 12 = 14
    // 그리고 System.out.println() 호출을 받을 때 네번째 참조가 되면서 값 1증가, 5가 됨

    // 연산자 우선수위: 
    // 1) ++, -- 
    // 2) *, /, %
    // 3) +, -
    // 4) =
    // 
    // int result = 2 + i++ * i++;  => i = 3
    // int result = 2 + 3 * i++; => i = 4
    // int result = 2 + 3 * 4; => i = 5
    // int result = 2 + 12;
    // int result = 14;
    System.out.printf("%d, %d\n", i, result);

  }
}
