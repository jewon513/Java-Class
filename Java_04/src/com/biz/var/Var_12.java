package com.biz.var;

public class Var_12 {

	public static void main(String[] args) {
		int nCount=0;
		nCount = nCount +1;
		System.out.println("카운트 : " +nCount);
		
		nCount += 1;
		System.out.println("카운트 : " +nCount);
	
		System.out.println("카운트 : " + (++nCount));
		
		int n = nCount++ +1;
		//다 계산되고 마지막에 증가
		
		
		
	}
	

}
