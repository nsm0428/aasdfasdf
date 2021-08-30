package raina;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

//학생 관리 프로그램 만들기 
public class Member_Hash {

	HashMap<String, Member_Dto> map = new HashMap<String, Member_Dto>();
	Scanner sc = new Scanner(System.in);
	
	public void display() {
//		Member_Array ma = new Member_Array();
		Member_Hash mh = new Member_Hash();
		Scanner sc = new Scanner(System.in);
				
		while(true) {
			System.out.println("1. 학생 등록  2. 전체 학생 정보  3. 학생 정보 검색  4. 학생 정보 수정  5. 학생 정보 삭제  6. 종료 ");
			System.out.print(">>>");
			int num = sc.nextInt();
			
			switch(num) {			
			case 1 : 
				mh.resgister();
//				ma.resgister();
				break;
			case 2: 
				mh.info();
//				ma.info();
				break;
			case 3: 
				mh.search();
//				ma.search();
				break;
			case 4: 
				mh.modify();
//				ma.modify();
				break;
			case 5 : 
				mh.delete();
	//			ma.delete();
				break;
			case 6 : 
				System.out.println("프로그램을 종료합니다. ");
				System.exit(0);
			}
		}
	}

	// 학생 등록하기
	public void resgister() {
		Member_Dto dto = new Member_Dto();
		System.out.println("학생 이름 : ");
		dto.setName(sc.next());
		System.out.println("학번 : ");
		dto.setStuNum(sc.next());
		System.out.println("이메일 : ");
		dto.setEmail(sc.next());

		map.put(dto.stuNum, dto);
		System.out.println(map);

	}

	// 전체 학생 정보
	public void info() {
		System.out.println("------모든 정보 보기 ------");
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			Member_Dto md = map.get(it.next());
			System.out.println("이름 : " + md.getName());
			System.out.println("학번 : " + md.getStuNum());
			System.out.println("이메일 : " + md.getEmail());
			System.out.println("======================");
		}
	}

	// 학생 정보 검색
	public void search() {
		System.out.println("검색할 학번을 입력하세요 : ");
		String sNum = sc.next();
		Member_Dto d = map.get(sNum);
		
			if (map.containsValue(d)) {
				System.out.println("학번 : " + d.getStuNum());
				System.out.println("학생 이름 : " + d.getName());
				System.out.println("학생 이메일 : " + d.getEmail());				
			} else {
				System.out.println("존재하지 않는 학번입니다.");			
		}
	}

	// 학생 정보 수정
	public void modify() {
		System.out.println("수정할 학번을 입력하세요 : ");
		String sNum = sc.next();
		Member_Dto d = map.get(sNum);

		if (map.containsValue(d)) {
			System.out.println("수정할 이름 : ");
			d.setName(sc.next());
			System.out.println("수정할 이메일 : ");
			d.setEmail(sc.next());
			System.out.println("학생 정보가 수정되었습니다.");
		} else {
			System.out.println("존재하지 않는 학번입니다.");
		}
	}

	// 학생 정보 삭제
	public void delete() {
		System.out.println("삭제할 학번을 입력하세요 : ");
		String sNum = sc.next();
		Member_Dto d = map.get(sNum);
		
		if(map.containsValue(d)) {
			System.out.println("이름 : " + d.getName());
			System.out.println("이메일 : " + d.getEmail());
			System.out.println("===>> 위 학생의 정보가 삭제되었습니다. ");			
			map.remove(sNum, d);
		} else {
			System.out.println("존재하지 않는 학번입니다.");
		}
		
		
		
	}

}







