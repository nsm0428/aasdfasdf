package raina;

import java.util.ArrayList;
import java.util.Scanner;

//학생 관리 프로그램 만들기  
public class Member_Array {

	Scanner sc = new Scanner(System.in);
	ArrayList<Member_Dto> arr = new ArrayList<Member_Dto>();
	int total = 0;

	public void display() {
		Member_Array ma = new Member_Array();
//		Member_Hash mh = new Member_Hash();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1. 학생 등록  2. 전체 학생 정보  3. 학생 정보 검색  4. 학생 정보 수정  5. 학생 정보 삭제  6. 종료 ");
			System.out.print(">>>");
			int num = sc.nextInt();

			switch (num) {
			case 1:
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
			case 5:
//				mh.delete();
				ma.delete();
				break;
			case 6:
				System.out.println("프로그램을 종료합니다. ");
				System.exit(0);
			}
		}
	}

	// 학생 등록하기
	public void resgister() {

		Member_Dto dto = new Member_Dto();
		System.out.print("학생 이름 : ");
		dto.setName(sc.next());
		System.out.print("학번 : ");
		dto.setStuNum(sc.next());
		System.out.print("이메일 : ");
		dto.setEmail(sc.next());

		arr.add(dto);
		total++;

	}

	// 전체 학생 정보
	public void info() {

		for (int i = 0; i < arr.size(); i++) {
			System.out.println("--------- 전체 학생 정보(총 인원 : " + total + ")--------");
			System.out.println("학번 : " + arr.get(i).getStuNum());
			System.out.println("이름 : " + arr.get(i).getName());
			System.out.println("이메일 : " + arr.get(i).getEmail());
			System.out.println("------------------------------------------");
		}
	}

	// 학생 정보 검색
	public void search() {
		System.out.println("검색할 학번을 입력하세요 : ");
		String sNum = sc.next();

		for (int i = 0; i < arr.size(); i++) {
			Member_Dto d = arr.get(i);
			if (sNum.equals(d.stuNum)) {
				System.out.println("학생 이름 : " + arr.get(i).getName());
				System.out.println("학생 이메일 : " + arr.get(i).getEmail());
				break;
			} 
		}
		System.out.println("------------------------------");
	}

	// 학생 정보 수정
	public void modify() {

		System.out.println("수정할 학번을 입력하세요 : ");
		String sNum = sc.next();

		for (int i = 0; i < arr.size(); i++) {
			Member_Dto d = arr.get(i);
			if (sNum.equals(d.stuNum)) {
				System.out.println("수정할 이름 : ");
				arr.get(i).setName(sc.next());
				System.out.println("수정할 이메일 : ");
				arr.get(i).setEmail(sc.next());
				System.out.println(" 수정이 완료되었습니다. ");
				break;
			} 
		}
	}

	// 학생 정보 삭제
	public void delete() {
		System.out.println("삭제할 학번을 입력하세요 : ");
		String sNum = sc.next();

		for (int i = 0; i < arr.size(); i++) {
			Member_Dto dd = arr.get(i);
			if (sNum.equals(dd.stuNum)) {
				System.out.println("이름  : " + dd.getName());
				System.out.println("이메일  : " + dd.getEmail());
				arr.remove(i);
				System.out.println(" ===>> 해당 정보가 삭제되었습니다.");
				break;			
			}
		}
	}

}
