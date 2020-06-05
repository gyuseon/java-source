package service;

import domain.UserVO;
import persistence.UserDAO;

public class UserUpdateService {
	public int update(int no ,String address){
	
	UserDAO dao =new UserDAO();
	UserVO vo =new UserVO();
	vo.setNo(no);
	vo.setAddress(address);
	return dao.updateUser(vo);
	}
}
