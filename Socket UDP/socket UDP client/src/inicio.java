import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;


public class inicio {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msn = JOptionPane.showInputDialog("Ingrese el mensaje a enviar");
		try {
			DatagramSocket miSocket = new DatagramSocket();

			byte[] mensaje = msn.getBytes();
			InetAddress hostServidor = InetAddress.getByName("127.0.0.1");
			int puerto = 9107;
			DatagramPacket miPaquete = new DatagramPacket(mensaje, msn.length(), hostServidor, puerto);
			miSocket.send(miPaquete);

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}