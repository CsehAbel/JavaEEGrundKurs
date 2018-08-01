package cdi;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NamenServlet
 */
@WebServlet("/NamenServlet")
public class NamenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private KontaktManager kontaktManager;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NamenServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    private void setManager(KontaktManager manager){
    	kontaktManager=manager;
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().write("<ol>");
		for(String s:kontaktManager.getKontaktNamen()){
			response.getWriter().write("<li>"+s+"</li>");
		}
		response.getWriter().write("</ol>");
	}

}
