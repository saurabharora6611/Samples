package DecoratorDesignPattern;

public class TestDecorator {
	public static void main(String args[]) {
		House house = new ColorDecorator(new SimpleHouse());
		//System.out.println(house.makeHouse());
		
		
	}
}