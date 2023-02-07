import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GenarateCardNo extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		PrintWriter write=resp.getWriter();
		resp.setContentType("text/html");
		Random rand=new Random();
		write.write("<ol>");
		for(int i=0;i<200;i++) {
			String cardNum= (rand.nextFloat()+"").substring(2,6) +"-"+(rand.nextFloat()+"").
					          substring(2,6)+"-"+(rand.nextFloat()+"").substring(2,6) +"-"+(rand.nextFloat()+"").substring(2,6);
			write.write("<li>"+cardNum+"</li>");

		}
		write.write("</ol>");

		
	}
	

}
