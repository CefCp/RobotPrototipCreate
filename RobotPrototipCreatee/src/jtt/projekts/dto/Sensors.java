package jtt.projekts.dto;

public class Sensors {
	private int id;
	private String sensorType;
	private int range;
	private int accuracy;
	private int sensitivity;
	
	public Sensors(String sensorType, int range, int accuracy, int sensitivity) {
		this.sensorType = sensorType;
		this.range = range;
		this.accuracy = accuracy;
		this.sensitivity = sensitivity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSensorType() {
		return sensorType;
	}

	public void setSensorType(String sensorType) {
		this.sensorType = sensorType;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	public int getSensitivity() {
		return sensitivity;
	}

	public void setSensitivity(int sensitivity) {
		this.sensitivity = sensitivity;
	}
}
