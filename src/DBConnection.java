import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
   
     public static Connection con(){
        Connection con =null;
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aruni","root","");
      } catch (Exception e) {
          
      }
      
      return con;
      
        
    }
}
