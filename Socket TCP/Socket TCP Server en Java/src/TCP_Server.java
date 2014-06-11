import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class TCP_Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket miSocket = new ServerSocket(80);
			System.out.println("Socket TCP iniciado...");
			while( true ) {
				Socket socket = miSocket.accept();
				//DataInputStream in = new DataInputStream(socket.getInputStream());
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter out = new PrintWriter(socket.getOutputStream());
				
				System.out.println("Ip: " + socket.getInetAddress());
				System.out.println("Puerto: " + socket.getPort());
				System.out.println("Mensaje: " + in.readLine());
		
				// headers
				out.println("HTTP/1.0 200 OK");
				out.println("Content-Type: text/html; charset=utf-8");
				out.println("Server: Mini server Programa tu Mismo");
				out.println("");
				// codigo html
				out.println("Hola mundo, mensaje desde programa tu mismo");
				out.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
