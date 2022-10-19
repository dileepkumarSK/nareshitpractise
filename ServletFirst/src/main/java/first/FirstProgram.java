package first;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;
@WebServlet("/dileep")
public class FirstProgram implements Servlet
{

	@Override
	public void destroy() {
		
	}

	@Override
	public ServletConfig getServletConfig() {
		
		return this.getServletConfig();
	}

	@Override
	public String getServletInfo() {
		
		return "ServletFirst";
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
		PrintWriter pw= res.getWriter();
		res.setContentType("text/html");
		pw.println("Wel come ");
		String un=req.getParameter("uname");
		String tn=req.getParameter("tname");
		pw.println(un+" "+tn);
	}

}
