package jtt.projekts.dto;

public class Frame {
	private int id;
	private String material;
	private String dimension;
	private int weight;
	
	 public Frame(String material, String dimension, int weight) {
		this.material = material;
		this.dimension = dimension;
		this.weight = weight;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	 
	 
}
