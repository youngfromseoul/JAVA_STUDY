package startup;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TestSocket {

	public static void main(String[] args) {
		
		try {
			System.out.println("server�� ��Žõ�");
			Socket socket = new Socket("192.168.4.101", 8888);
			
			  OutputStream out = socket.getOutputStream();
			  DataOutputStream dos = new DataOutputStream(out);
			  dos.writeUTF("55");

			System.out.println("server�� �������");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
