package socketprogramming;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SmtpServer  extends Thread{
		
	 private static int port = 1000; 
	 private static int maxConnections = 0;
	 
	 public void run(){
		  
	  }
	  
	 public static void main(String[] args) throws IOException {
	
		 SmtpServer server= new SmtpServer();
		 
		System.out.println("In SmtpServer MAIN---");
		ServerSocket listener = new ServerSocket(port);
		 /*establishes connection */
		 int i=0;
		 while ((i++ < maxConnections) || (maxConnections == 0)){
			 Socket socket = listener.accept();
			 DataInputStream in = new DataInputStream(socket.getInputStream());
		     OutputStreamWriter outgoing = new OutputStreamWriter(socket.getOutputStream());
		     System.out.println("........."+in.readChar()+"\n"); 
		     System.out.println("From Client"+in.read());
		     Scanner newline = new Scanner(in);
		     System.out.println("Outgoing:"+newline.next());
		     System.out.println("Outgoing:"+outgoing);
		 }
	}
}
