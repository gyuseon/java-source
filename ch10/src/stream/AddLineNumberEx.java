package stream;

import java.io.BufferedReader;
import java.io.FileReader;


public class AddLineNumberEx {

	public static void main(String[] args) {
		String filePath ="D:\\javasource\\ch10\\src\\stream\\InputStreamEx1.java";
		
		try(FileReader fis = new FileReader(filePath);
			BufferedReader br =new BufferedReader(fis)) {
			
			String str=null;
			int i=1;
			while((str=br.readLine())!=null) {
				System.out.println((i++)+" : "+str);
				
			}
		} catch (Exception e) {		
			e.printStackTrace();
		}
	}

}
