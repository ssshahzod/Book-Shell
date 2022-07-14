package com.example.javaee.Servlets;

import com.example.javaee.DB.DBUtil;
import com.example.javaee.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EmailList", value = "/emailList")
public class EmailListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url = "/index.jsp";

        String action = request.getParameter("action");
        if(action == null){
            action = "joins";
        }

        if(action.equals("join")){
            url = "/index.jsp"; //the "join" page
        }
        else if (action.equals("add")){
            String firstName = request.getParameter("firstName");
            String secondName = request.getParameter("secondName");
            String email = request.getParameter("email");

            User user = new User(firstName, secondName, email);

            String DBInsertion = DBUtil.AddUser(firstName, secondName, email);
            if(DBInsertion.equals("Success")) {
                request.setAttribute("user", user);
                url = "/thanks.jsp";
            }
            request.setAttribute("error", DBInsertion);
            url = "/error.jsp";
        }

        getServletContext().getRequestDispatcher(url).forward(request, response);
    }
}
