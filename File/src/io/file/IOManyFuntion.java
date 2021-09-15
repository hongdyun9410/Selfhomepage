package io.file;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class IOManyFuntion {
	public static void main(String[] args) throws IOException {
		String strProperty= System.getProperty("fill.encoding");
		System.out.println("strProperty : "+strProperty);
		//인코딩
		String msg1=String.valueOf("한글");
		
		byte[] bytes =msg1.getBytes();
		byte[] ms949s=msg1.getBytes("Ms949");
		byte[] eucKrs=msg1.getBytes("Euc-KR");
		byte[] UTF8s=msg1.getBytes("UTF8");
		
		System.out.println("bytes : "+bytes);
		System.out.println("ms949s : "+ms949s);
		System.out.println("eucKrs : "+eucKrs);
		System.out.println("UTF8 : "+UTF8s);
		
		System.out.println();
		//디코딩
		String strBytes =new String(bytes);
		String strMs959 =new String(ms949s,"MS949");
		String strEuckr =new String(eucKrs,"EUC-KR");
		String strUTF8 =new String(UTF8s,"UTF-8");
		
		System.out.println("strBytes : "+strBytes);
		System.out.println("strMs959 : "+strMs959);
		System.out.println("strEuckr : "+strEuckr);
		System.out.println("strUTF8 : "+strUTF8);
		System.out.println();
		System.out.println();
	}

}
