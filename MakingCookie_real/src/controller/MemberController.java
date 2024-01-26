package controller;

import java.util.ArrayList;

import model.MemberDAO;
import model.MemberDTO;

public class MemberController {

	private MemberDAO dao= new MemberDAO(); //컨트롤러가 dao에게 요청하기위해 view에서 controller로 옮김

	public int join(MemberDTO dto) {
		// TODO Auto-generated method stub
		return dao.join(dto);
	}

	public MemberDTO login(String id, String pw) {
		
		return dao.login(id, pw);
	}

	public ArrayList<MemberDTO> memberList() {
		// TODO Auto-generated method stub
		return dao.memberList();
	}

	public int delete(String id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}
	
	public int update(MemberDTO dto) {
		return dao.update(dto);
	}

} 
