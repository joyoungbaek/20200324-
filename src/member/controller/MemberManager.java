package member.controller;

import java.util.Scanner;



import member.model.vo.Member;

public class MemberManager {
	private static Member[] m = new Member[10];
	private static int ctn = 0;
	private Scanner sc = new Scanner(System.in);

	public MemberManager() {}

	public void insertMember() {
		System.out.print("���̵� �Է��ϼ��� : ");
		String userId = sc.next();
		System.out.print("�н����带 �Է��ϼ��� : ");
		String userPwd = sc.next();
		System.out.print("�̸��� �Է��ϼ��� : ");
		String userName = sc.next();
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		System.out.print("������ �Է��ϼ���(M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.print("�̸����� �Է��ϼ��� : ");
		String email = sc.next();

		m[ctn] = new Member(userId, userPwd, userName, age, gender, email);
		ctn++;
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�"); return;
	}

	public void searchId() {
		System.out.print("�˻��� ���̵� �Է��ϼ��� : ");
		String userId = sc.next();
		for(int i = 0; i < m.length; i++) {
			if(m[i].getUserId().equals(userId)){
				printOne(m[i]);
			} else {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
			}
		}
	}

	public void searchName() {
		System.out.print("�˻��� �̸��� �Է��ϼ��� : ");
		String userName = sc.next();
		for(int i = 0; i < m.length; i++) {
			if(m[i].getUserName().equals(userName)) {
				printOne(m[i]);				
			} else {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�."); return;
			}
		}
	}

	public void searchEmail() {
		System.out.print("�˻��� �̸����� �Է��ϼ��� : ");
		String email = sc.next();
		for(int i = 0; i < m.length; i++) {
			if(m[i].getEmail().equals(email)) {
				printOne(m[i]);				
			} else {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�."); return;
			}
		}
	}

	public void updatePwd() {
		System.out.println("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String userId = sc.next();
		System.out.println("������ ��й�ȣ�� �Է��ϼ��� : ");
		String Pwd = sc.next();
		m[ctn].setUserPwd(Pwd);
	}

	public void updateName() {
		System.out.println("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String userId = sc.next();
		System.out.println("������ �̸��� �Է��ϼ��� : ");
		String Name = sc.next();
		m[ctn].setUserName(Name);
	}

	public void updateEmail() {
		System.out.println("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String userId = sc.next();
		System.out.println("������ �̸����� �Է��ϼ��� : ");
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
		System.out.println("ȸ���� ���̵� �˻������ : " + m.information());
	}
}
