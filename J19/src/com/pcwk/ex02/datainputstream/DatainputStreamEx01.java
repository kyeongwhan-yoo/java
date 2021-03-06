/**
* <pre>
* com.pcwk.ex02.datainputstream
* Class Name : DatainputStreamEx01.java
* Description:
* Author: ITSC
* Since: 2022/03/02
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/03/02 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.ex02.datainputstream;

import java.io.*;

public class DatainputStreamEx01 {

	public static void main(String[] args) {

		//DataOutputStream
		//16진수로 출력
		
		
		try (FileOutputStream fos = new FileOutputStream("Sample.dat");
				DataOutputStream dos = new DataOutputStream(fos);) {

			dos.writeByte(100);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("DataOutputStream");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		//DataInputStream으로 읽기
		//순서, type으로 다시 읽어야 한다.
		
		try (
			FileInputStream fis = new FileInputStream("Sample.dat");
			DataInputStream dis = new DataInputStream(fis);){
				
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
			
			
		}catch( FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e1) {
			e1.printStackTrace();
		}
		
	System.out.println("종료");
}

}
