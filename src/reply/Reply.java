package reply;

import java.util.ArrayList;
import java.util.Scanner;

public class Reply {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<ReplyDTO> list = new ArrayList();
		String id, reply;
		
		int num;
		
		while(true) {
			System.out.println("댓글을 입력하는 기능입니다.");
			System.out.println("1. 댓글 입력 2. 댓글 전체 보기 3. 프로그램 종료!");
			num = sc.nextInt();
			switch (num) {
			case 1: 
				ReplyDTO dto = new ReplyDTO();
				System.out.println("아이디 입력 : ");
				id = sc.next();
				System.out.println("댓글 입력 :");
				reply = sc.next();
				
				dto.setId(id); dto.setReply(reply);
				
				list.add(dto);					
				break;
			case 2: 
				System.out.println("-------모든 댓글을 보여줍니다.------");
				for(int i=0; i<list.size(); i++) {
					System.out.println("게시물 번호 : " + (i + 1));
					System.out.println("이름 : " + list.get(i).getId());
					System.out.println("댓글 : " + list.get(i).getReply());
					System.out.println("--------------------------");
				}
			
				break;
			case 3: 
				System.out.println("프로그램 종료!");
				return ;
				

			
			}
		
		}		
		
	}

}
