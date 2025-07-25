import javax.swing.JOptionPane;

public class Main {

	public static void main (String[] Args) {
		
		Vehicle vehicle = new Vehicle();
				
		Boat boat = new Boat();
		
		Bike bike = new Bike();
		
		Car car = new Car();
		
		Plane plane = new Plane();
		
		
		vehicle.setName("Bike");
		vehicle.setAge(3);		
		JOptionPane.showMessageDialog(null,vehicle.getName());
		JOptionPane.showMessageDialog(null,"The age of this Vehicle is " + vehicle.getAge());
		bike.engine();
		bike.doors();
		bike.route();
		bike.moving();
		
		
		
		
	}
	
}
