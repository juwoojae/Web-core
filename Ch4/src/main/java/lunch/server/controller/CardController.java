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

public class CardController implements MenuController {

    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String spicy = request.getParameter("spicy");
        int price = Integer.parseInt(request.getParameter("price"));

        /**
         * 1. spicy 값을 받아 온다 -> MenuList 에서 해당 spicy를 가진 menu 를 Model에 넣는다
         * 2. price 값을 받아 온다 -> MenuList 에서 해당 price를 가진 menu 를 Model에 넣는다
         */
        Menu byspicy = MenuService.findByspicy(spicy);
        Menu byprice = MenuService.findByprice(price);
        //추천 메뉴가 MenuList에 없는경우
        if(byspicy==null &&byprice==null ){  //해당 메뉴를 못찾은 경우
            String viewPath = "/WEB-INF/info.jsp"; //jsp 경로
            RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
            dispatcher.forward(request, response);
        }else{
            if(byspicy==null){ //하나라도 찾은경우
                request.setAttribute("menu",MenuService.findByprice(price));
            }
            else {
                request.setAttribute("menu",MenuService.findByspicy(spicy));
            }
            String viewPath = "/WEB-INF/card.jsp"; //jsp 경로
            RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
            dispatcher.forward(request, response);
        }
    }
}
