package com.biz.names.exec;

import com.biz.names.service.*;

public class NameExec03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sndFile = "src/com/biz/names/이름리스트.txt";
		String fstFile = "src/com/biz/names/한국인성씨.txt";
		String saveFile = "src/com/biz/names/FullNameList.txt";
		
		NameService ns = new NameService(fstFile,sndFile);
		ns.readFirstFile();
		ns.readSndFile();
		ns.menu();
	}

}
