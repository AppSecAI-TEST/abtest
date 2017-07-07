package socketprogramming;



import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class SmtpClient {
	
	

    public static void main(String[] args) throws SQLException {

    	Socket smtpSocket = null;  
        DataOutputStream os = null;
        DataInputStream is = null;
    	Connection con = DatabaseConnection.getConnectivity();
    	Statement smtp =con.createStatement();
    	String qry="select q.op1 from question q";
    	 try {
    		
      		 ResultSet rs= smtp.executeQuery(qry);
    			while(rs.next()){
    		smtpSocket = new Socket("localhost", 1000);
              os = new DataOutputStream(smtpSocket.getOutputStream());
              is = new DataInputStream(smtpSocket.getInputStream());
                
                DateFormat timeFormat = new SimpleDateFormat("HHmmss");
                DateFormat dateFormat = new SimpleDateFormat("ddMMyy");
               
               
                String IMEINo="1001";
    				
    				String rawdata=":"+rs.getString(1) +":";
    				rawdata=rawdata.replace(" ", ",");
    				Date time = new Date();
    				//rawdata=rawdata.concat("Date"+timeFormat.format(time));
    				//rawdata=rawdata.concat("Time"+dateFormat.format(time));
    				os.writeBytes(IMEINo+rawdata+"\n"); 
    				System.out.println(IMEINo+rawdata+"\n");
    				
    				try {
						Thread.sleep(1000L);
					} catch (InterruptedException e) {
						
					}
    				
    		}
    		
       } catch (UnknownHostException e) {
           System.err.println("Trying to connect to unknown host: " + e);
       } catch (IOException e) {
           System.err.println("IOException:  " + e);
       }
    } 
    
    
    
}