package lifecicle;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class lifyCycle implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("stop the servalet");
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getservaletconfig");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		System.out.println("servalet info");
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("int method colled");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service method colled");
		PrintWriter writer=res.getWriter();
		writer.write("serce method colled");
		writer.println();
		writer.write("tuday"+ new Date().toString());
		writer.println(getServletInfo());
		writer.println(getServletConfig());

		
	}

}