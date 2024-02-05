package pac1;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletException;

public class TestServlet extends HttpServlet {

	@Override 
	public void init() throws ServletException {
		//TODO Auto-generated method stub
		super.init();
		
		System.out.print("hello ");
	}
}
