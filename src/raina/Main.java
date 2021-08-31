package raina;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Member_Array ma = new Member_Array();
		Member_Hash mh = new Member_Hash();
		Scanner sc = new Scanner(System.in);
				
		while(true) {
			System.out.println("1. 학생 등록  2. 전체 학생 정보  3. 학생 정보 검색  4. 학생 정보 수정  5. 학생 정보 삭제  6. 종료 ");
			System.out.print(">>>");
			int num = sc.nextInt();
			
			switch(num) {			
			case 1 : 
//				mh.resgister();
				ma.resgister();
				break;
			case 2: 
//				mh.info();
				ma.info();
				break;
			case 3: 
//				mh.search();
				ma.search();
				break;
			case 4: 
//				mh.modify();
				ma.modify();
				break;
			case 5 : 
//				mh.delete();
				ma.delete();
				break;
			case 6 : 
				System.out.println("프로그램을 종료합니다. ");
				System.exit(0);
			}
		}
		

	}

}
