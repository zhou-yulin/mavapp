package edu.gd.mvnapp;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String name = req.getParameter("username");
        String pwd = req.getParameter("password");
        if(name != null && pwd != null){
            //attend session
            HttpSession session = req.getSession();
            session.setAttribute("name", name);
            session.setAttribute("password", pwd);
            //redirect
            resp.sendRedirect(req.getContextPath() + "admin.jsp");
        }
    }
}
