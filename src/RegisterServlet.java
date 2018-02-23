import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    public RegisterServlet(){
    }
    //RegisterServlet receiving  all the detail from the input

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String id = request.getParameter("id");
       String age = request.getParameter("age");
       String name = request.getParameter("name");
       String email = request.getParameter("email");
       String pass = request.getParameter("pass");

       //RegisterModel is where user detail is going to be inserted and can be access from any point
       RegisterModel registerModel = new RegisterModel();


       registerModel.setId(id);
       registerModel.setAge(age);
       registerModel.setName(name);
       registerModel.setEmail(email);
       registerModel.setPass(pass);

       //the class that make connection with the database
       RegisterDAO registerDAO =new RegisterDAO();

       //the core logic is invoke here from userRegister , we are going to insert the data from here..
       String userRegistered = registerDAO.userRegister( registerModel );

       if( userRegistered.equals("success") ){
           request.getRequestDispatcher("/success.jsp").forward(request,response);
       }else {
           request.getRequestDispatcher("/index.jsp").forward(request,response);

       }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
