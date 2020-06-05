package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileInputStreamEx2 {
	
	public static void main(String[] args) {
		
//		FileInputStream fis=null;
//		FileOutputStream fos =null;
		
		try(FileInputStream fis=new FileInputStream(new File("d:\\temp\\test.txt"));
			FileOutputStream out=new FileOutputStream("d:\\temp\\result.txt")) {
			byte b[]=new byte[100];
			while(fis.read(b)!=-1) {
				out.write(b);
			}
		} catch (FileNotFoundException e) {	
			e.printStackTrace();
		} catch (IOException e) {		
			e.printStackTrace();
		}
//		finally {
//			try {
//				fis.close();
//				out.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			
//		}

	}

}