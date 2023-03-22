import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/countMarks")
public class countMarks extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public countMarks() {
        super();
        
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    response.setContentType("text/html");  
	    PrintWriter pw = response.getWriter();  
	    String S1 = request.getParameter("sub1");
	    int s1 = Integer.parseInt(S1);
	    String S2=request.getParameter("sub2");
	    int s2 = Integer.parseInt(S2);
	    String S3=request.getParameter("sub3");
	    int s3 = Integer.parseInt(S3);
	    String S4=request.getParameter("sub4");
	    int s4 = Integer.parseInt(S4);
	    String S5=request.getParameter("sub5");  
	    int s5 = Integer.parseInt(S5);
	    String S6=request.getParameter("sub6");
	    int s6 = Integer.parseInt(S6);
	    int sum = s1+s2+s3+s4+s5+s6;
	    int pr = sum/6;
	    String gr;
	    if(s1 > 40 && s2 > 40 && s3 > 40 && s4 > 40 && s5 >40 && s6 > 40) {
	    if(pr>=80) {
	    			gr= "A+";
	    			}
		else if(pr>=60) {
		            gr= "A";
		}
		else if(pr>=50) {
		            gr= "B";
		}
		else if(pr>=35) {
		            gr= "C";
		}
		else {
		            gr= "fail";
		}
	    request.setAttribute("gr", gr);
	    request.setAttribute("pr", pr);
	    request.setAttribute("sum", sum);
	    
	    RequestDispatcher rd=request.getRequestDispatcher("marksheettable");  
        rd.forward(request, response);
	    }
	    else {
	    	pw.print("<h3>You are Fail in a test</h3>");
	    	RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.include(request, response);
	    }

}
}
