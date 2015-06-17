package nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;

public class CopyBytes
{
    public static void main(String[] args) throws IOException
    {
        InputStream in = null;
        FileOutputStream out = null;

        final Enumeration<URL> systemResources = ClassLoader.getSystemResources("xanadu.txt");
        while (systemResources.hasMoreElements())
            System.err.println("item: " + systemResources.nextElement());

        System.err.println(ClassLoader.getSystemClassLoader().getResourceAsStream("xanadu.txt").toString());

        try
        {
            in = new FileInputStream("xanadu.txt");

            FileReader fr = new FileReader("xanadu.txt");
            System.err.println(fr.getEncoding());

            char[] buf = new char[100];
            System.err.println(fr.read(buf));
            System.err.println(buf);

            out = new FileOutputStream("outagain.txt");
            int c;

            while ((c = in.read()) != -1)
            {
                out.write(c);
            }
        } finally
        {
            if (in != null)
            {
                in.close();
            }
            if (out != null)
            {
                out.close();
            }
        }
    }
}
