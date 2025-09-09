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

public class SaveController implements MenuController {

    List<Menu> menuList = MenuService.getMenuList();

    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String name = request.getParameter("name");
        String spicy = request.getParameter("spicy");
        int price = Integer.parseInt(request.getParameter("price"));

        Menu menu = new Menu(name, spicy, price);
        menuList.add(menu);

        request.setAttribute("menu",menu);

        String viewPath = "/WEB-INF/save.jsp"; //jsp 경로
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);//Controller - > view 할때 사용
        dispatcher.forward(request, response); //servlet 에서 jsp 를 호출할수있음 다른 서블릿이나 JSP로 이동할 수 있는 기능이다. 서버 내부에서 다시 호출이 발생한다.
    }
}
