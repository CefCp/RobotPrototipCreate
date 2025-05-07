package jtt.projekts.dto;

public class Board {
	private int id;
	private String name;
	private String size;
	private String sizeOfMicro;
	
	public Board(String name, String size, String sizeOfMicro) {
		this.name = name;
		this.size = size;
		this.sizeOfMicro = sizeOfMicro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSizeOfMicro() {
		return sizeOfMicro;
	}

	public void setSizeOfMicro(String sizeOfMicro) {
		this.sizeOfMicro = sizeOfMicro;
	}
}
