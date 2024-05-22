package Vehicle;

public class Master {
	private int Model;
	private int Engine;
	private String Color;
	
	public Master(int model, int engine, String color) {
		Model = model;
		Engine = engine;
		Color = color;
	}

	@Override
	public String toString() {
		return "Master [Model=" + Model + ", Engine=" + Engine + ", Color=" + Color + "]";
	}
	
	void Masterout() {
		System.out.println("Model = " + Model);
		System.out.println("Engine = " + Engine);
		System.out.println("Color = " + Color);
	}
}
