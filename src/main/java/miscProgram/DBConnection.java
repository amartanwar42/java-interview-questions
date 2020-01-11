package miscProgram;

import java.sql.*;

public class DBConnection {

    public void connectDB(){
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://otbsqlserver;database=JAVA_PRACTICE;user=development;password=jk");
            if(connection !=null){
                System.out.println("connected");
            }

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from Employee");

            while (resultSet.next()){
                int anInt = resultSet.getInt(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
