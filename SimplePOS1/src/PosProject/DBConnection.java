package PosProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
    private final String DRIVE = "com.mysql.cj.jdbc.Driver";
    public Connection con;
    public PreparedStatement ps;
    public ResultSet rs;
    
    public DBConnection(){
        try {
            Class.forName(DRIVE);
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pointofsale?useSSL=false","sudo","jenn06");
            if(con != null) {
                System.out.println("Connected Successfully!");
            } else {
                System.out.println("null");
            }
        }
        catch(Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
