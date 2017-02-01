import java.io.*;
import java.util.*;
import java.net.*;

public class classChat{
	public static void main(String[] args){
		ServerSocket ss;
		Socket s;
		int port = 8888;
		String ip;
		int ch;

		Scanner key = new Scanner(System.in);

		//System.out.println("Server [0] or Client [1]");

		//ch = key.nextInt();

		
