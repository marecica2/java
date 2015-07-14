package nio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.Scanner;

public class CopyBytes {
	public static void main(String[] args) throws IOException {
		InputStream in = null;
		OutputStream out = null;

		Scanner sc = null;
		final Enumeration<URL> systemResources = ClassLoader.getSystemResources("xanadu.txt");
		try {
			while (systemResources.hasMoreElements())
				System.err.println("item: " + systemResources.nextElement());
			System.err.println(ClassLoader.getSystemClassLoader().getResourceAsStream("xanadu.txt").toString());
			FileReader fr = new FileReader("xanadu.txt");
			System.err.println(fr.getEncoding());
			char[] buf = new char[100];
			fr.read(buf);
			System.err.println(buf);

			in = new BufferedInputStream(new FileInputStream("xanadu.txt"));
			out = new BufferedOutputStream(new FileOutputStream("outagain.txt"));
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}

			sc = new Scanner(in);
			sc.useDelimiter("\\s");
			while (sc.hasNext()) {
				System.err.println("sc " + sc.next());
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
			if (sc != null) {
				sc.close();
			}
		}
	}
}
