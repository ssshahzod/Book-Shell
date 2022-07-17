package com.example.javaee.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBUtil {

    public static String url = "jdbc:postgresql://127.0.0.1:5432/test";
    public static String user = "postgres";
    public static String password = "pswd";
    public static String driver = "org.postgresql.Driver";


    public static String AddUser(String firstName, String secondName, String email){
        try{
            Class.forName(DBUtil.driver);
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement st = conn.prepareStatement("insert into test.public.student_details values(?, ?, ?)");
            
            st.setString(1, firstName);
            st.setString(2, secondName);
            st.setString(3, email);

            st.executeUpdate();
            st.close();
            conn.close();
            return "Success";
        } catch (SQLException e) {
            e.printStackTrace();
            return e.toString();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
