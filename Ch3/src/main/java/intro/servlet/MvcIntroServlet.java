package intro.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

@WebServlet(name ="mvcIntroServlet", urlPatterns = "/save")
public class MvcIntroServlet extends HttpServlet {

    /**
     * 1. servlet 의 service 가 Controller 의 역할을 하고
     * 2. View 를 JSP가 담당한다
     * 3. HTTPServletRequest 객체를 이용하여 데이터를 보관및 조회기능을 한다 (model)
     */

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8"); //한국어

        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String mbti = request.getParameter("mbti");
        List<String> favoriteFood = new ArrayList<>();
        getFavoriteFood(request, favoriteFood);

        request.setAttribute("name", name);
        request.setAttribute("age", age);
        request.setAttribute("mbti", mbti);
        request.setAttribute("favoriteFoods", favoriteFood);

        String viewPath ="/WEB-INF/views/save.jsp";//JSP 경로
        //WEB-INF 란 톰켓(Tomcat)같은 서블릿 컨테이너에서 특별취급되서 외부(client)에서는 접근할수 없고, 서버 내부에서만 접근 가능한 자원들을 두는 곳(접근 제한자 멘치로)
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);//Controller - > view 할때 사용
        dispatcher.forward(request,response); //servlet 에서 jsp 를 호출할수있음 다른 서블릿이나 JSP로 이동할 수 있는 기능이다. 서버 내부에서 다시 호출이 발생한다.
    }

    private static void getFavoriteFood(HttpServletRequest request, List<String> favoriteFood) {
        StringTokenizer stringTokenizer = new StringTokenizer(request.getParameter("favoriteFood"),",");
        while(stringTokenizer.hasMoreTokens()){
            favoriteFood.add(stringTokenizer.nextToken().trim());
        }
    }
}
