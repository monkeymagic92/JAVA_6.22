package com.kita.Object;

public class BoardTest {

	
	// 셋터 사용방법 
	public static void main(String[] args) {
		BoardVD bv1 = new BoardVD("제목1","내용1", 1);
		
		BoardVD bv2 = new BoardVD();
		bv2.setTitle("셋터사용 (setTitle)");
		bv2.setContent("내용사용 (setContent)");
		bv2.setWriteId(25);
		
		bv1.add();
		System.out.println("-------------");
		bv2.add();

		
	}

}
