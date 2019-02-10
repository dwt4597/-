package com.biz.names.exec;

import java.util.*;

import com.biz.names.service.*;

public class NameExec01 {

	/*
	 * ================================= 
	 * 1.화면출력 2. 파일저장 0.종료
	 * ================================= 
	 * 업무선택 >>
	 * 
	 * 1을 선택하면 화면에 보여주고 2를 선택하면 파일에 저장
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String sndFile = "src/com/biz/names/이름리스트.txt";
		String fstFile = "src/com/biz/names/한국인성씨.txt";
		String saveFile = "src/com/biz/names/FullNameList.txt";
		NameService ns = new NameService(fstFile, sndFile);
		
		ns.readFirstFile();
		ns.readSndFile();
		while (true) {
			System.out.println("=======================================");
			System.out.println("1.화면출력 | 2. 파일저장 | 0.종료");
			System.out.println("=======================================");
			System.out.print("업무선택 >>");
			String select = scan.nextLine();
			try {
				
				ns.makeFullName(10);
				int selected = Integer.valueOf(select);
				if (selected == 1)
					ns.viewFullName();
				if (selected == 2)
					ns.writeFullName(saveFile);
				if (selected == 0) {
					System.out.println("종료함다");
					return;
				}
				if (selected > 2) {
					System.out.println("이상한숫자입력");
					System.out.println("다시입력하세요");
				}
			} catch (Exception e) {
				// TODO: handle exception
			} 

		}

	}

}
