import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/marksheettable")
public class marksheettable extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public marksheettable() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); 
	    PrintWriter pw = response.getWriter();
	    String s1 = request.getParameter("sub1");
	    String s2=request.getParameter("sub2");
	    String s3=request.getParameter("sub3");
	    String s4=request.getParameter("sub4");
	    String s5=request.getParameter("sub5");  
	    String s6=request.getParameter("sub6");
	    int sum= (int)request.getAttribute("sum");
	    int pr= (int)request.getAttribute("pr");
	    String gr= (String) request.getAttribute("gr");
		pw.print(" <table style=\"border: 1px solid;\">\r\n"
 	    		+ "            <tr>\r\n"
 	    		+ "                <td>Subject 1</td>\r\n"
 	    		+ "                <td>"+s1+"</td>\r\n"
 	    		+ "            </tr>\r\n"
 	    		+ "            <tr>\r\n"
 	    		+ "                <td>Subject 2</td>\r\n"
 	    		+ "                <td>"+s2+"</td>\r\n"
 	    		+ "            </tr>\r\n"
 	    		+ "            <tr>\r\n"
 	    		+ "                <td>Subject 3</td>\r\n"
 	    		+ "                <td>"+s3+"</td>\r\n"
 	    		+ "            </tr>\r\n"
 	    		+ "            <tr>\r\n"
 	    		+ "                <td>Subject 4</td>\r\n"
 	    		+ "                <td>"+s4+"</td>\r\n"
 	    		+ "            </tr>\r\n"
 	    		+ "            <tr>\r\n"
 	    		+ "                <td>Subject 5</td>\r\n"
 	    		+ "                <td>"+s5+"</td>\r\n"
 	    		+ "            </tr>\r\n"
 	    		+ "            <tr>\r\n"
 	    		+ "                <td>Subject 6</td>\r\n"
 	    		+ "                <td>"+s6+"</td>\r\n"
 	    		+ "            </tr>\r\n"
 	    		+ "            <tr>\r\n"
 	    		+ "                <td>grade</td>\r\n"
 	    		+ "                <td>"+gr+"</td>\r\n"
 	    		+ "            </tr>\r\n"
 	    		+ "            <tr>\r\n"
 	    		+ "                <td>Total marks</td>\r\n"
 	    		+ "                <td>"+sum+"</td>\r\n"
 	    		+ "            </tr>\r\n"
 	    		+ "            <tr>\r\n"
 	    		+ "                <td>Percentage</td>\r\n"
 	    		+ "                <td>"+pr+"</td>\r\n"
 	    		+ "            </tr>\r\n"
 	    		+ "    </table>");  
	}

}
