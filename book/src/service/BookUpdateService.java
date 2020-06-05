package service;

import domain.BookVO;
import persistence.BookDAO;

public class BookUpdateService {

	public int update(String code, int price) {
		
		BookDAO dao = new BookDAO();
		BookVO vo = new BookVO();
		vo.setCode(code);
		vo.setPrice(price);
		return dao.updateBook(vo);
			
		
	}
	

}
