package ch6;

//단행본 대여
public class SeparateVolume implements Lendable {
	
	String requestNo;  //청구번호
	String bookTitle;  //도서명
	String writer;     //저자
	String borrower;   //대출인
	String checkOutDate;//대출일
	byte state;         //대출 상태
	
	public SeparateVolume(String requestNo, String bookTitle, String writer) {
		super();
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}


	@Override
	public void checkOut(String borrower, String date) {
		if(state!=0) {
			return;
		}
		this.borrower=borrower;
		this.checkOutDate=date;
		this.state=1;
		System.out.println("******" + this.bookTitle+"이 대출되었습니다");
		System.out.println("대출인 : "+borrower);
		System.out.println("대출일 : "+date);

	}

	@Override
	public void checkIn() {
		this.borrower=null;
		this.checkOutDate=null;
		this.state=0;
		System.out.println("**** "+ this.bookTitle+"이 반납되었습니다");

	}

	
}
