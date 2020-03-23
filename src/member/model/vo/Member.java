package member.model.vo;

public class Member {
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	private String email;
	
	public Member() {}
	
	public Member(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	public Member(String userId, String userPwd, String userName, int age, char gender, String email) {
		this(userId, userPwd, userName);
		this.age = age;
		this.gender = gender;
		this.email = email;				
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public String getUserPwd() {
		return userPwd;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String information() {
		return "아이디는 " + userId + " 비밀번호는 " + userPwd + " 이름은 " + userName
				+ " 나이는 " + age + " 성별은 " + gender + " 이메일은 " + email + "입니다.";
	}
}
