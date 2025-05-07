package jtt.projekts.dto;

public class Microboard {
	private int id;
	private Board board;
	private Microcontroller micro;
	
	public Microboard(Board board,Microcontroller micro ) {
		this.board =board;
		this.micro = micro;
	}
}
