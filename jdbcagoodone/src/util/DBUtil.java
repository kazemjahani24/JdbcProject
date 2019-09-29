//util is the helper class so that when we want to do some operation and we do not have to write the code again and again. for example we can create some  objects in another class to use the methods and classes in this class we can use them again  and again by DButil so that we do not have to write the code again and again
//Try block
//The try block contains set of statements where an exception can occur. A try block is always followed by a catch block, which handles the exception that occurs in associated try block. A try block must be followed by catch blocks or finally block or both.
//Catch block
//A catch block is where you handle the exceptions, this block must follow the try block. A single try block can have several catch blocks associated with it. You can catch different exceptions in different catch blocks. When an exception occurs in try block, the corresponding catch block that handles that particular exception executes. For example if an arithmetic exception occurs in try block then the statements enclosed in catch block for arithmetic exception executes.
package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
// we made is static so we dont have to create another object when we want to access it in other classes
	// when we say static it means it belongs to all the objects.
	public static Connection getConnection() {
	
try	{
	
	// 1.the line below is to load the driver so that now we can communicate with mysql database.because java and sql are diff programs, so to get them connected. now is is only ready for communication
	Class.forName("com.mysql.jdbc.Driver");
	
	//2.the line below shows that the connection between java and database is created.
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exampledb?characterEncoding=latin1&useConfigs=maxPerformance","root","root");
	
	return con;
	
	}
catch (SQLException e) {
	e.printStackTrace();
}  


catch (ClassNotFoundException e) {
	e.printStackTrace();
}  
return null;
	
}
}

