package io.file;

import java.io.File;
import java.util.Date;

public class FileManyFunction1 {
	public static void main(String[] args)throws Exception {
		
		File txtFile = new File("D:\\dev\\FileIOTextFile.txt");
		txtFile.createNewFile();
		File txtFolder =new File("D:\\dev\\FileIOFolder");
		txtFolder.mkdirs();
		
		String fileName=txtFile.getName();
		
		System.out.println("fineName :"+fileName);
		
		long longLastModified =txtFile.lastModified()	;
		System.out.println("lastModifie : "+longLastModified);
		Date dateLastModified = new Date(longLastModified);
		System.out.println("dateLastModified: " +dateLastModified);
		
		String filePath = txtFile.getPath();
		System.out.println("filePath : "+filePath);
		String fileAbsoutePath = txtFile.getAbsolutePath();
		System.out.println("fileAbsoutePath : "+fileAbsoutePath);
		String fileCanonicalPath =txtFile.getCanonicalPath();
		System.out.println("fileCanonicalPath : "+ fileCanonicalPath);
		
		txtFile.exists();
		System.out.println("해당 파일이 존재하나요?"+txtFile.exists());
		
		txtFile.isFile();
		txtFolder.isFile();
		System.out.println("해당파일인가요?="+txtFile.isFile());
		System.out.println("해당파일이 파일인가요?="+txtFolder.isFile());
		
		txtFile.isDirectory();
		txtFolder.isDirectory();
		
		System.out.println("폴더인가요??="+txtFile.isDirectory());
		System.out.println("폴더인가요??="+txtFolder.isDirectory());
		
		String[] txtFileList = txtFile.list();
		System.out.println("txtFileList : "+txtFileList);
		
		String[] txtFolderList = txtFolder.list();
		for(int i=0; i<txtFolderList.length ;i++) {
			System.out.println(txtFolderList[i]);
		}
		
		boolean mkdir= txtFolder.mkdir();
		System.out.println("mkdir : "+ mkdir);
		boolean mkdirs= txtFolder.mkdirs();
		System.out.println("mkdirs : "+ mkdirs);
		
		
		
		long freeSapce =txtFile.getFreeSpace(); //사용가능공간
		System.out.println("freeSapce : "+freeSapce);
		long freeSapceGb = ((freeSapce / 1024 ) / 1024 ) /1024;
		System.out.println("freeSapceGb : "+freeSapceGb);
		
		long totalSapce = txtFile.getTotalSpace(); //총사용공간
		System.out.println("totalSapce : "+totalSapce);
		long totalSpaceGB=((totalSapce / 1024 ) / 1024 ) /1024;
		System.out.println("totalSpaceGB : "+totalSpaceGB);
		
		
	
	
	}
	
		

}
