package model;

import View.enemy;

public class enemy3 extends enemy{

	public enemy3(String name, int enemyAtk, int enemyHp) {
		super(name, enemyAtk, enemyHp);
		
	}

	@Override
	public void fight() {

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@#@@#@@@@@@@@@@@@@@@@@@@@@#@@@@@@@@@@@@#@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@==!@#@@@@@@@@@@@@@@@@@@@@@@!==@@@@@@@@@#@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@!#@!#@#@@@@@@@@@@@@@@@@@@@@@!@#!@@@@@@@@##@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@*#@#*@@@@@@@@@@@@@@@@@@@@@@@@*#@#*@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@=#@~==@@@@@@@@@@@@@@@@@@@@@@@@$=~@#=@@@##@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@#=@#~;@@@@@@@@@@@@@@@@@@@@@@@@@@;~#@=#@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@*@@~=;@@@@@@@@@@@@@@@@@@@@@@@@@@;=~@@*@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@;##;,#;@@@@@@@@@@@@@@@@@@@@@@@@@@;#,!##!@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@$#!, @;@@@@@@@@@@@@@@@@@@@@@@@@@@;@ ,!#$@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@=$=!. @;@@@@@@@@@@@@@@@@@@@@@@@@@@;@ .!=$=@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@;#!! .@*@@@@@@@@@@@@@@@@@@@@@@@@@@*@. !!#;@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@:=#:.,@!@@@@@@@@@###$$###@@@@@@@@@!@,.:#=:@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@;=#:.~@;@@@@@@$:*@@@@@@@@*:$@@@@@@;@~.:$=;@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@#$#@:-  #*#@@@;$#@=::~~~~~;=@#$;@@@$*#  -:@##@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@#$@=#;   #=@==@=;!=:-,..,-:=!;=@==@=#   ;#=@#@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@#@#$!@!.  $**#$;*@$~.      .~$@*;$#!*$  .!@!$#@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@!=@!, -=##!!@@*-.        .-*@@!!##=- ,!@=!@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@##@@@@;@@:;   $!#@@=-,          ,-=###!$   ;:@@;@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@!@#=$   #@@@#--            --@@@@#   $=#@!@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@#@$@; ; .=@~-,            ,-~@=  ; ;@$@#@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@##@@@@@@@@;@=@#-,   !;-              -;!   ,-#@=@;@@@@@@@@@@@@@@@\r\n"
				+ "@@@@#@@@@@@@@@@#$$$#-.   .:                :.   .-#$$$#@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@!@##--   ,                  ,   ,-##@!@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@*@#!-.  :                  :  .-!#@*@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@*@#@~-,                      ,-~@#@*@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@!@*@=:,                    ,:=@*@!@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@!@@#@#-                    -#@#@@!@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@!#@@@@-                    -@@@@#!@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@!$@$@@,  .              .  ,@@$@$!@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@*#@-$=,-@@@$==~    ~==$@@@-,=$-@#*@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@=#$-=::@@@@@@@@-  -@@@@@@@@::=-$#=@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@$@;~*~@@@@@#@@@;  ;@@@@@@@@@~*~;@$@@@@@@@@@@@@#@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@$@:$:~@@@@##@@@@--@@@@@@@@@@~:$:@$@@@@@@@@@@@##@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@#$*$:~@@@##@@@@@::@@@@@@@@@@~:$*$#@@@@@@@@@@##@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@*#$=~@@#@@@@@-!  !-@@@@@@@@~=$#*@@@@@@@@@@##@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@;@#@:#*#@@@@@..   .@@@@@#*#:@#@;@@@@@@@@@#@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@!@@@*-::#@@@!  --  !@@@#;:~*@@@!@@@@@@@@#@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@$@=@=-,-;;$!   ##   !$;;-,-=@=@$@@@@@@@@@#@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@#@*$#--,.     $@@$     .,--#$*@#@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@;#:@#!:!;~.  @@@@  .~;!:!#@:@;@@@@@@##@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@#$*~:$@##*! ,@$$@, !*##@=:~=$#@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@;@@@@-~-!: :@==@: :!-~-@@@@;@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@#@@@@;!:@#~:~~.-@=*@,.~~:~@@:!!@@@@#@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@#@@@@@@==$!-~. $,,$ .~-!$$=@@@@@@@@#@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@#@###@@@@@@;@*::-.    .-::*@;@@@@@@#@###@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@$##@@@@@@@$#!*~=-.  .-=~*!#$@@@@@@@###@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@##@@@@@@@@@#$@=@!~..~!@=@$#@@@@@@@@@#@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@#~=:$$#**#$$:=~#@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@##@@@@@@@@@@@@@#-*:!;~~~~;!:*-#@@@@##@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@#@@@@@@@@@@@@@@$~!~:--,,--:~!~$@@@@#@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@##@@@@@@@@@@@@@@!==::,,,,,,::==!@@@##@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@=*@=;-~~-;=@*=@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@##@@@@@@@@@@@@@@@@@@@#!;$####$;!@@@##@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@####@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				
				System.out.println("=======================================================================================\r\n"
						+ "------------------------------------------------------------------------------------------\r\n"
						+ "-----------------------------------------------------\r\n"
						+ "악당의정보\r\n"
						+ "=========================\r\n"
						+ "이름:"+getName()+"\r\n"
						+ "공격력:"+getEnemyAtk()+"\r\n"
						+ "체력:"+getEnemyHp()+"\r\n"
					
						+ "====================\r\n");
		
	}

	
	
}
