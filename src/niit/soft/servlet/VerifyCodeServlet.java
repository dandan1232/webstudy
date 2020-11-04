package niit.soft.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "VerifyCodeServlet",urlPatterns = "/verifyCode")
public class VerifyCodeServlet extends HttpServlet {
    private static int WIDTH=65;
    private static int HEIGHT=20;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        response.setContentType("image/jpeg");
//        设置浏览器不缓存此图片
        response.setHeader("Pragma","No-cache");
        response.setHeader("Cache-Control","no-cache");
        response.setDateHeader("Expires",0);
//        创建内存图片
        BufferedImage image=new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB);
//      获取图形上下文
        Graphics g=image.getGraphics();
//        产生随机的认证码
        char[] rands=generateVerifyCode();
//        产生图像
        drawBackground(g);
//       将随机码写入图片中
        drawRands(g,rands);
//        结束图像绘制过程，完成图像
        g.dispose();
//        将图像进行输出
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        ServletOutputStream sos= response.getOutputStream();
        ImageIO.write(image,"JPEG",bos);
        byte[] buf=bos.toByteArray();
        response.setContentLength(buf.length);
        sos.write(buf);
        bos.close();
        sos.close();
//        将验证码存入到Session中
        session.setAttribute("verifyCode",new String(rands));
    }

    /**@return 产生验证码*/

    private char[] generateVerifyCode(){
        Random random=new Random();
        char[] chars=new char[62];
        for(int i=0;i<10;i++){
            chars[i]=(char)(i+48);
        }
        for(int i=0;i<26;i++){//将大写字母A-Z送入
            chars[i+10]=(char)(i+65);
        }
        for(int i=0;i<26;i++){//将小写字母a-z送入
            chars[i+36]=(char)(i+97);
        }
        char[] rands=new char[4];
        for(int i=0;i<4;i++){
            rands[i]=chars[random.nextInt(62)];
        }
        System.out.println(rands);
        return rands;
    }
    private void drawRands(Graphics g,char[] rands){
        g.setColor(Color.BLACK);
        g.setFont(new Font(null,Font.ITALIC|Font.BOLD,18));
//        在不同位置上输出验证码的每个字符
        for(int i=0;i<4;i++){
            g.drawString(""+rands[i],3+i*15,16+(int)(Math.pow(-1,i+1)));
        }

    }
    private void drawBackground(Graphics g){
        Random random=new Random();
//        画背景
        g.setColor(new Color(0xDCDCDC));
        g.fillRect(0,0,WIDTH,HEIGHT);
//        随机产生120个干扰点
        for(int i=0;i<120;i++){
            int x=random.nextInt(WIDTH);
            int y=random.nextInt(HEIGHT);
            int red=random.nextInt(255);
            int green=random.nextInt(255);
            int blue=random.nextInt(255);
            g.setColor(new Color(red,green,blue));
           //划线
            g.drawOval(x,y,1,0);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
