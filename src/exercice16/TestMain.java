package exercice16;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint p1 = new MyPoint(3,4);
		System.out.println(p1.distance(5,6));
		
		System.out.println(p1.distance(new MyPoint(3,5)));
		System.out.println(p1.distance());
		int[] returnedXY = p1.getXY();
		for (int i : returnedXY) {
			System.out.print(i + " ");
		}
		
	}

}
