package jdbcDemo.servlet;

import com.jspsmart.upload.File;
import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;
import jdbcDemo.util.TimeStamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "suServlet", urlPatterns = "/my007/suDo")
public class suServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 //  1.实例化上传组件
        SmartUpload su = new SmartUpload();
// 2.初始化上传操作
        su.initialize(this.getServletConfig(), request, response);
//        实现su的限制
        su.setAllowedFilesList("jpg,png,gif,bmp,jpeg");
//        su.setMaxFileSize(1024*100); //设定只能接收100k之内的文件
        try {
// 3.上传准备
            su.upload();
// 4.获取常规请求参数
            String name = su.getRequest().getParameter("name");
// 5.获取上传文件的文件
// 查看数量 su.getFiles().getCount()

            File file = su.getFiles().getFile(0);
//6.获取上传文件的文件名
            String fileName = file.getFileName();
            System.out.println("fileName=" + fileName);
//6.1给文件重命名
   //6.1获取文件名的后缀名
            String ext=file.getFileExt();
   //6.2实例化时间戳
            TimeStamp ts=new TimeStamp();
   //6.3拼凑文件名,保持后缀名不变
            fileName=ts.getTimeStamp()+"."+ext;

//7.将上传文件保存到指定文件夹中--upload
          // su.save("/upload");
            file.saveAs(this.getServletContext().getRealPath("/")+"upload/"+fileName);
//将数据保存为request范围
            request.setAttribute("name", name);
            request.setAttribute("avatar", fileName);
//实现服务器端跳转
            request.getRequestDispatcher("suShow.jsp").forward(request, response);
        } catch (SmartUploadException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
