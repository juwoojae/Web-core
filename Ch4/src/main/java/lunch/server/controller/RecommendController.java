package lunch.server.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lunch.server.MenuController;
import lunch.server.domain.Menu;
import lunch.server.frontcontroller.MenuService;

import java.io.IOException;
import java.util.List;

public class RecommendController implements MenuController {

    List<Menu> menus = MenuService.getMenuList();
    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String viewPath = "/WEB-INF/recommend.jsp"; //jsp 경로
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        dispatcher.forward(request, response);
    }
}
