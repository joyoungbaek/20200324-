package member.controller;

import java.util.Scanner;



import member.model.vo.Member;

public class MemberManager {
	private static Member[] m = new Member[10];
	private static int ctn = 0;
	private Scanner sc = new Scanner(System.in);

	public MemberManager() {}

	public void insertMember() {
		System.out.print("아이디를 입력하세요 : ");
		String userId = sc.next();
		System.out.print("패스워드를 입력하세요 : ");
		String userPwd = sc.next();
		System.out.print("이름을 입력하세요 : ");
		String userName = sc.next();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("성별을 입력하세요(M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.print("이메일을 입력하세요 : ");
		String email = sc.next();

		m[ctn] = new Member(userId, userPwd, userName, age, gender, email);
		ctn++;
		System.out.println("입력이 완료되었습니다"); return;
	}

	public void searchId() {
		System.out.print("검색할 아이디를 입력하세요 : ");
		String userId = sc.next();
		for(int i = 0; i < m.length; i++) {
			if(m[i].getUserId().equals(userId)){
				printOne(m[i]);
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다.");
			}
		}
	}

	public void searchName() {
		System.out.print("검색할 이름를 입력하세요 : ");
		String userName = sc.next();
		for(int i = 0; i < m.length; i++) {
			if(m[i].getUserName().equals(userName)) {
				printOne(m[i]);				
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다."); return;
			}
		}
	}

	public void searchEmail() {
		System.out.print("검색할 이메일을 입력하세요 : ");
		String email = sc.next();
		for(int i = 0; i < m.length; i++) {
			if(m[i].getEmail().equals(email)) {
				printOne(m[i]);				
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다."); return;
			}
		}
	}

	public void updatePwd() {
		System.out.println("수정할 회원의 아이디를 입력하세요 : ");
		String userId = sc.next();
		System.out.println("변경할 비밀번호를 입력하세요 : ");
		String Pwd = sc.next();
		m[ctn].setUserPwd(Pwd);
	}

	public void updateName() {
		System.out.println("수정할 회원의 아이디를 입력하세요 : ");
		String userId = sc.next();
		System.out.println("변경할 이름를 입력하세요 : ");
		String Name = sc.next();
		m[ctn].setUserName(Name);
	}

	public void updateEmail() {
		System.out.println("수정할 회원의 아이디를 입력하세요 : ");
		String userId = sc.next();
		System.out.println("변경할 이메일을 입력하세요 : ");
		String Email = sc.next();
		m[ctn].setEmail(Email);
	}

	public void deleteOne() {

	}

	public void deleteAll() {
		m[ctn] = 
	}

	public void printAllMember() {
		for(int i = 0; i < m.length; i++) {
			System.out.println(m[ctn].information());
		}
	}

	public void printOne(Member m) {
		System.out.println("회원의 아이디 검색결과는 : " + m.information());
	}
}

