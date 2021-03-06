package com.eomcs.pms.handler;

import java.util.Collection;
import com.eomcs.pms.domain.Project;
import com.eomcs.request.RequestAgent;
import com.eomcs.util.Prompt;

public class ProjectPrompt {

  protected RequestAgent requestAgent;

  public ProjectPrompt(RequestAgent requestAgent) {
    this.requestAgent = requestAgent;
  }

  public Project promptProject() throws Exception {
    System.out.println("프로젝트:");

    requestAgent.request("project.selectList", null);

    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
      System.out.println("목록 조회 실패!");
      return null;
    }

    Collection<Project> projectList = requestAgent.getObjects(Project.class);

    for (Project project : projectList) {
      System.out.printf("  %d. %s\n", project.getNo(), project.getTitle());
    }

    while (true) {
      int projectNo = Prompt.inputInt("프로젝트 번호 선택? (취소: 0) ");
      if (projectNo == 0) {
        return null;
      }
      Project selectedProject = findByNo(projectNo, projectList);
      if (selectedProject != null) {
        return selectedProject;
      }
      System.out.println("프로젝트 번호가 옳지 않습니다.");
    }
  }

  protected Project findByNo(int no, Collection<Project> projectList) {
    for (Project project : projectList) {
      if (project.getNo() == no) {
        return project;
      }
    }
    return null;
  }
}
