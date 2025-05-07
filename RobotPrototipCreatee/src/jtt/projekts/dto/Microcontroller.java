package jtt.projekts.dto;

public class Microcontroller {
	private int id;
	private String name;
	private int clockSpeed;
	private int programMemory;
	private int ram;
	private String size;
	private int voltUsage;
	
	public Microcontroller(String name, int clockSpeed, int programMemory, int ram,String size ,int voltUsage) {
		this.name = name;
		this.clockSpeed = clockSpeed;
		this.programMemory = programMemory;
		this.ram = ram;
		this.size =size;
		this.voltUsage = voltUsage;
	}

	
	
	public String getSize() {
		return size;
	}



	public void setSize(String size) {
		this.size = size;
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

	public int getClockSpeed() {
		return clockSpeed;
	}

	public void setClockSpeed(int clockSpeed) {
		this.clockSpeed = clockSpeed;
	}

	public int getProgramMemory() {
		return programMemory;
	}

	public void setProgramMemory(int programMemory) {
		this.programMemory = programMemory;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getVoltUsage() {
		return voltUsage;
	}

	public void setVoltUsage(int voltUsage) {
		this.voltUsage = voltUsage;
	}
	

}
