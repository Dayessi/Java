import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class inicio {
	public static void main(String[] args) {
		try {
			DatagramSocket miSocket = new DatagramSocket(9107);
			byte[] buffer = new byte[1024];
			while(true) {
				DatagramPacket peticion = new DatagramPacket(buffer, buffer.length);
				miSocket.receive(peticion);
				System.out.println("ip: " + peticion.getAddress());
				System.out.println("puerto: " + peticion.getPort());
				System.out.println("mensaje: " + new String(peticion.getData(), 0, peticion.getLength()));
			}
		} catch (SocketException e) {
			System.out.println(e);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}