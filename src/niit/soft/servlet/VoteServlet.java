package niit.soft.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "VoteServlet", urlPatterns = "/homework/vote/doVote")

public class VoteServlet extends HttpServlet {
    private static  final long serialVersionUID=1L;
    public VoteServlet(){
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String item = request.getParameter("item");
        ServletContext app = request.getSession().getServletContext();
        Map<String, Integer> map = null;

        if (app.getAttribute("VoteResult") != null) {
            map = (Map<String, Integer>) app.getAttribute("VoteResult");
            map.put(item, Integer.parseInt(map.get(item).toString()) + 1);
        } else {
            String[] array = {"上官", "小乔", "甄姬", "妲己", "貂蝉"};
            map = new HashMap<>();
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(item)) {
                    map.put(array[i], 1);
                }else{
                    map.put(array[i],0);
                }
            }
        }
        app.setAttribute("VoteResult", map);
        PrintWriter out = response.getWriter();
        out.println("<script>" + "alert('投票成功');" + "window.location.href='VoteResult.jsp';" + "</script>");
        out.flush();
        out.close();
    }
}
