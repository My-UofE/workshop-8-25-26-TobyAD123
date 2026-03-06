
public class MovablePoint implements Movable {
	int x, y, xSpeed, ySpeed; // package access
	
	// TASK: Add the constructor below

	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public String toString() {
		StringBuilder stringObj = new StringBuilder();
		stringObj.append("x="+ this.x +",");
		stringObj.append("y="+ this.y +",");
		stringObj.append("xSpeed="+ this.xSpeed +",");
		stringObj.append("ySpeed="+ this.ySpeed +",");

		return stringObj.toString();
	}



	// Implement abstract methods declared in the interface
	@Override
	public void moveUp() {
		y += ySpeed; // moves y point up by increment ySpeed
	}

	// TASK: Code the other interface methods below

	public void moveDown() {
		y -= ySpeed;
	}

	public void moveLeft() {
		x += xSpeed;
	}

	public void moveRight() {
		x -= xSpeed;
	}


	


}
