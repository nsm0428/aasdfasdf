package Student_HashMap;

import java.util.HashMap;
import java.util.Scanner;

import niyaoh.Niyaoh_DTO;
import raina.Member_Hash;

public class StudentMain {
	public static void main(String[] args) {
		Niyaoh_DTO ndto = new Niyaoh_DTO();
		Member_Hash mmh = new Member_Hash();
		
		Scanner input=new Scanner(System.in);
		HashMap<String,DTO> map=new HashMap<String,DTO>();
		while(true) {
		System.out.print("기능 입력");
		int num=input.nextInt();
		switch(num) {
		case 1:ndto.display(); break;	//김도윤 회원관리
		case 2:
			mmh.display();
			break;  //김나현 
		case 3:break;
		case 4:break;
		case 5:break;
		}
	}
	}
}
