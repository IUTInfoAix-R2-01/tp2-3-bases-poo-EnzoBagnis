package exercice17;

public class TestMain {
	 public static void main(String[] args) {
	        MyComplex c1 = new MyComplex(3.1, 4.05);
	        MyComplex c2 = new MyComplex(1.5, -2.3);

	        System.out.println("Complexe 1: " + c1);
	        System.out.println("Complexe 2: " + c2);
	        System.out.println("Module de c1: " + c1.magnitude());
	        System.out.println("c1 est réel? " + c1.isReal());
	        System.out.println("c1 est imaginaire? " + c1.isImaginary());

	        MyComplex sum = c1.addNew(c2);
	        System.out.println("Somme (nouveau complexe): " + sum);
	        
	        c1.addInto(c2);
	        System.out.println("Après addition dans c1: " + c1);
	    }
}
