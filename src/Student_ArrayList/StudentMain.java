package Student_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

import raina.Member_Array;

public class StudentMain {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		ArrayList<DTO> list=new ArrayList<DTO>();
		Member_Array mma = new Member_Array();
		
		String name,Num;
		while(true) {
		System.out.print("기능 입력");
		int num=input.nextInt();
		switch(num) {
		case 1:
			System.out.println("회원가입");
			System.out.print("아이디입럭:");
			name=input.next();
			System.out.print("비밀번호입력");
			Num=input.next();
			DTO dto=new DTO();
			dto.setName(name); 
			dto.setNum(num);
			if(list.contains(name)==true) {
				System.out.println("이미 있는 이름입니다");
			}else{
				list.add(dto);
				System.out.println("가입이 완료 되었습니다");
			}
			break;
		case 2: 
			mma.display();       //김나현 
			break;   
		case 3:break;
		case 4:break;
		case 5:break;
		}
	}
	}
}
