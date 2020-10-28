// First Import all  the required packages

import javax.servlet.*;
import java.io.*;

public class MyFirstServlet extends GenericServlet {

	// Override the abstract method of GenericServlet
	public void service(ServletRequest req, ServletResponse res) throws IOException,ServletException
	{
		// res.setContentType("text/html");

		// PrintWriter out=res.getWriter();
		// out.print("<html><body>");
		// out.print("<b>hello generic servlet</b>");
		// out.print("</body></html>");

		// To print on browser
		PrintWriter pw=res.getWriter();
		pw.println("Hello, Welcome to Servlets");

		// Prints in server window
		System.out.println("Hello, Welcome to Servlets");

	}
}