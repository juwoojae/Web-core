package lunch.server.frontcontroller;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lunch.server.MenuController;
import lunch.server.controller.*;
import lunch.server.domain.Menu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "menuService" ,urlPatterns = "/lunch/*")
public class MenuService extends HttpServlet {

    //URI 매핑정보
    private Map<String, MenuController> controllerMap = new HashMap<>();
    static private List<Menu> MenuList = new ArrayList<>();

    /**
     * 서블릿 컨테이너에 등록 됨과 동시에 URI 매핑
     * URL 주소로 해당 Controller 조회
     */

    public MenuService() {
        controllerMap.put("/lunch/form",new FormController());
        controllerMap.put("/lunch/menus",new ListController());
        controllerMap.put("/lunch/save",new SaveController());
        controllerMap.put("/lunch/recommend",new RecommendController());
        controllerMap.put("/lunch/recommend/card",new CardController());
    }
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8"); //한국어
        String requestURL = request.getRequestURI();

        MenuController menuController = controllerMap.get(requestURL);
        if(menuController == null){
            response.setStatus(HttpServletResponse.SC_OK);// 404
        }
        menuController.process(request,response);
    }

    static public List<Menu> getMenuList(){
        return MenuList;
    }

    static public Menu findByspicy(String spicy){
        for (Menu menu : MenuList) {
            if(menu.getSpicy().equals(spicy)){
                return menu;
            }
        }
        return null;
    }
    static public Menu findByprice(int price){
        for (Menu menu : MenuList) {
            if(menu.getPrice()==price){
                return menu;
            }
        }
        return null;
    }
}
