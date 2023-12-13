package week8;

class Plant extends Pet {
	private String plantType;
	private String leafColor;
	public String getPlantType(){
		return plantType;
	}
	
	public void setPlantType(String plantType) {
		this.plantType = plantType;
	}
	
	public String getLeafColor() {
		return leafColor;
	}
	
	public void setLeafColor(String leafColor) {
		this.leafColor = leafColor;
	}
	
	public String speak() {
		return "*cricket noises*";
	}

}
