// 관계 연산자 : 부동소수점 비교 
package com.eomcs.lang.ex05;

public class Exam0221 {
  public static void main(String[] args) {
    float f1 = 0.1f;
    float f2 = 0.1f;

    System.out.println(f1 * f2 == 0.01f); // false

    // 이유?
    System.out.println(f1 * f2); // 0.010000001 결과 값 뒤에 0.000000001 오차 발생!

    // 해결책?
    // => 오차를 제거한 후 비교
    // => 다만 계산 결과를 절대값으로 만든 후에 오차 이하의 값인지 비교하라!
    float r = f1 * f2 - 0.01f;
    System.out.println(Math.abs(r) <= Float.POSITIVE_INFINITY);
    //   =  System.out.println(Math.abs((d1 + d2) - (x + y)) < EPSILON);
    // 위 방법은 d1d2 xy 연산값에 따라 결과가 양수 또는 음수로 나올 수 있으므로
    // 결과값을 절대값으로 바꾼 뒤 결과값을 확인하자
    // 부동소숫점이 내가 원하는 부동소숫점 결과가 맞는지 검사할 때 쓰는 문법!!! 외워 걍!!
  }
}
