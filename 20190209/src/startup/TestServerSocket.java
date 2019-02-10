package startup;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServerSocket {

		  public static void main(String[] args){
			  for(;;) { 
			  try{
			        ServerSocket server = new ServerSocket(8888);
			        while(true){
			          Socket socket = server.accept();
			          InputStream in = socket.getInputStream();
			          DataInputStream dis = new DataInputStream(in);
			          String input = dis.readUTF();
			          System.out.println(input);
			        }
			      } catch(Exception e){
			        e.printStackTrace();
			      }
			    }
			  }
}
