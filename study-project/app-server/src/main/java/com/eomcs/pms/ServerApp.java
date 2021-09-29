package com.eomcs.pms;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Map;
import com.eomcs.pms.table.BoardTable;
import com.eomcs.pms.table.JsonDataTable;
import com.eomcs.pms.table.MemberTable;
import com.eomcs.server.DataProcessor;
import com.eomcs.server.RequestProcessor;

public class ServerApp {

  public static void main(String[] args) throws Exception {
    System.out.println("[PMS 서버]");

    System.out.println("서버 실행중");
    ServerSocket serverSocket = new ServerSocket(8888);

    Socket socket = serverSocket.accept();
    System.out.println("클라이언트가 접속했음");

    // RequestProcessor 가 사용할
    Map<String, DataProcessor> dataProcessorMap;

    // 데이터 처리 담당자를 등록한다
    dataProcessorMap.put("board.", new BoardTable());
    dataProcessorMap.put("member.", new MemberTable());

    RequestProcessor requestProcessor = new RequestProcessor(socket, dataProcessorMap);
    requestProcessor.service();
    requestProcessor.close();

    System.out.println("서버 종료");
    serverSocket.close();

    Collection<DataProcessor> dataProcessors = dataProcessorMap.values();
    for (DataProcessor dataProcessor : dataProcessors) {
      if (dataProcessor instanceof JsonDataTable) {
        // 만약 데이터 처리 담당자가 JsonDataTable의 자손이리ㅏ면,
        ((JsonDataTable<?>)dataProcessor).save();
      }
    }
  }
}












