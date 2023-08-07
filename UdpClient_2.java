import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UdpClient_2
{
	public static void main(String args[]) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		DatagramSocket ds = new DatagramSocket();
		InetAddress ip = InetAddress.getLocalHost();
		byte buf[] = null;
		while (true)
		{
			String inp = sc.nextLine();
			buf = inp.getBytes();
			DatagramPacket DpSend = new DatagramPacket(buf, buf.length, ip, 1234);
			ds.send(DpSend);
			byte[] buffer = new byte[1000];
			DatagramPacket reply = new DatagramPacket(buffer, buffer.length);
			ds.receive(reply);
			System.out.println("Reply from the server: " + (new String(reply.getData())).trim());
			if (inp.equals("bye")) 
				break;
		}
	}
}
