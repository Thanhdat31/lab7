package lab7;

public class moveable {
	public interface Moveable {
	    void moveUp();
	    void moveDown();
	    void moveLeft();
	    void moveRight();
	}

	public class MoveablePoint implements Moveable {
	    private int x;
	    private int y;
	    private int xSpeed;
	    private int ySpeed;
	    
	    public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
	        this.x = x;
	        this.y = y;
	        this.xSpeed = xSpeed;
	        this.ySpeed = ySpeed;
	    }
	    
	    @Override
	    public void moveUp() {
	        y = ySpeed;
	    }
	    
	    @Override
	    public void moveDown() {
	        y = ySpeed;
	    }
	    
	    @Override
	    public void moveLeft() {
	        x = xSpeed;
	    }
	    
	    @Override
	    public void moveRight() {
	        x = xSpeed;
	    }
	    
	    @Override
	    public String toString() {
	        return "(" + x + ", " + y + ")";
	    }
	}

	public class MoveableCircle implements Moveable {
	    private int radius;
	    private MoveablePoint center;
	    
	    public MoveableCircle(MoveablePoint center, int radius) {
	        this.center = center;
	        this.radius = radius;
	    }
	    
	    @Override
	    public void moveUp() {
	        center.moveUp();
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
	    
	    @Override
	    public String toString() {
	        return "MoveableCircle  " + center.toString() + " and radius " + radius;
	    }
	}

}
