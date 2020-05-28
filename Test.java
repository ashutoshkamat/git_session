import java.io.ByteArrayOutputStream;
import java.io.*;
import java.io.FileInputStream;
import java.io.*;
//Commit 1
//commit 2
//Commit 3
//Changes done by feature branch

//Local change
public class Test {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:/ICS/text1.txt");
		FileInputStream fis = new FileInputStream(file);
        //System.out.println(file.exists() + "!!");
        //InputStream in = resource.openStream();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum); //no doubt here is 0
                //Writes len bytes from the specified byte array starting at offset off to this byte array output stream.
                System.out.println("read " + readNum + " bytes,");
            }
        
        byte[] bytes = bos.toByteArray();
        System.out.println(Integer.toBinaryString(bytes[2]));
	
		System.out.println(Integer.parseInt("11",2));
	}
}
