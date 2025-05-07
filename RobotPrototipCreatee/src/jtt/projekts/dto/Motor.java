package jtt.projekts.dto;

public class Motor {
	private int id;
	private String name;
	private int voltage;
	private int maxRMP;
	private int currnetDraw;
	
	public Motor(String name,int voltage, int maxRMP, int currnetDraw) {
		this.name = name;
		this.voltage = voltage;
		this.maxRMP = maxRMP;
		this.currnetDraw = currnetDraw;
		
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

	public int getVoltage() {
		return voltage;
	}

	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}

	public int getMaxRMP() {
		return maxRMP;
	}

	public void setMaxRMP(int maxRMP) {
		this.maxRMP = maxRMP;
	}

	public int getCurrnetDraw() {
		return currnetDraw;
	}

	public void setCurrnetDraw(int currnetDraw) {
		this.currnetDraw = currnetDraw;
	}


	
	
}
