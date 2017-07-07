package test;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class Server
  implements Runnable
{
  private static int port = 1529; 
  private static int maxConnections = 0;

  public static void main(String[] args){
    int i = 0;
    Server server = new Server();
    System.out.print("In MAIN fun...");
    try
    {
      ServerSocket listener = new ServerSocket(port);
     
      while ((i++ < maxConnections) || (maxConnections == 0))
      {
        try {
        	
        	
        }
        catch (Exception e)
        {
          System.out.print("Closing Connection And Re-Opning It");
        }
        Socket socket = listener.accept();//establishes connection   
      
     /*   Thread t = new Thread("");
        t.start();*/
        
        DataInputStream in = new DataInputStream(socket.getInputStream());
        OutputStreamWriter outgoing = new OutputStreamWriter(socket.getOutputStream());
        System.out.println("........."+in.readChar()+"\n"); 
        System.out.println("input String========="+in.read());
      	   Scanner newline = new Scanner(in);
      	         if(newline.useDelimiter("\\)")!=null){
      	        	 newline=newline.useDelimiter("\\)");
      	        	 while(newline.hasNext()){
      	     	    	System.out.println(newline.next());
      	     	    	
      	     	    	System.out.println("server_port:"+socket.getPort());
      	     	    	System.out.println("Outgoing:"+outgoing);
      	     	    	 //savetodatabase(newline.next(), socket.getPort(), outgoing);
      	     	    } 
      	         }
      	   
        
        
        
      }
    }
    catch (IOException ioe) {
    	
    }
  }

  public void run()
  {
	  
  }
}