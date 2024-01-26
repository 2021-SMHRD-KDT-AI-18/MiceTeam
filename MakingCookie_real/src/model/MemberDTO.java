package model;

//회원 정보 하나하나 넣기 힘들기에 묶기위하새 만든 클래스
//Data transform object
public class MemberDTO {

	private String id;
	private String pw;
	private String name;
	private int age;

	 
	
	public MemberDTO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}



	// 생성자메소드 (초기화하면서 생성해주는)
	public MemberDTO(String id, String pw, String name, int age) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}
	// getter 메소드
	//dto.getid
	//dto.getpw
	


	public String getId() {
		return id;
	}


	public String getPw() {
		return pw;
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}

	
	
	
	
	
	
	
}
