package com.biz.names.exec;

import java.util.*;

import com.biz.names.service.*;

public class NameExec02 {
	public static void main(String[] args) {
		String sndFile = "src/com/biz/names/이름리스트.txt";
		String fstFile = "src/com/biz/names/한국인성씨.txt";
		String saveFile = "src/com/biz/names/FullNameList.txt";

		NameService ns = new NameService(fstFile, sndFile);
		ns.readFirstFile();
		ns.readSndFile();

		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("=============================");
			System.out.println("1.화면출력 2.파일저장 0.종료");
			System.out.println("=============================");
			System.out.print("업무선택 >>");
			String strM = scan.nextLine();

			int intM = Integer.valueOf(strM);
			if (intM == 0) break;
				ns.makeFullName(10);
			if(intM == 1) ns.viewFullName();
			if(intM ==2) ns.writeFullName(saveFile);
		}
	}

}
