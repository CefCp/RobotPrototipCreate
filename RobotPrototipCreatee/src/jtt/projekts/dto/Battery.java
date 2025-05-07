package jtt.projekts.dto;

public class Battery {
	private int id;
	private String batteryType;
	private int voltage;
	private int capacity;
	private int lifeCycle;
	
	public Battery(String batteryType, int voltage, int capacity, int lifeCycle) {
		this.batteryType = batteryType;
		this.voltage = voltage;
		this.capacity = capacity;
		this.lifeCycle = lifeCycle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBatteryType() {
		return batteryType;
	}

	public void setBatteryType(String batteryType) {
		this.batteryType = batteryType;
	}

	public int getVoltage() {
		return voltage;
	}

	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getLifeCycle() {
		return lifeCycle;
	}

	public void setLifeCycle(int lifeCycle) {
		this.lifeCycle = lifeCycle;
	}
}
