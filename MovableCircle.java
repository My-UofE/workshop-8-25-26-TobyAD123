
public class MovableCircle implements Movable {
  private MovablePoint center;
  private int radius;
  
  public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
    this.radius = radius;
    this.center = new MovablePoint(x, y, xSpeed, ySpeed);

  }

  @Override
  public String toString() {
    StringBuilder stringObj = new StringBuilder();
    stringObj.append("MovableCircle[center=MovablePoint[" + this.center.toString() + "]");
    stringObj.append(",radius=" + this.radius);

    return stringObj.toString();
  }
  
  // TASK: Implement all abstract methods declared in the interface
  @Override
  public void moveUp() {
	 center.moveUp();// move the center up
  }

  @Override
  public void moveDown() {
    center.moveDown();
  }

  @Override
  public void moveLeft() {
    center.moveLeft();
  }

  @Override
  public void moveRight() {
    center.moveRight();
  }

}
