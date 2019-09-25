package com.biz.iolist.exec;

import com.biz.iolist.service.IolistService;
import com.biz.iolist.service.IolistServiceImpV3;

public class IolistEx_02 {

	public static void main(String[] args) {

		IolistService is = new IolistServiceImpV3();
		
		String fileName = "src/com/biz/iolist/매입매출정보.txt";
		
		try {
			is.read(fileName);
			is.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
