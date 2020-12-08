
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet {

    String name, mob, pass, dob, age;
    PrintWriter out;
    Connection con;
    PreparedStatement pst;
    int i = 0;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        out = response.getWriter();

        //Reterving parameters from RegisterServlet.html page
        name = request.getParameter("name");
        mob = request.getParameter("mob");
        pass = request.getParameter("pass");
        dob = request.getParameter("dob");
        age = request.getParameter("age");

        dbConnect();

        if (i == 1) {
            out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Student Registration</title>");
        out.println("</head>");
        out.println("<body style=\"background-image: url(img5.png);\">");
        out.println("<center>");
        out.println("<table>");
        out.println("<tr><td><h4>Hello !!" + name + ", You are Registered Successfully...." + "</h4></td></tr>");
        out.println("<br/><br/>");
        out.println("<tr><td>Name: </td><td>" + name + "</td></tr>");
        out.println("<tr><td>Contact No: </td><td> " + mob + "</td></tr>");
        out.println("<tr><td>Age: </td><td> " + age + "</td></tr>");
        out.println("<tr><td>Password:</td><td> " + pass + "</td></tr>");
        out.println("<tr><td>Date of Birth: </td><td>" + dob + "</td></tr>");
        out.println("</table>");
        out.println("</center>");
        out.println("</body>");
        out.println("</html>");
        } else {
            out.println();
        }
        /*out.println("Hello !!" + name + ", You are Registered Successfully....");
        out.println();
        out.println();
        out.println("Your Details are as under:");
        out.println("Name: " + name);
        out.println("Contact No: " + mob);
        out.println("Age: " + age);
        out.println("Password: " + pass);
        out.println("Date of Birth: " + dob);*/
    }

    public void dbConnect() {

        String query = "INSERT INTO Register VALUES (?, ?, ?, ?, ?)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ITStudent", "root", "javaee");
            pst = con.prepareStatement(query);

            pst.setString(1, name);
            pst.setString(2, mob);
            pst.setString(3, pass);
            pst.setString(4, dob);
            pst.setInt(5, Integer.parseInt(age));

            i = pst.executeUpdate();

        } catch (Exception e) {
            out.println("SORRY !! An Errror has occured...\n" + e.toString());
        }
    }
}
