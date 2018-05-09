package DecoratorDesignPattern;

public class ColorDecorator extends HouseDecorator{
 
	public ColorDecorator(House house) {
		super(house);
	}

	private String addColors() {
		return " + Colors";
	}
	
	public String makeHouse() {
		return house.makeHouse() + addColors();
	}
}


