package startup;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class File_Test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name = "c:\\temp.txt";
		try {
			RandomAccessFile file = new RandomAccessFile(name, "rw");

			
			file.seek(file.length());
			
			file.writeBytes(scan.nextLine());
			
			file.seek(0);
			String oneLine = file.readLine();
			System.out.println(oneLine);
		} catch (Exception e) {
			e.printStackTrace();
	
		}
		
		
		

	}

}
