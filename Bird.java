package week8;

class Bird extends Pet {
	private String featherColor;
public void setFeatherColor(String newfeatherColor) {
	featherColor = newfeatherColor;
}
public String getFeatherColor() {
	return featherColor;
}
public String speak() {
	return "Tweet Tweet";
}

}
