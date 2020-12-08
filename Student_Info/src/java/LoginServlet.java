import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

    String uname, pass, query, db_pass;
    Connection con;
    Statement st;
    ResultSet rs;
    PrintWriter out;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        uname = request.getParameter("username");
        pass = request.getParameter("password");
        
        query = "SELECT * FROM login WHERE Username = '" +uname+ "'";
        dbConnect();
        if(pass.equals(db_pass)){
                response.sendRedirect("Register.html");
            }else{
                response.sendRedirect("Login.html");
            }
        out = response.getWriter();
        out.print(query);
        
    }

public void dbConnect() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ITStudent","root", "javaee");
            st = con.createStatement();
            
            rs = st.executeQuery(query);
            
            while(rs.next())
                db_pass = rs.getString(2);
            
        } catch (ClassNotFoundException | SQLException e) {
            out.println(e.toString());
        }
    }
    
}
