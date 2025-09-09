package lunch.server;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface MenuController {
    void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
