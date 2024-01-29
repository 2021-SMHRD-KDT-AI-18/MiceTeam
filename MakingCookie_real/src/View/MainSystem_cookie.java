package View;

import java.util.ArrayList;
import java.util.Scanner;

import controller.CookieCon;
import controller.MemberController;
import model.MemberDTO;
import model.enemy1;
import model.enemy2;
import model.enemy3;

public class MainSystem_cookie {

	public static void main(String[] args) {

		CookieCon cookieCon = new CookieCon(); // 쿠키의 전반적인 기능을 담당할 클래스
		// 쿠키 관련된 기능을 메소드로 빼고싶다면
		// 위에 클래스 안에 메소드로 정의하면된다

		MemberController controller = new MemberController();

		MemberDTO dto = null;
		Scanner sc = new Scanner(System.in);

		System.out.println(
				" ------------.  ,------- :!!:  -------- :!!-    .-------     ,------- ~!!~  ---.          \r\n"
						+ "           $@@@@@@@@@@@~  =@@@@@@# *@@= .$@@@@@@@ *@@:   #@@@@@@@@@!   *@@@@@@@ !@@; ,#@@:          \r\n"
						+ "           $@@@@@@@@@@@~  =@@@@@@@ *@@= .$@@@@@@@ *@@:  *@@@@@@@@@@@~ .=@@@@@@@ !@@; ,@@@:          \r\n"
						+ "           -~~~~~~~~#@@-  -~~~!@@@ *@@=  -~~~#@@@ *@@: .=@@!~~~~~$@@:  -~~~@@@@ !@@; ,@@@:          \r\n"
						+ "           ~;;;;;;;;#@@-      ;@@@ *@@=      #@@# *@@: .$@@:    .=@@:      #@@@ !@@; ,@@@~          \r\n"
						+ "           $@@@@@@@@@@@-  -~~~$@@@ *@@=  ,~~~@@@* *@@:  *@@@@@@@@@@@~      #@@= !@@; ,@@@~          \r\n"
						+ "           $@@@@@@@@@@@-  =@@@@@@= *@@=  =@@@@@@~ *@@:  ,@@@@@@@@@@=.      #@@- !@@; ,@@@~          \r\n"
						+ "                    =@@-  =@@@@@@, *@@=  =@@@@@@  *@@:    .;;;;;;:        ,@@@. !@@; .$@@-          \r\n"
						+ "           -~~~~~~~~;!!:     *@@@  *@@=     =@@$  *@@: .~~~~~~~~~~~~-     *@@#  !@@; .=@#,          \r\n"
						+ "          .$@@@@@@@@@@@@    -#@@;  *@@=    -@@@:  *@@: -@@@@@@@@@@@@=    ,#@@;  !@@;  *@#.          \r\n"
						+ "          .$@@@@@@@@@@@@   .@@@#,  *@@=   -@@@=   *@@: -@@@@@@@@@@@@=   -@@@$   !@@;                \r\n"
						+ "           ;****@@@=****  $@@@@~   *@@= -#@@@#-   *@@: ,!****@@@****: ,#@@@#~   !@@;  ;@!.          \r\n"
						+ "               .@@@-      =@@=-    *@@= .$@@*,    *@@:      .@@@       =@@*,    !@@; ,#@@~          \r\n"
						+ "               .@@#-      =*.      *@@=  !!       *@@:      .@@@       ;!.      !@@; .=@#,          \r\n"
						+ "                ---                ,--,           ,--.       ---                ,--,  ,!-           ");

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

				dto = new MemberDTO(id, pw, name, age);

				int cnt = controller.join(dto);

				if (cnt > 0) {
					System.out.println("회원등록 성공");
				} else {
					System.out.println("회원등록 실패");
				}
			} else if (menu == 2) {
				System.out.println("=====로그인=====");

				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 :");
				String pw = sc.next();

				MemberDTO info = controller.login(id, pw);
				if (info != null) {
					System.out.println(info.getName() + "님 환영합니다");
				}
				break;
			} else if (menu == 3) {
				System.out.println("========전체 회원 목록 조회=======");
				System.out.println("ID\tPW\tName\tAGE");
				ArrayList<MemberDTO> list = controller.memberList();
				for (int i = 0; i < list.size(); i++) {
					System.out.print(list.get(i).getId() + "\t");
					System.out.print(list.get(i).getPw() + "\t");
					System.out.print(list.get(i).getName() + "\t");
					System.out.println(list.get(i).getAge() + "\t");

				}
			} else if (menu == 4) {
				System.out.println("=======회원탈퇴=========");
				System.out.println("ID 입력:");
				String id = sc.next();

				int cnt = controller.delete(id);
				if (cnt > 0) {
					System.out.println("회원탈퇴 성공");
				} else {
					System.out.println("회원탈퇴 실패");
				}

			} else if (menu == 5) {
				System.out.println("========회원정보수정======");
				// id와 일치하는 회원의 pw,name,age를 수정
				System.out.println("ID 입력:");
				String id = sc.next();
				System.out.println("수정할 pw 입력:");
				String pw = sc.next();
				System.out.println("수정할 name 입력:");
				String name = sc.next();
				System.out.println("수정할 age 입력:");
				int age = sc.nextInt();

				dto = new MemberDTO(id, pw, name, age);
				int cnt = controller.update(dto);
				if (cnt > 0) {
					System.out.println("회원정보 수정 성공");
				} else {
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

		ArrayList<enemy> enemys = new ArrayList<>();
		enemy enemy1 = new enemy1("세균맨", 5, 50);
		enemy enemy2 = new enemy2("추종자", 50, 500);
		enemy enemy3 = new enemy3("악마", 100, 1000);

		enemys.add(enemy1);
		enemys.add(enemy2);
		enemys.add(enemy3);
		// 악당1 능력치
		String enemyname0 = enemys.get(0).getName();
		int enemyAtk0 = enemys.get(0).getEnemyAtk();
		int enemyHp0 = enemys.get(0).getEnemyHp();
		// 악당 2 능력치
		String enemyname1 = enemys.get(1).getName();
		int enemyAtk1 = enemys.get(1).getEnemyAtk();
		int enemyHp1 = enemys.get(1).getEnemyHp();

		// 악당 3 능력치
		String enemyname2 = enemys.get(2).getName();
		int enemyAtk2 = enemys.get(2).getEnemyAtk();
		int enemyHp2 = enemys.get(2).getEnemyHp();

//		 System.out.printf("%s,%d,%d",name0,enemyAtk0,enemyHp0);

		int atk = 10;
		int dex = 10;
		int maxHp = 100;
		int nowHp = 100;
		int exp = 0;
		String grade = "하급";
		String cookieName = null;
		String enemyName = null;
		int day = 1;
		int traincnt = 5;

		int enemyHp = 0;
		int enemyAtk = 0;

		
		String text = " 평화로운 쿠키마을에 사는 용맹한 전사 쿠키는 어느 날, 악당 초코몬스터와 그의 부하들이 공격해왔다. 마을은 파괴되고 주민들은 위협받고 있었다."
				+ " 쿠키는 자신의 마을을 지키기 위해 전사로 일어나 악당에 맞서기로 결심한다. "
				+ "그는 특별한 능력과 함께 무기를 갖추고, 모험과 도전 속에서 성장하며 친구들과 협력하여 마을을 되찾는 여정에 나선다. "
				+ "악당을 물리치고 마을에 다시 평화가 찾아오게끔, 쿠키는 용감한 용사로서의 자부심을 얻는다.\r\n";

		for (int i = 0; i < text.length(); i++) {
			System.out.print(text.charAt(i));

			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (i % 45 == 0) {
				System.out.println();

			}
		}

		System.out.println("==================================쿠키 설명=====================================");
		// 캐릭터 선택
		System.out.print("1.용맹쿠키\n" + " 용맹함으로 장차 두려움없이 적진에 진입하여 쿠키마을을 지켜내는 전사쿠키 \n");

		System.out.print("2.딸기쿠키\n" + " 5대 마법사 가문의 혈통을 이어받아 아직은 소심하지만 대마법사의 잠재력을 지니고 있는 마법사 쿠키\n");

		System.out.println("========================================" + "==========================================");
		System.out.println("캐릭터 번호를 선택해 주세요>>");
		int Character = sc.nextInt();

		if (Character == 1) {

			cookieName = "용감한 쿠키";
		} else if (Character == 2) {

			cookieName = "딸기 쿠키";
		} else {
			System.out.println("쿠키가 없습니다.");
		}

		System.out.println(
				cookieName + "를 더욱 강한 쿠키로 성장시켜주세요\r\n " + "쿠키정보\r\n" + "=================================\r\n" + "이름:"
						+ cookieName + "\r\n" + "등급:" + grade + " 쿠키\r\n" + "공격력:" + atk + "\r\n" + "민첩력" + dex + "\r\n"
						+ "체력:" + maxHp + "\r\n" + "경험치:" + exp + "/100\r\n" + "=================================\r\n");

			while (true) {
				if (traincnt == 0) {
					System.out.println();
					System.out.println();
					System.out.println("================================================\r\n"
							+ "훈련 횟수를 전부 소진했습니다 마을을 지키기 위한 전투를 준비하십시오\r\n"
							+ "================================================");
				}
				System.out.println("\r\n" + day + "번째 날\r\n" + "남은 훈련횟수: " + traincnt + "\r\n"
						+ "============================================================\r\n"
						+ "1.근력 훈련 2.민첩 훈련 3.체력 훈련 4.휴식 취하기 5.악당과 전투 6.쿠키 진화\r\n"
						+ "============================================================\r\n"
						+ "오늘 쿠키와 훈련 할 방법을 선택해주세요\r\n");
				
			int menu = sc.nextInt();
			if (menu == 1 && traincnt > 0) {
				atk += 5000;
				traincnt--;
				System.out.println(cookieName + "가 쇠질을 하며 공격력이 올라갔습니다. 현재 공격력: " + atk);
					
				} else if (menu == 2 && traincnt > 0) {
					dex += 5;
					traincnt--;
					System.out.println(cookieName + "가 민첩 훈련을 하며 민첩성이 올라갔습니다 현재 민첩성 :" + dex);
					
				} else if (menu == 3 && traincnt > 0) {
					maxHp += 10;
					nowHp += 10;
					traincnt--;
					System.out.println(cookieName + "가 유산소 운동을 하며 체력이 올라갔습니다 현재 체력" + maxHp);
					
						
				
			} else if (menu == 4 && traincnt > 0) {
				System.out.println(cookieName + "가 휴식을 취합니다 체력이 완전히 회복됩니다");
				nowHp = maxHp;
				traincnt--;
				if (traincnt == 0) {
					System.out.println();
					System.out.println();
					System.out.println("================================================\r\n"
							+ "훈련 횟수를 전부 소진했습니다 마을을 지키기 위한 전투를 준비하십시오\r\n"
							+ "================================================");

				}

			} else if (menu == 5) {
				if (grade.equals("하급")) {
					enemyName = "세균맨";
					enemyHp = 100;
					enemyAtk = 10;
					enemy1.fight();
				} else if (grade.equals("중급")) {
					enemyName = "추종자";
					enemyHp = 500;
					enemyAtk = 50;
					enemy2.fight();
				} else if (grade.equals("상급")) {
					enemyName = "악마";
					enemyHp = 1000;
					enemyAtk = 100;
					enemy3.fight();
				}
				System.out.println("용감한 쿠키에게 어떤 행동을 시키겠습니까? >>" + "1.공격 2.도망친다");
				int command = sc.nextInt();

				while (true) {

					if (command == 1) {

						enemyHp = enemyHp - atk;
						System.out.println(cookieName + "(은)는" + enemyName + "에게 쿠키 펀치를 날렸다" + atk + "의 피해를 입혔다 남은"
								+ enemyName + "체력:" + enemyHp);
						nowHp = nowHp - enemyAtk;
						System.out.println(enemyName + "이(가)" + cookieName + "에게 세균펀치를 날렸다" + enemyAtk
								+ "의 피해를 입혔다 남은 용감한 쿠키 체력:" + nowHp);
						if (enemyHp <= 0) {
							System.out.println("100의 경험치를 얻었다! 진화를 할 수 있을 것 같다");
							exp += 100;
							day++;
							traincnt = 5;
							break;
						} else if (nowHp <= 0) {
							System.out.println(cookieName + "가 가루가 되고 쿠키마을은 악마에게 지배당했습니다 -END-");
							break;

						}
					} else if (command == 2) {
						System.out.println("겁쟁이 쿠키는 부리나케 도망쳤다.");
						break;
					}
				}

					
				} else if (menu == 4 && traincnt > 0) {
					System.out.println(cookieName + "가 휴식을 취합니다 체력이 완전히 회복됩니다");
					nowHp = maxHp;
					traincnt--;
					


				} else if (menu == 5) {
			} else if (menu == 6) {
				if (exp >= 100) {
					if (grade.equals("하급")) {

						System.out.println(cookieName + "의 힘이 넘쳐나고 있습니다 쿠키의 진화를 선택해주세요 ");
						System.out.println("1.날렵한 닌자 쿠키 2.강력한 레슬링 쿠키");
						int upgrade = sc.nextInt();
						exp = 0;
						if (upgrade == 1) {
							System.out.println();

							System.out.print(cookieName + "가 ");
							cookieName = "닌자 쿠키";
							System.out.println(cookieName + "(이)가 되었습니다" + cookieName
									+ "(은)는 적의 약점을 노려 치명상을 입히는 날렵한 쿠키입니다\r\n" + "공격력과 체력이 오르고 민첩성이 크게 오릅니다\r\n");
							grade = "중급";
							exp = 0;
							atk += 10;
							dex += 20;
							maxHp += 100;
							System.out.println("현재" + cookieName + "의 능력치 정보\r\n" + "공격력:" + atk + "\r\n" + "민첩성:" + dex
									+ "\r\n" + "체력:" + maxHp + "\r\n");


							} else if (upgrade == 2) {
								System.out.println();
								System.out.print(cookieName + "가 ");
								cookieName = "레슬러 쿠키";
								System.out.println(cookieName + "(이)가 되었습니다" + cookieName
										+ "(은)는 강력한 힘으로 적을 제압하는 쿠키입니다\r\n" + "민첩성과 체력이 오르고 공격력이 크게 오릅니다\r\n");
								grade = "중급";
								exp = 0;
								atk += 20;
								dex += 5;
								maxHp += 200;
								System.out.println("현재" + cookieName + "의 능력치 정보\r\n" + "공격력:" + atk + "\r\n" + "민첩성:"
									+ dex + "\r\n" + "체력:" + maxHp + "\r\n");
							

							
						}

					}
				}
			}
		}
	}

}
