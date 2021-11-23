package folder;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class calculator extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            out.println("<html><head><title>Servletcalculator</title></head><body>");
            double n1 = Double.parseDouble(req.getParameter("num1"));
            double n2 = Double.parseDouble(req.getParameter("num2"));
            double result = 0;
            String opr = req.getParameter("opr");
            if (opr.equals("+")) {
                result = n1 + n2;
            }
            if (opr.equals("-")) {
                result = n1 - n2;
            }
            if (opr.equals("*")) {
                result = n1 * n2;
            }
            if (opr.equals("/")) {
                result = n1 / n2;
            }
            out.println("<h1>Result is: " + result);

            out.println("</body></html>");
        }
    }
}
