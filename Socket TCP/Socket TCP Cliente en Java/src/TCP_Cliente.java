import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

public class TCP_Cliente {
	public static void main(String[] args) {
		String msn = JOptionPane.showInputDialog("Ingrese un mensaje");
		try {
			Socket socket = new Socket("127.0.0.1", 9107);
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			out.writeUTF(msn);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
