package io.file;

import java.io.FileInputStream;

public class IOManyFunction04 {
	public static void main(String[] args) {
		
		FileInputStream fis =null;
		
		try {
			fis =new FileInputStream("D:\\dev\\FileIOTextFile.txt");
			
			while(true) {
			int read = fis.read(); //값을 읽어오는 명령
			if(read==-1) break; // read == -1이면 멈춰라
			System.out.println((char)read);
			}	
		}catch(Exception e) {
			e.printStackTrace();
		
			
		}finally {
			try {
				if (fis !=null) {
					fis.close();
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
	}
}

