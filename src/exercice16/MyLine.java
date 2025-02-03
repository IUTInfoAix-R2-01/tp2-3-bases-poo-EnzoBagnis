package exercice16;

public class MyLine {
	private MyPoint begin;
	private MyPoint end;
	
	public MyLine(int x1, int y1, int x2, int y2) {
		this.begin.setX(x1);
		this.begin.setY(y1);
		this.end.setX(x2);
		this.end.setY(y2);
	}
	
	public MyLine(MyPoint begin, MyPoint end) {
		this.begin = begin;
		this.end = end;
	}

	public MyPoint getBegin() {
		return begin;
	}

	public void setBegin(MyPoint begin) {
		this.begin = begin;
	}

	public MyPoint getEnd() {
		return end;
	}

	public void setEnd(MyPoint end) {
		this.end = end;
	}
	
	public int getBeginX() {
		return this.begin.getX();
	}
	
	public void setBeginX(int x) {
		this.begin.setX(x); 
	}
	
	public int getBeginY() {
		return this.begin.getY();
	}
	
	public void setBeginY(int y) {
		this.begin.setY(y); 
	}
	
	public int getEndX() {
		return this.end.getX();
	}
	
	public void setEndX(int x) {
		this.end.setX(x); 
	}
	
	public int getEndY() {
		return this.end.getY();
	}
	
	public void setEndY(int y) {
		this.begin.setX(y); 
	}
	
	public int[] getBeginXY() {
		int [] arr = this.begin.getXY();
		return arr;
	}
	
	public void setBeginXY(int x, int y) {
		this.begin.setXY(x, y);
	}
	
	public int[] getEndXY() {
		int[] arr = this.end.getXY();
		return arr;
	}
	
	public void setEndXY(int x, int y) {
		this.end.setXY(x, y);
	}
	
	public double getLength() {
	    return begin.distance(end);
	}
	
	public double getGradient() {
	    int xDiff = end.getX() - begin.getX();
	    int yDiff = end.getY() - begin.getY();
	    return Math.atan2(yDiff, xDiff);
	}

	@Override
	public String toString() {
		return "MyLine [begin=" + begin + ", end=" + end + "]";
	}
	
}
