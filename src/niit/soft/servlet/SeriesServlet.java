package niit.soft.servlet;

import niit.soft.beans.SeriesBean;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SeriesServlet", urlPatterns = "/my005/seriesDemo")
public class SeriesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SeriesBean seriesBean = new SeriesBean();
        request.setAttribute("seriesBean", seriesBean);
        //获取表单数据
        double firstItem = Double.parseDouble(request.getParameter("firstItem"));
        double var = Double.parseDouble(request.getParameter("var"));
        int num = Integer.parseInt(request.getParameter("num"));
        //设置bean数据
        seriesBean.setFirstItem(firstItem);
        seriesBean.setVar(var);
        seriesBean.setNum(num);
        seriesBean.setName("公差");
        //求数列之和
        int n=1;
        double sum=0,item=firstItem;
        while (n<=num){
            sum+=item;
            item+=var;
            n++;
        }
        //设置bean中的sum值
        seriesBean.setSum(sum);
        //将结果呈现到页面上
        RequestDispatcher rd=request.getRequestDispatcher("seriesShow.jsp");
        rd.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
