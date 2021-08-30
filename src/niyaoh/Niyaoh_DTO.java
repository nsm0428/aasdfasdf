package niyaoh;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Niyaoh_DTO {

	private HashMap<String, String> member = new HashMap<String, String>();
	private String registerId;
	private String registerPw;
	private String loginId;
	private String loginPw;
	private int admin;
	
	Scanner sc = new Scanner(System.in);
	
	public void display() {
		admin = 0;
		while(true) {
			System.out.println("==============================");
			System.out.println("회원관리 프로그램입니다. (By Niyaoh)");
			adminConfirmPrint();
			System.out.println("원하시는 기능을 선택해주세요.");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. (관리자)회원정보 조회");
			System.out.println("4. (관리자)회원정보 전체 조회");
			System.out.println("5. 관리자 인증");
			System.out.println("6. 프로그램 종료");
			System.out.print("선택 >>> ");
			int select = sc.nextInt();
			
			switch(select) {
			case 1 :registerFunc();
					break;
			case 2 :loginFunc();
					break;
			case 3 :infoSearchFunc();
					break;
			case 4 :infoAllSearchFunc();
					break;
			case 5 :adminConfirmFunc();
					break;
			case 6 :endFunc();
					break;
			}
		}		
	}
	
	public void registerFunc() {
		System.out.println("==============================");
		System.out.println("회원가입을 시작합니다.");
		System.out.print("아이디 : ");
		registerId = sc.next();
		
		if(member.containsKey(registerId) == true) {
			System.out.println("이미 존재하는 아이디입니다.");
		} else {
			System.out.print("비밀번호 : ");
			registerPw = sc.next();
			member.put(registerId, registerPw);
			System.out.println("회원가입이 정상 처리되었습니다.");
		}
	}
	
	public void loginFunc() {
		System.out.println("==============================");
		System.out.println("로그인을 시작합니다.");
		System.out.print("아이디 : ");
		loginId = sc.next();
		System.out.print("비밀번호 : ");
		loginPw = sc.next();
		if(member.containsKey(loginId) == true) {
			String tempPw = (String)member.get(loginId);
			if(tempPw.equals(loginPw)) {
				System.out.println("로그인에 성공하였습니다.");
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	
	public void infoSearchFunc() {
		if(admin == 1) {
			System.out.println("==============================");
			System.out.println("조회할 회원의 아이디를 입력하세요.");
			System.out.print("아이디 : ");
			String searchId = sc.next();
			if(member.containsKey(searchId) == true) {
				String searchPw = (String)member.get(searchId);
				System.out.println(searchId + " 님의 비밀번호는 " + searchPw + " 입니다.");
			} else {
				System.out.println("조회하신 결과가 존재하지 않습니다.");
			}
		} else {
			System.out.println("관리자만이 접근할 수 있습니다.");
		}
	}
	
	public void infoAllSearchFunc() {
		if(admin == 1) {
			System.out.println("==============================");
			Set set = member.keySet();
			Iterator it = set.iterator();
			while(it.hasNext()) {
				String memberKey = (String)it.next();
				System.out.println(memberKey + " 님의 비밀번호 : " + member.get(memberKey));
			}
		} else {
			System.out.println("관리자만이 접근할 수 있습니다.");
		}
		
	}
	
	public void adminConfirmFunc() {
		System.out.println("==============================");
		System.out.println("관리자라면 Y");
		System.out.println("관리자가 아니거나, 회원으로 돌아가려면 N");
		System.out.print("답변 >>> ");
		String answer = sc.next();
		if(answer.equals("Y")) {
			admin = 1;
			System.out.println("관리자로 변경되었습니다.");
		} else {
			admin = 0;
			System.out.println("관리자 인증에 실패하였습니다.");
		}
	}
	
	public void adminConfirmPrint() {
		if(admin == 1) {
			System.out.println("[ 현재 권한 : 관리자 ]");
		} else {
			System.out.println("[ 현재 권한 : 회원 ]");
		}
	}
	
	public void endFunc() {
		System.out.println("==============================");
		System.out.println("회원관리 프로그램을 종료합니다.");
		System.exit(0);
	}
	
	
	
}
