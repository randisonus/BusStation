/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.sqlite.JDBC;

public class DataBase {
    public static String URL="jdbc:sqlite:data.db";
    private static Connection connection;
    
    public static void Connect() throws SQLException
    {
        DriverManager.registerDriver(new JDBC());
        connection = DriverManager.getConnection(URL);
    }
    
    public static ArrayList<String> Select(String Query)
    {
        try
        {
            ArrayList<String> result = new ArrayList<>();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(Query);
            int columns = rs.getMetaData().getColumnCount();
            while(rs.next())
            {
                String resString = "";
                for(int i = 1; i <= columns; i++)
                resString += rs.getString(i)+";";
                result.add(resString);
            }
            return result;
        }
        catch(SQLException ex)
        {
            System.out.println(ex);
            return null;
        }
    }
    public static int Update(String Query)
    {
        try
        {
            Statement statement = connection.createStatement();
            int row = statement.executeUpdate(Query);
            return row;
        }
        catch(SQLException ex){
            System.out.println(ex);
            return 0;
        }
    }
}
