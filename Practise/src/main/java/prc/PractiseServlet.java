package prc;

import java.io.*;


import javax.servlet.*;
import javax.servlet.annotation.WebServlet;



@WebServlet("/practise")
public class PractiseServlet extends GenericServlet {
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		FileInputStream fis=new FileInputStream("C:/Users/nanid/Pictures/Screenshots/img.png");
		int n=fis.available();
		byte b[]=new byte[n];
		fis.read(b);
		ServletOutputStream sos=response.getOutputStream();
		sos.write(b);
		
	}

}
