package model;

//DAO :Data Access Object
//Member table과 data를 주고 받는 기능들을 
//회원관리를 위해 모아둔 클래스
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs=null;
	
	// 회원가입 기능

	public int join(MemberDTO dto) {

		String id = dto.getId();
		String pw = dto.getPw();
		String name = dto.getName();
		int age = dto.getAge();
		int cnt=0;
		try {
			// 에러가 나는 이유
			// 해당위치에 드라이버 파일이 없을 수도 있고
			// 잘못된 경로를 입력했을때
			connection();
			// 3.SQL문장 실행
			// PreparedStatement
			String sql = "INSERT INTO member VALUES(?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setInt(4, age);
			// executeUpdate()는 실행한 문장의 개수를 반환
			cnt = psmt.executeUpdate();

			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(); // catch 넘어가거나 아니면 try가 잘 실행돼도 무조건 마지막에 실행되는 부분
		}
            return cnt;
	}

	//로그인 기능
	public MemberDTO login (String id, String pw) {
		
			//DB연동 메소드
		
		connection();
        //쿼리문 작성
		MemberDTO info = null;
		
		try {
			String sql="select * from member where id =? and pw = ?";
			psmt=conn.prepareStatement(sql);
			psmt.setString(1, id);
	        psmt.setString(2, pw);
	        
	        //CRUD : CREATE , READ , UPDATE ,DELETE
	        //executeUpate() : 삽입(insert),수정(update),삭제(delete)
	        //->실행에 성공했을 때 수행된 row 수를 반환(int)
	        //executeQuery():조회(select)
	        //->ResultSet:커서 객체
	        
	       rs= psmt.executeQuery();
	           //모든 예외상황의 상위 옵션 = Exception
	       
	       if(rs.next()) {
	    	  String login_id= rs.getString(1);
	    	  String login_pw= rs.getString("PW");
	          String login_name=rs.getString(3);
	          int login_age=rs.getInt(4);
	          System.out.println(login_name+"님 환영합니다");
	          info=new MemberDTO(login_id, login_pw, login_name, login_age);
	       }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
	return info;
	
		
	}
	
	//회원목록조회기능
	public ArrayList<MemberDTO> memberList() {
            //회원들의 목록을 저장 할 ArrayList 생성
		ArrayList<MemberDTO> list= new ArrayList<MemberDTO>();
		try {
			
			connection();
			String sql="select * from member";
					psmt=conn.prepareStatement(sql);
			rs=psmt.executeQuery();
		
		while(rs.next()==true) {
			String id = rs.getString(1);
			String pw = rs.getString(2);
			String name = rs.getString(3);
			 int age  = rs.getInt(4);
			MemberDTO dto= new MemberDTO(id, pw, name, age);
		       list.add(dto);
		}
		
		
		} catch (Exception e) {
			// TODO: handle exception
			
		}finally {
			close();
		}
		return list;
		
	}
		
		
		//회원탈퇴
		
		public int delete(String id) {
			
			int cnt=0;
			
			connection();
			String sql="delete * from member where id=?";
				
			try {
				
				psmt = conn.prepareStatement(sql);//sql을 실행하는 객체
				psmt.setString(1, id);
				cnt=psmt.executeUpdate();//실행한 문장의 횟수를 반환 
				
				
			}	catch (Exception e) {
				
			}finally {
				close();
			}
			return cnt;
			
			}
			
		//회원정보수정
		public int update(MemberDTO dto) {
			connection();
			int cnt=0;
			
			String sql="UPDATE MEMBER SET PW=?,NAME=?,AGE=? WHERE ID = ?";
			try {
				psmt=conn.prepareStatement(sql);
				psmt.setString(1, dto.getPw());
				psmt.setString(2, dto.getName());
				psmt.setInt(3, dto.getAge());
				psmt.setString(4, dto.getId());
			                
				// executeUpdate()는 실행한 문장의 개수를 반환
				cnt = psmt.executeUpdate();//특정 행이 바뀌므로 update 

				
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				close();
			}
			return cnt;
			
			
		}
		
	
		
	
	
		  
		
	 
	
	
	
	
	
	private void close() {
		try {
			if( rs !=null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void connection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2.Connection연결
		// -연결하기 위해서는 3개의 정보 필요(주소,계정,비밀번호)
		String db_url = "jdbc:oracle:thin:@project-db-campus.smhrd.com:1524:xe";
		String db_id = "campus_23K_AI18_p1_5";
		String db_pw = "smhrd5";

		conn = DriverManager.getConnection(db_url, db_id, db_pw);

		if (conn != null) {
			System.out.println("Connection 연결 성공");
		} else {
			System.out.println("connection 연결 실패");
		}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} 
	
	
	
	
}
