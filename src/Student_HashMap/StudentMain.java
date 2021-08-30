package Student_HashMap;

import java.util.Scanner;

import niyaoh.Niyaoh_DTO;

public class StudentMain {
	public static void main(String[] args) {
		Niyaoh_DTO ndto = new Niyaoh_DTO();
		Scanner input=new Scanner(System.in);
		while(true) {
		System.out.print("기능 입력");
		int num=input.nextInt();
		switch(num) {
		case 1:ndto.display(); break;	//김도윤 회원관리
		case 2:break;
		case 3:break;
		case 4:break;
		case 5:break;
		}
	}
	}
}
