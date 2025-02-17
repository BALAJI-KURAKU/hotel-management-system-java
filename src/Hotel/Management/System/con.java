package Hotel.Management.System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class con{
    Connection connection;
    Statement statement;

    public con(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelMS", "root", "Kb@682005");
            statement = connection.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}