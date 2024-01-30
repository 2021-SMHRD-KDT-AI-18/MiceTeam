package View;

import java.util.ArrayList;
import java.util.Scanner;
import javazoom.jl.player.MP3Player;
import controller.Brave;
import controller.CHERRYCOOKIE;
import controller.COTTON;
import controller.CookieCon;
import controller.Ending;
import controller.MemberController;
import controller.STRAWBERRY;
import controller.angel;
import controller.darkChoco;
import controller.hongildong;
import controller.muscleCooke;
import controller.ninja;
import controller.vanilaCookie;
import model.MemberDTO;
import model.enemy1;
import model.enemy2;
import model.enemy3;
import mus.Music;

@SuppressWarnings("unused")
public class MainSystem_cookie {

	public static void main(String[] args) {

		CookieCon cookieCon = new CookieCon(); // 쿠키의 전반적인 기능을 담당할 클래스
		// 쿠키 관련된 기능을 메소드로 빼고싶다면
		// 위에 클래스 안에 메소드로 정의하면된다

		MemberController controller = new MemberController();

		MemberDTO dto = null;
		Scanner sc = new Scanner(System.in);

		
		ArrayList<Music> list1 = new ArrayList<Music>();
	      
	      Music m1 = new Music("쿠키런_ 킹덤","C:\\music_v2\\브금브금_-이세계-판타지-브금-보스몹-레이드할때-듣는-초월자-웅장한브금_1.mp3");
	      Music m2 = new Music("석류마을 브금","C:\\music_v2\\쿠키런_-킹덤_-공식-OST-_너를-찾을게_-MV.mp3");
	      Music m3 = new Music("전투! 레드, Lebo M.","C:\\music_v2\\쿠키런_-킹덤_-석류마을-브금_join.mp3");
	      Music m4 = new Music("이세계 판타지 브금","C:\\music_v2\\전투_-레드-_-리마스터-_-Battle_-Red.mp3");
	      Music m5 = new Music("훈련","C:\\music_v2\\훈련 효과음.m4a");
	      Music m6 = new Music("앤딩","C:\\music_v2\\엔딩 티모송.mp3");
	      

	      list1.add(m1);
	      list1.add(m2);
	      list1.add(m3);
	      list1.add(m4);
	      list1.add(m5);
	      list1.add(m6);
	      
	      MP3Player mp3 = new MP3Player();
	      if(mp3.isPlaying()) {
              mp3.stop();
           }
           
           mp3.play((m2).getPath());
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

//		while (true) {
//			// CRUD create read update delete 최소한의 기능들
//			System.out.println("1.회원등록 2.로그인 3.회원목록 4.회원탈퇴 5.회원정보수정 6.종료 >>");
//			int menu = sc.nextInt();
//			if (menu == 1) {
//				System.out.println("=====회원등록=====");
//				System.out.println("ID입력: ");
//				String id = sc.next();
//				System.out.println("PW입력: ");
//				String pw = sc.next();
//				System.out.println("NAME입력: ");
//				String name = sc.next();
//				System.out.println("AGE입력: ");
//				int age = sc.nextInt();
//				// JDBC-회원등록
//				// 1.드라이버 로드(동적로딩)
//				// 컴파일러가 아래 코드를 보고 해당 드라이버를 찾아가서 적용하기 때문
//
//				dto = new MemberDTO(id, pw, name, age);
//
//				int cnt = controller.join(dto);
//
//				if (cnt > 0) {
//					System.out.println("회원등록 성공");
//				} else {
//					System.out.println("회원등록 실패");
//				}
//			} else if (menu == 2) {
//				System.out.println("=====로그인=====");
//
//				System.out.print("ID 입력 : ");
//				String id = sc.next();
//				System.out.print("PW 입력 :");
//				String pw = sc.next();
//
//				MemberDTO info = controller.login(id, pw);
//				if (info != null) {
//					System.out.println(info.getName() + "님 환영합니다");
//				}
//				break;
//			} else if (menu == 3) {
//				System.out.println("========전체 회원 목록 조회=======");
//				System.out.println("ID\tPW\tName\tAGE");
//				ArrayList<MemberDTO> list = controller.memberList();
//				for (int i = 0; i < list.size(); i++) {
//					System.out.print(list.get(i).getId() + "\t");
//					System.out.print(list.get(i).getPw() + "\t");
//					System.out.print(list.get(i).getName() + "\t");
//					System.out.println(list.get(i).getAge() + "\t");
//
//				}
//			} else if (menu == 4) {
//				System.out.println("=======회원탈퇴=========");
//				System.out.println("ID 입력:");
//				String id = sc.next();
//
//				int cnt = controller.delete(id);
//				if (cnt > 0) {
//					System.out.println("회원탈퇴 성공");
//				} else {
//					System.out.println("회원탈퇴 실패");
//				}
//
//			} else if (menu == 5) {
//				System.out.println("========회원정보수정======");
//				// id와 일치하는 회원의 pw,name,age를 수정
//				System.out.println("ID 입력:");
//				String id = sc.next();
//				System.out.println("수정할 pw 입력:");
//				String pw = sc.next();
//				System.out.println("수정할 name 입력:");
//				String name = sc.next();
//				System.out.println("수정할 age 입력:");
//				int age = sc.nextInt();
//
//				dto = new MemberDTO(id, pw, name, age);
//				int cnt = controller.update(dto);
//				if (cnt > 0) {
//					System.out.println("회원정보 수정 성공");
//				} else {
//					System.out.println("회원정보수정 실패");
//				}
//
//			} else if (menu == 6) {
//				System.out.println("프로그램을 종료합니다");
//				sc.close();
//				break;
//			} else {
//				System.out.println("정확한 숫자입력해주세요");
//			} 
//
//		} 

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
		String enemyName = "세균맨";
		int day = 1;
		int traincnt = 5;

		int enemyHp = 0;
		int enemyAtk = 0;

	
		String text = " 평화로운 쿠키마을에 사는 용맹한 전사 쿠키!\r\n"
				+ "어느날, 악당 몬스터와 그의 부하들이 공격해왔다.\r\n"
				+ "그들은 쿠키마을을 파괴하고 주민들을 위협했다.\r\n"
				+ "용맹한 전사 쿠키는 마을을 지키기 위해 악당들과 맞서기로 결심한다.\r\n"
				+ "그는 특별한 능력과 무기를 갖추고 모험과 도전속에서 성장하며, 동료들과 함께 마을을 되찾는 여정을 떠난다.\r\n"
				+ "악당을 물리치고 마을에 다시 평화가 찾아오길 바라며!! 쿠키키우기게임 시작!!\r\n";

		for (int i = 0; i < text.length(); i++) {
			System.out.print(text.charAt(i));

			try {
				Thread.sleep(40);
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
              Brave.askie();
			cookieName = "용감한 쿠키";
		} else if (Character == 2) {
               STRAWBERRY.askie();
			cookieName = "딸기 쿠키";
		} else {
			System.out.println("쿠키가 없습니다.");
		}

		System.out.println(
				cookieName + "를 더욱 강한 쿠키로 성장시켜주세요\r\n " + "쿠키정보\r\n" + "=================================\r\n" + "이름:"
						+ cookieName + "\r\n" + "등급:" + grade + " 쿠키\r\n" + "공격력:" + atk + "\r\n" + "민첩력" + dex + "\r\n"
						+ "체력:" + maxHp + "\r\n" + "경험치:" + exp + "\r\n" + "=================================\r\n");

			while (true) {
				if(mp3.isPlaying()) {
					mp3.stop();
				}
				
				mp3.play((m3).getPath());
				if (traincnt == 0) {
					System.out.println();
					System.out.println();
					System.out.println("================================================\r\n"
							+ "훈련 횟수를 전부 소진했습니다 마을을 지키기 위한 전투를 준비하십시오\r\n"
							+ "================================================");
				}
				System.out.println("\r\n" + day + "번째 날\r\n" + "남은 훈련횟수: " + traincnt + "\r\n"
						+ "====================================================\r\n"
						+ "1.근력 훈련 2.민첩 훈련 3.체력 훈련 4.악당과 전투 5.쿠키 진화\r\n"
						+ "====================================================\r\n"
						+ "오늘 쿠키와 훈련 할 방법을 선택해주세요\r\n");
				
			int menu = sc.nextInt();
			if (menu == 1 && traincnt > 0) {
				atk += 10;
				traincnt--;
				System.out.println(cookieName + "가 쇠질을 하며 공격력이 올라갔습니다. 현재 공격력: " + atk);
				if(mp3.isPlaying()) {
		              mp3.stop();
		           }
		           mp3.play((m5).getPath());
				} else if (menu == 2 && traincnt > 0) {
					dex += 5;
					traincnt--;
					System.out.println(cookieName + "가 민첩 훈련을 하며 민첩성이 올라갔습니다 현재 민첩성 :" + dex);
					if(mp3.isPlaying()) {
			              mp3.stop();
			           }
			           mp3.play((m5).getPath());
				} else if (menu == 3 && traincnt > 0) {
					maxHp += 50;
					nowHp += 30;
					traincnt--;
					System.out.println(cookieName + "가 유산소 운동을 하며 체력이 올라갔습니다 현재 체력" + maxHp);
					if(mp3.isPlaying()) {
			              mp3.stop();
			           }
			           mp3.play((m5).getPath());
				
			} else if (menu == 4) {
				if (grade.equals("하급")) {
					enemyName = "세균맨";
					enemyHp = 100;
					enemyAtk = 10;
					enemy1.fight();
					if(mp3.isPlaying()) {
			             mp3.stop();
			          }
			          mp3.play((m4).getPath());
				} else if (grade.equals("중급")) {
					enemyName = "추종자";
					enemyHp = 500;
					enemyAtk = 50;
					enemy2.fight();
					if(mp3.isPlaying()) {
			             mp3.stop();
			          }
			          mp3.play((m4).getPath());
				} else if (grade.equals("상급")) {
					enemyName = "악마";
					enemyHp = 1000;
					enemyAtk = 100;
					enemy3.fight();
					if(mp3.isPlaying()) {
			             mp3.stop();
			          }
			          mp3.play((m1).getPath());
				}
				System.out.println(cookieName+"에게 어떤 행동을 시키겠습니까? >>" + "1.공격 2.도망친다");
				int command = sc.nextInt();

				while(true){

					if (command == 1) {
						enemyHp = enemyHp - atk;
						System.out.println(cookieName + "(은)는 " + enemyName + "에게 쿠키 펀치를 날렸다 " + atk + "의 피해를 입혔다 남은 "
								+ enemyName + " 체력:" + enemyHp);
						if (enemyHp <= 0 && enemyName.equals("세균맨")) {
							System.out.println("100의 경험치를 얻었다! 진화를 할 수 있을 것 같다\r\n");
							exp += 100;
							day++;
							traincnt = 5;
							nowHp=maxHp;
							break;
						}else if(enemyHp <= 0 && enemyName.equals("추종자")) {
							System.out.println("200의 경험치를 얻었다! 진화를 할 수 있을 것 같다\r\n");
							exp += 200;
							day++;
							traincnt = 5;
							nowHp=maxHp;
							break;
						}else if(enemyHp <= 0 && enemyName.equals("악마")) {
							System.out.println("드디어 악마를 물리쳤다.쿠키 마을에 평화가 찾아올 것 같다!!\r\n");

							break;
						}
							nowHp = nowHp - enemyAtk;
							System.out.println(enemyName + "이(가) " + cookieName + "에게 "+enemyName+" 펀치를 날렸다 " + enemyAtk
									+ "의 피해를 입혔다 남은 용감한 쿠키 체력:" + nowHp);
					} else if (nowHp <= 0) {
							System.out.println(cookieName + "가 가루가 되고 쿠키마을은 악마에게 지배당했습니다 -END-");
							break;

						
					} else if (command == 2) {
						System.out.println("겁쟁이 쿠키는 부리나케 도망쳤다.");
						break;
					}
				}
					

					
				
			} else if (menu == 5) {
				if (exp >= 100) {
					if (cookieName.equals("용감한 쿠키")) {
						System.out.println("============================================================");
						System.out.println(cookieName + "의 힘이 넘쳐나고 있습니다 쿠키의 진화를 선택해주세요 ");
						System.out.println("1.날렵한 닌자 쿠키 2.강력한 레슬링 쿠키");
						System.out.println("============================================================");
						int upgrade = sc.nextInt();
						exp = 0;
						if (upgrade == 1) {
							ninja.askie();
							System.out.println("============================================================");

							System.out.print(cookieName + "가 ");
							cookieName = "닌자 쿠키";
							System.out.println(cookieName + "(이)가 되었습니다" + cookieName
									+ "(은)는 적의 약점을 노려 치명상을 입히는 날렵한 쿠키입니다\r\n" + "공격력과 체력이 오르고 민첩성이 크게 오릅니다\r\n");
							System.out.println("============================================================");
							grade = "중급";
							exp = 0;
							atk += 40;
							dex += 20;
							maxHp += 300;
							System.out.println("현재" + cookieName + "의 능력치 정보\r\n" + "공격력:" + atk + "\r\n" + "민첩성:" + dex
									+ "\r\n" + "체력:" + maxHp + "\r\n");


							} else if (upgrade == 2) {
								muscleCooke.askie();
								System.out.println("============================================================");
								System.out.print(cookieName + "가 ");
								cookieName = "레슬러 쿠키";
								System.out.println(cookieName + "(이)가 되었습니다" + cookieName
										+ "(은)는 강력한 힘으로 적을 제압하는 쿠키입니다\r\n" + "민첩성과 체력이 오르고 공격력이 크게 오릅니다\r\n");
								System.out.println("============================================================");
								grade = "중급";
								exp = 0;
								atk += 40;
								dex += 5;
								maxHp += 300;
								System.out.println("현재" + cookieName + "의 능력치 정보\r\n" + "공격력:" + atk + "\r\n" + "민첩성:"
									+ dex + "\r\n" + "체력:" + maxHp + "\r\n");
							

							
						}

					}
				}if(cookieName.equals("닌자 쿠키")&& exp>=200){
					hongildong.askie();
					
					System.out.println("============================================================");
					System.out.print(cookieName + "가 ");
					cookieName = "홍길동 쿠키";
					System.out.println(cookieName + "(이)가 되었습니다" + cookieName
							+ "(은)는 불의를 참지못하는 정의로운 쿠키입니다\r\n" 
							+ "공격력과 체력이 오르고 민첩성이 크게 오릅니다\r\n");
					System.out.println("============================================================");
					grade = "상급";
					exp = 0;
					atk += 100;
					dex += 50;
					maxHp += 500;
					System.out.println("현재" + cookieName + "의 능력치 정보\r\n" + "공격력:" + atk + "\r\n" + "민첩성:" + dex
							+ "\r\n" + "체력:" + maxHp + "\r\n");

				}else if(cookieName.equals("레슬러 쿠키")&& exp>=200){
					darkChoco.askie();
					
					System.out.println("============================================================");
					System.out.print(cookieName + "가 ");
					cookieName = "다크초코 쿠키";
					System.out.println(cookieName + "(이)가 되었습니다" + cookieName
							+ "(은)는 강력한 다크초코의 힘 컨트롤하여 사용하는 쿠키입니다. \r\n" 
							+ "공격력과 체력이 오르고 민첩성이 크게 오릅니다\r\n");
					System.out.println("============================================================");
					grade = "상급";
					exp = 0;
					atk += 100;
					dex += 50;
					maxHp += 500;
					System.out.println("현재" + cookieName + "의 능력치 정보\r\n" + "공격력:" + atk + "\r\n" + "민첩성:" + dex
							+ "\r\n" + "체력:" + maxHp + "\r\n");

				}else if(cookieName.equals("딸기 쿠키") && exp>=100) {
					System.out.println("============================================================");
					System.out.println(cookieName + "의 힘이 넘쳐나고 있습니다 쿠키의 진화를 선택해주세요 ");
					System.out.println("1.불의 정령 쿠키 2.바닐라 쿠키");
					System.out.println("============================================================");
					int upgrade = sc.nextInt();
					exp = 0;
					if (upgrade == 1) {
						COTTON.askie();
						System.out.println();
						System.out.println("============================================================");
						System.out.print(cookieName + "가 ");
						cookieName = "불의 정령 쿠키";
						System.out.println(cookieName + "(이)가 되었습니다" + cookieName
								+ "(은)는 강력한 불의 힘을 사용하는 쿠키입니다\r\n" + "공격력과 체력이 오르고 민첩성이 크게 오릅니다\r\n");
						System.out.println("============================================================");
						grade = "중급";
						exp = 0;
						atk += 200;
						dex += 20;
						maxHp += 500;
						System.out.println("현재" + cookieName + "의 능력치 정보\r\n" + "공격력:" + atk + "\r\n" + "민첩성:" + dex
								+ "\r\n" + "체력:" + maxHp + "\r\n");


						}else if(upgrade==2) {
							vanilaCookie.askie();
							System.out.println("============================================================");
							System.out.print(cookieName + "가 ");
							cookieName = "바닐라 쿠키";
							System.out.println(cookieName + "(이)가 되었습니다" + cookieName
									+ "(은)는 부드러운 바닐라의 힘으로 적을 제압하는 쿠키입니다\r\n" + "민첩성과 체력이 오르고 공격력이 크게 오릅니다\r\n");
							System.out.println("============================================================");
							grade = "중급";
							exp = 0;
							atk += 40;
							dex += 5;
							maxHp += 300;
							System.out.println("현재" + cookieName + "의 능력치 정보\r\n" + "공격력:" + atk + "\r\n" + "민첩성:"
								+ dex + "\r\n" + "체력:" + maxHp + "\r\n");
							
						}
					
					
				}if(cookieName.equals("불의 정령 쿠키")&& exp>=200){
					CHERRYCOOKIE.askie();
					
					System.out.println("============================================================");
					System.out.print(cookieName + "가 ");
					cookieName = "체리 쿠키";
					System.out.println(cookieName + "(이)가 되었습니다" + cookieName
							+ "(은)는 강력한 불의 광기에 휩싸여\r\n"
							+ " 무자비한 파괴력을 보이는 쿠키입니다\r\n" 
							+ "공격력과 체력이 오르고 민첩성이 크게 오릅니다\r\n");
					System.out.println("============================================================");
					grade = "상급";
					exp = 0;
					atk += 200;
					dex += 50;
					maxHp += 500;
					System.out.println("현재" + cookieName + "의 능력치 정보\r\n" + "공격력:" + atk + "\r\n" + "민첩성:" + dex
							+ "\r\n" + "체력:" + maxHp + "\r\n");

				}else if(cookieName.equals("바닐라 쿠키")&& exp>=200){
					angel.askie();
					
                   System.out.println("==============================================================");
					System.out.print(cookieName + "가 ");
					cookieName = "천사 쿠키";
					System.out.println(cookieName + "(이)가 되었습니다" + cookieName
							+ "(은)는 강력한 천사의 힘을 컨트롤하여 사용하는 쿠키입니다. \r\n"
							+ "그녀 앞에서는 모든 악의 힘이 무용지물이 될 것 입니다." 
							+ "공격력과 체력이 오르고 민첩성이 크게 오릅니다\r\n");
					System.out.println("============================================================");
					grade = "상급";
					exp = 0;
					atk += 200;
					dex += 50;
					maxHp += 500;
					System.out.println("현재" + cookieName + "의 능력치 정보\r\n" + "공격력:" + atk + "\r\n" + "민첩성:" + dex
							+ "\r\n" + "체력:" + maxHp + "\r\n");

				}
				
				
				
			} 
			
		
			if(enemyName.equals("악마")&&enemyHp<=0) {
				if(mp3.isPlaying()) {
		              mp3.stop();
		           }
		           
		           mp3.play((m6).getPath());
				break;
			}
		}Ending.End();
			
			
			
			
	}

}
