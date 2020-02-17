import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        HttpSession session = request.getSession();
        Integer count = (Integer) session.getAttribute("count");
        session.setAttribute("count", count == null ? count = 1 : ++count);

        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        pw.printf("<h1>Count = %d%n</h1>", count);
        pw.println("</html>");

    }
}
