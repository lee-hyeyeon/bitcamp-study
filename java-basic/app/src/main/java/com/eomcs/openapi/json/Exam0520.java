// JSON 문자열 --> 객체 : 다른 객체를 포함하는 경우
package com.eomcs.openapi.json;

import com.google.gson.Gson;

public class Exam0520 {
  public static void main(String[] args) {

    String jsonStr = "{\"no\":11,\"title\":\"제목\",\"content\":\"내용\",\"startDate\":\"2월 2, 2021\",\"endDate\":\"2월 2, 2021\",\"owner\":{\"no\":102,\"name\":\"임꺽정\",\"email\":\"lim@test.com\",\"registeredDate\":\"9월 16, 2021\"},\"members\":[{\"no\":101,\"name\":\"홍길동\",\"email\":\"hong@test.com\",\"registeredDate\":\"9월 16, 2021\"},{\"no\":102,\"name\":\"임꺽정\",\"email\":\"lim@test.com\",\"registeredDate\":\"9월 16, 2021\"},{\"no\":103,\"name\":\"안창호\",\"email\":\"ahn@test.com\",\"registeredDate\":\"9월 16, 2021\"}],\"tasks\":[]}";

    Project p = new Gson().fromJson(jsonStr, Project.class);

    System.out.println(p);

  }
}

// JSON 객체 형식 - { 객체 정보 }
// => { "프로퍼티명" : 값, "프로퍼티명" : 값 }
//





