package com.board.beans;

public class comment {//������ ������ ��ȯ�� ���� �ڹٺ���
	//����
	private String content;
	
	//���̵�
	private String id;
	
	//�ۼ�����
	private String boarddate;
	

	private int num;
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getBoarddate() {
		return boarddate;
	}
	public void setBoarddate(String boarddate) {
		this.boarddate = boarddate;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}
