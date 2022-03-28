package com.helperfile;

import java.io.IOException;

public class File_Read_Manager {
	
	private File_Read_Manager() {
		
//		concrete method
	}
	
	
	
	public static File_Read_Manager getInstanceFRM() {
		
		File_Read_Manager frm= new File_Read_Manager();
		
		return frm;

	}
	
	
	
	public Configuration_Reader getInstanceCR() throws IOException {
		
		Configuration_Reader cr= new Configuration_Reader();
		
	    return cr;

	}

}
