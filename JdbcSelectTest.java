import java.sql.*;   // Use 'Connection', 'Statement' and 'ResultSet' classes in java.sql package
import ScalaJdbcConnectSelect;
 
// JDK 1.7 and above
public class JdbcSelectTest extends ScalaJdbcConnectSelect {   // Save as "JdbcSelectTest.java"
   public static void main(String[] args) {
      String strSelect = args[0];// "select title, price, qty from books";
	  //sql(strSelect);
	    //sql(strSelect);
	     //sql(strSelect);
	    //sql(strSelect);
	    //sql(strSelect);
	   //dsgfjhkjsdghh
	   //sql(strSelect);
	   //sql(strSelect);
	   //sql(strSelect);
	  ScalaJdbcConnectSelect scalaClass=new ScalaJdbcConnectSelect();
	     ScalaJdbcConnectSelect scalaClass=new ScalaJdbcConnectSelect();
	  ScalaJdbcConnectSelect scalaClass=new ScalaJdbcConnectSelect();
	   ScalaJdbcConnectSelect scalaClass=new ScalaJdbcConnectSelect();
	   ScalaJdbcConnectSelect scalaClass=new ScalaJdbcConnectSelect();
	   ScalaJdbcConnectSelect scalaClass=new ScalaJdbcConnectSelect();
	    ScalaJdbcConnectSelect scalaClass=new ScalaJdbcConnectSelect();
	  //nbvfjhbxgvkjdl
	    //shjfoidyaoyhfueiwyui
	   //shjfoidyaoyhfueiwyui
	       //shjfoidyaoyhfueiwyui
	    //shjfoidyaoyhfueiwyui
	    //shjfoidyaoyhfueiwyui
	    scalaClass.sql(strSelect);
	   //sql(strSelect);
	    scalaClass.sql(strSelect);
	   //shjfoidyaoyhfueiwyui
	    //shjfoidyaoyhfueiwyui
   }
   
   public void sql(String strSelect) {
         Connection conn = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/ebookshop?useSSL=false", "myuser", "xxxx");
         Statement stmt = conn.createStatement();
         ResultSet rset = stmt.executeQuery(strSelect);
	    ResultSet rset = stmt.executeQuery(strSelect);
	   //dwhnhdklhjjesdkj
	    //dwhnhdklhjjesdkj
	  //khoutygoiyturyeyiedstirs
   }
}
