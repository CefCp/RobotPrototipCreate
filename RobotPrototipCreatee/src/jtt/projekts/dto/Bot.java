package jtt.projekts.dto;

public class Bot {
	private int id;
	private User user;
	private Microboard board;
	private Battery battery;
	private Motor motor;
	private Frame frame;
	private Sensors sensor;
	private Remote remote;
	
	public Bot(	User user, Microboard board, Battery battery, Motor motor, Frame frame,Sensors sensor, Remote remote) {
		this.user = user;
		this.board = board;
		this.battery = battery;
		this.motor = motor;
		this.frame = frame;
		this.sensor = sensor;
		this.remote = remote;
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Microboard getBoard() {
		return board;
	}

	public void setBoard(Microboard board) {
		this.board = board;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Frame getFrame() {
		return frame;
	}

	public void setFrame(Frame frame) {
		this.frame = frame;
	}

	public Sensors getSensor() {
		return sensor;
	}

	public void setSensor(Sensors sensor) {
		this.sensor = sensor;
	}

	public Remote getRemote() {
		return remote;
	}

	public void setRemote(Remote remote) {
		this.remote = remote;
	}
	
}
