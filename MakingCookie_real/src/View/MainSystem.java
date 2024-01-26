package View;

import java.util.ArrayList;
import java.util.Scanner;

import controller.MemberController;
import model.MemberDAO;
import model.MemberDTO;

public class MainSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
         //MVC Pattern (Design Pattern 일종)
		// model view controller
		// Model : 데이터를 묶고 데이터 베이스에 접근하는 역할(DAO)
		//View :Client 에게 화면에 보여주고 안내하고 입력받는 역할(Main System)
		//Controller:View와 Model을 이어주는 역할 .조종(Controller)
		
		//Controller 객체 생성
		MemberController controller  = new MemberController();
		
		 //  VIEW CONTROLLER DAO
		//모든 기능에서 사용 할 수 있도록 전역변수 dto,dao 생성
		MemberDTO dto =null;
		//MemberDAO dao =new MemberDAO(); <VIEW에서는 DAO를 사용하지않는다 따라서 주석처리
		
		
		
		while (true) {
			// CRUD create read update delete 최소한의 기능들
			System.out.println("1.회원등록 2.로그인 3.회원목록 4.회원탈퇴 5.회원정보수정 6.종료 >>");
			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.println("=====회원등록=====");
				System.out.println("ID입력: ");
				String id = sc.next();
				System.out.println("PW입력: ");
				String pw = sc.next();
				System.out.println("NAME입력: ");
				String name = sc.next();
				System.out.println("AGE입력: ");
				int age = sc.nextInt();
				// JDBC-회원등록
				// 1.드라이버 로드(동적로딩)
				// 컴파일러가 아래 코드를 보고 해당 드라이버를 찾아가서 적용하기 때문
				
				 dto=new MemberDTO(id,pw,name,age);
				
				 int cnt = controller.join(dto);
				
				
				if (cnt > 0) {
					System.out.println("회원등록 성공");
				} else {
					System.out.println("회원등록 실패");
				}
			}else if (menu == 2) {
				System.out.println("=====로그인=====");
				
				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 :");
                String pw=sc.next();
                
                                    
               MemberDTO info = controller.login(id,pw);   
              if(info != null) {
               System.out.println(info.getName()+"님 환영합니다");
              }
                
			} else if (menu == 3) {
				System.out.println("========전체 회원 목록 조회=======");
				System.out.println("ID\tPW\tName\tAGE");
			      ArrayList<MemberDTO> list =controller.memberList();
				for(int i=0; i<list.size();i++) {
					System.out.print(list.get(i).getId()+"\t");
					System.out.print(list.get(i).getPw()+"\t");
					System.out.print(list.get(i).getName()+"\t");
					System.out.println(list.get(i).getAge()+"\t");
				    
				
				} 
			} else if (menu == 4) {
				System.out.println("=======회원탈퇴=========");
				System.out.println("ID 입력:");
				String id = sc.next();
				
				int cnt = controller.delete(id);
				if(cnt > 0 ) {
					System.out.println("회원탈퇴 성공");
				}else {
					System.out.println("회원탈퇴 실패");		
				}

			} else if (menu == 5) {
				System.out.println("========회원정보수정======");
                //id와 일치하는 회원의 pw,name,age를 수정
				System.out.println("ID 입력:");
                String id= sc.next();
                System.out.println("수정할 pw 입력:");
                String pw=sc.next();
                System.out.println("수정할 name 입력:");
                String name=sc.next();
                System.out.println("수정할 age 입력:");
                int age=sc.nextInt();
                
                dto=new MemberDTO(id,pw,name,age);
                int cnt = controller.update(dto);
                if(cnt>0) {
					System.out.println("회원정보 수정 성공");
				}else {
					System.out.println("회원정보수정 실패");
				}
				
			} else if (menu == 6) {
				System.out.println("프로그램을 종료합니다");
				sc.close();
				break;
			} else {
				System.out.println("정확한 숫자입력해주세요");
			}

		}

	}

}
