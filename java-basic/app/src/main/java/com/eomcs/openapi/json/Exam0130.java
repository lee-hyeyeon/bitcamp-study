// JSON 문자열 --> 객체 : JSON 문자열에는 클래스 정보가 없다.
package com.eomcs.openapi.json;

import com.google.gson.Gson;

public class Exam0130 {
  public static void main(String[] args) {

    // 1) JSON 문자열 준비
    String jsonStr = "{\"no\":100,\"name\":\"홍길동\",\"email\":\"hong@test.com\",\"password\":\"1111\",\"photo\":\"hong.gif\",\"tel\":\"010-2222-1111\",\"registeredDate\":\"9월 16, 2021\"}";

    // 2) JSON 처리 객체 준비
    Gson gson = new Gson();

    // 3) JSON 문자열을 가지고 객체 만들기
    // 멤버 객체를 만들고, 그 객체의 각 필드에다 JSON 문자열에 있는 데이터를 입력한다
    // JSON 문자열에서 프로퍼티 이름과 일치하는 필드가 객체에 있다면 값을 넣는다
    // 예) no, registeredDate 필드는 Member, Board 도메인 모두 존재 하기 때문에 값이 들어간다
    // JSON 문자열  ---------->  Board   
    //     no                      no
    //     name                    X
    //     email                   X
    //     password                X
    //     photo                   X
    //     tel                     X
    //     registeredDate        registeredDate
    //       
    Member m = gson.fromJson(jsonStr, Member.class);

    // JSON 데이터에는 클래스 정보가 없다
    // 일치하지 않는 필드값의 데이터는 입력되지 않는다
    // Board b = gson.fromJson(jsonStr, Board.class);

    System.out.println(m);

  }
}





