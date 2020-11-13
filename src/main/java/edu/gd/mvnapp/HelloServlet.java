package edu.gd.mvnapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(urlPatterns = "/")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

        String name = req.getParameter("name");

        System.out.println(name);
        System.out.println("--------------");
        System.out.println(req.getContextPath());
        System.out.println(req.getServletPath());
        System.out.println(req.getPathInfo());
        //System.out.println(req.getHeader());

        resp.setContentType("text/html");
        writer.write("/index.jsp");
        writer.flush();

        //Cookie
        Cookie cookie = new Cookie("name", name);
        cookie.setMaxAge(60 * 60);
        resp.addCookie(cookie);

        Cookie[] cookies = req.getCookies();
        for (Cookie item : cookies) {
            String name1 = item.getName();
            String value = item.getValue();
        }
    }
}
