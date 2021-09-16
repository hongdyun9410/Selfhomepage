package io.file;

import java.io.FileOutputStream;

public class IOManyFuntion06 {
	public static void main(String[] args) {
		String path =String.valueOf("D:\\dev\\FileIOTextFile.txt");
		FileOutputStream fos =null;
		
		try {
			fos = new FileOutputStream(path);
			fos.write((int)'S' );
			fos.write((int) 'T');
			fos.write((int) 'O');
			fos.write((int) 'C');
			fos.write((int) 'K');
			fos.write((int) '\r');
			fos.write((int) '\n');
			
			fos.write("futures\r\n".getBytes());
			
			byte[] msg = "StrockAndBonds".getBytes();
			fos.write(msg);
			
		
		}catch(Exception e) {
			e.printStackTrace();

		}finally {
			try {
				if (fos !=null) {
					fos.close();
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
	}
}

