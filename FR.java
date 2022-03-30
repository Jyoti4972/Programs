package Collex;

import java.io.FileInputStream;
import java.io.IOException;

public class FR {
	public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("abc.txt");
	int a=0;
		while((a=fis.read())!=-1) {
			char cc=(char) a;
			System.out.println(cc);
		}
	}

}
