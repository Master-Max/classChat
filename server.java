import java.io.*;
import java.util.*;
import java.net.*;

public class server{
	public static void main(String[] args){
		ServerSocket ss;
		Socket s;
		int port;
		String ip;

		//ip = Integer.toInt(args[0]);
		port = args[0];

		try{
			ss = new ServerSocket(port);
			while(true){
				s = ss.accept();
				acceptUsers au = new acceptUsers(s);
			}
		}
	}
}
