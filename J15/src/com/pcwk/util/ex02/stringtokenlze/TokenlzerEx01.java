/**
* <pre>
* com.pcwk.util.ex02.stringtokenlze
* Class Name : TokenlzerEx01.java
* Description:
* Author: ITSC
* Since: 2022/02/23
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/02/23 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.util.ex02.stringtokenlze;

import java.util.StringTokenizer;
public class TokenlzerEx01 {

//	java.util.StringTokenlzer	
//	긴 문자열을 지정된 구분자(delimiter)를 기준으로 토큰(token)이라는 여러 개 문자열로 잘라내는 데
//	사용한다.

	public static void main(String[] args) {
		String source = "100,200,300,400,500";
		
		StringTokenizer st = new StringTokenizer(source,",");//\t\n\r\f default구분자

	while (st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	
	}

}
