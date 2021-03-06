package com.eomcs.pms.handler;

import java.util.HashMap;
import com.eomcs.pms.dao.BoardDao;
import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardUpdateHandler implements Command {

  BoardDao boardDao;

  public BoardUpdateHandler(BoardDao boardDao) {
    this.boardDao = boardDao;
  }

  @Override
  public void execute(CommandRequest request) throws Exception {
    System.out.println("[게시글 변경]");
    int no = (int) request.getAttribute("no");

    HashMap<String,String> params = new HashMap<>();

    Board board = boardDao.findByNo(no);

    if (board == null) {
      System.out.println("해당 번호의 게시글이 없습니다.");
      return;
    }

    if (board.getWriter().getNo() != AuthLoginHandler.getLoginUser().getNo()) {
      System.out.println("변경 권한이 없습니다.");
      return;
    }

    Board temp = new Board();
    temp.setNo(board.getNo());
    temp.setRegisteredDate(board.getRegisteredDate()); 
    temp.setLike(board.getLike());
    temp.setViewCount(board.getViewCount());
    temp.setWriter(board.getWriter());
    temp.setTitle(Prompt.inputString(String.format("제목(%s)? ", board.getTitle())));
    temp.setContent(Prompt.inputString(String.format("내용(%s)? ", board.getContent())));

    String input = Prompt.inputString("정말 변경하시겠습니까?(y/N) ");
    if (input.equalsIgnoreCase("n") || input.length() == 0) {
      System.out.println("게시글 변경을 취소하였습니다.");
      return;
    }

    boardDao.update(temp);

    System.out.println("게시글을 변경하였습니다.");
  }
}







