// JSON 문자열 --> 객체 : 컬렉션 다루기
package com.eomcs.openapi.json;

import java.lang.reflect.Type;
import java.util.Collection;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Exam0321 {
  public static void main(String[] args) {

    String jsonStr = "[{\"no\":101,\"name\":\"홍길동\"},{\"no\":102,\"name\":\"임꺽정\"},{\"no\":103,\"name\":\"안창호\"}]";
    // 위 JSON 데이터를 Member 객체로 담아주고, 그리고 그 목록은 Collection 구현체에 담아서 줘
    // 단 Collection 구현체니깐 Array든 Linked든 HashSet이든 상관없다
    Type collectionType = new TypeToken<Collection<Integer>>(){}.getType();

    Collection<Member> list = new Gson().fromJson(jsonStr, collectionType);

    for(Member m : list) {
      System.out.println(m);
    }
  }
}

//JSON 객체 형식 - [{ 객체 정보 }, { 객체 정보 }, ...]
// => { "프로퍼티명" : 값, "프로퍼티명" : 값 }
//





