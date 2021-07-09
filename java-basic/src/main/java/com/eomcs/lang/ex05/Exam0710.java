package com.eomcs.lang.ex05;

//# 할당(배정,대입) 연산자  : +=  -=  *=  /=  %=  &=  |=  ^=  <<=  >>=  >>>=
//
public class Exam0710 {
  public static void main(String[] args) {
    int i = 2;

    //i = i + 20;, i 변수 값ㅇ을 가져와!!! 가져오 ㄴ값에다 20을 더해!!! 그걸 i에다 집어넣어!! 
    // 위 과정이 귀찮아서 아래와 같이 축약,,

    i += 20; // += 연산자를 사용하면 위의 코드를 축약할 수 있다.
    System.out.println(i);

    i = 2;
    i *= 5;
    System.out.println(i);

  }
}
