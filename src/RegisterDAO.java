import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class RegisterDAO{

    public String userRegister(RegisterModel registerModel)
    {


        String id = registerModel.getId();
        String age = registerModel.getAge();
        String name  = registerModel.getName();
        String email = registerModel.getEmail();
        String pass= registerModel.getPass();

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvcdatabase?useSSL=false","root","");
            PreparedStatement ps= con.prepareStatement(" INSERT INTO register_table VALUES (?,?,?,?,?)");
            ps.setInt(1, Integer.parseInt(id));
            ps.setInt(2, Integer.parseInt(age));
            ps.setString(3,name);
            ps.setString(4,email);
            ps.setString(5,pass);
            ps.executeUpdate();

            int i= ps.executeUpdate();
            if(i  != 0)
            {
                return "success";
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return null;
    }

}
