package org.cvtc.shapes;

public class ShapeFactory {
	
	//New Dialog to create Message Box
	private Dialog dialog;
	
	//Sets dialog
	private void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}
	
	//Gets dialog
	private Dialog getDialog() {
		return this.dialog;
	}
	
	//Constructor
	public ShapeFactory(Dialog dialog) {
		this.dialog = dialog;
	}
	
	//makes and returns a Shape based on type
	public Shape make(ShapeType type) {
		
		if (type == null) {
			return null;
		} else if (type == type.Sphere) {
			return new Sphere(dialog, 3);
		} else if (type == type.Cuboid) {
			return new Cuboid(dialog, 2, 3, 4);
		} else if (type == type.Cylinder) {
			return new Cylinder(dialog, 2, 3);
		}
		
		return null;
	}
}
