package com.kita.Object;


// 셋터 사용방법 ( 
public class BoardVD {
	// 상수는 static 을 주며 private도 주는 편 
	static int age = 5;
	private String title;
	private String content;
	private int writeId;
	
	public BoardVD() {} 
	
	public BoardVD(String title, String content, int writeId) {
		super();
		this.title = title;
		this.content = content;
		this.writeId = writeId;
	}	
	
	public void add() {
		System.out.println("제목 : " + this.title);
		System.out.println("콘텐츠 : " + this.content);
		System.out.println("쓰기 : " + this.writeId);
	}
	
	
	// 셋터 메소드 만드는법 ( 무조건 void )
	// private에  값을 넣는방법
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public void setWriteId(int writeId) {
		this.writeId = writeId;
	}

	// 겟터 만드는 방법 ( 반환값 적고 , 매개변수 안적고 리턴값 변수명 )
	// private에 값 넣는방법
	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public int getWriteId() {
		return writeId;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
