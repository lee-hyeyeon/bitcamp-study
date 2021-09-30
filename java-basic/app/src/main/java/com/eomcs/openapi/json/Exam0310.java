// JSON 문자열 --> 객체 : 컬렉션 다루기
package com.eomcs.openapi.json;

import java.sql.Date;
import java.util.ArrayList;
import com.google.gson.Gson;

public class Exam0310 {
  public static void main(String[] args) {

    // 1) ArrayList 준비
    Member m1 = new Member();
    m1.setNo(101);
    m1.setName("홍길동");
    m1.setEmail("hong@test.com");
    m1.setPassword("1111");
    m1.setPhoto("hong.gif");
    m1.setTel("010-2222-1111");
    m1.setRegisteredDate(new Date(System.currentTimeMillis()));

    Member m2 = new Member();
    m2.setNo(102);
    m2.setName("임꺽정");
    m2.setEmail("lim@test.com");
    //    m2.setPassword("1111");
    //    m2.setPhoto("hong.gif"); -> 일부러 null 값을 만들어보자
    //    m2.setTel("010-2222-1111");
    m2.setRegisteredDate(new Date(System.currentTimeMillis()));

    Member m3 = new Member();
    m3.setNo(103);
    m3.setName("안창호");
    m3.setEmail("ahn@test.com");
    //    m3.setPassword("1111");
    //    m3.setPhoto("hong.gif"); -> 일부러 null 값을 만들어보자
    //    m3.setTel("010-2222-1111");
    m3.setRegisteredDate(new Date(System.currentTimeMillis()));

    ArrayList<Member> list = new ArrayList<>();
    list.add(m1);
    list.add(m2);
    list.add(m3);

    // 2) JSON 처리 객체 준비
    // 3) 객체의 값을 JSON 문자열로 얻기 
    String jsonStr =  new Gson().toJson(list);

    System.out.println(jsonStr);
  }
}

//JSON 객체 형식 - [{ 객체 정보 }, { 객체 정보 }, ...]
// => 배열을 출력한 것과 같다.
// JSON은 배열과 컬렉션을 구분하지 않는다.

//=> [
//        { "프로퍼티명" : 값, "프로퍼티명" : 값 },
//        { "프로퍼티명" : 값, "프로퍼티명" : 값 },
//        { "프로퍼티명" : 값, "프로퍼티명" : 값 },
//        ... 
//    ]

//



