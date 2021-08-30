package reply;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class ReplyHash {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, ReplyDTO> map = new HashMap<String, ReplyDTO>();
		String id, reply;
		int num;
		
		while(true) {
			System.out.println("HashMap으로 바꿔본 것입니다.");
			System.out.println("1. 댓글입력 2. 댓글 보기 3. 프로그램 종료!");
			num = sc.nextInt();
			switch(num) {
			case 1: 
				System.out.println("아이디를 입력하세요");
				id = sc.next();
				System.out.println("댓글을 입력하세요");
				reply = sc.next();
				ReplyDTO dto = new ReplyDTO();
				dto.setId(id);
				dto.setReply(reply);
				
				map.put(id, dto);
				
			
				break;
			case 2: 
				Iterator<String> it = map.keySet().iterator();
				while(it.hasNext()) {
					ReplyDTO r = map.get(it.next());
					System.out.println("아이디 : " + r.getId());
					System.out.println("댓글 : " + r.getReply());
					System.out.println("------------------");
					
				}
				
				
				break;
			case 3: 
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			
		}
		
		
		
		
		
	}

}
