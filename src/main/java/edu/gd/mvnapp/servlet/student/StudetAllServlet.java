package edu.gd.mvnapp.servlet.student;

import com.google.gson.Gson;
import edu.gd.mvnapp.dao.StudentDao;
import edu.gd.mvnapp.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = "/stu/all/")
public class StudetAllServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        List<Student> students = StudentDao.getStudents();
        Gson gson = new Gson();
        String json = gson.toJson(students);
        resp.setContentType("application/json");
        PrintWriter out = resp.getWriter();
        out.print(json);
        out.flush();
    }
}
