package Collex;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FRW {
	public static void main(String[] args) throws IOException {
		System.out.println(1);
	FileInputStream fos=new FileInputStream("ab.txt");
	System.out.println(2);
	FileInputStream fis=new FileInputStream("abc.txt");
	System.out.println(3);
	int a=0;
	System.out.println(4);
		while((a=fis.read())!=-1) {
			System.out.println(5);
			fos.write(a);
			System.out.println(6);
		}
	}

}
