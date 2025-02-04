package exercice18;

public class TestMyDegree {
    public static void main(String[] args) {
        // Création de polynômes
        MyPolynomial p1 = new MyPolynomial(1, 2, 3);  // Représente 1 + 2x + 3x²
        MyPolynomial p2 = new MyPolynomial(4, 5);     // Représente 4 + 5x

        // Affichage des polynômes
        System.out.println("Polynôme 1: " + p1);
        System.out.println("Polynôme 2: " + p2);

        // Test de getDegree()
        System.out.println("Degré de p1: " + p1.getDegree());
        System.out.println("Degré de p2: " + p2.getDegree());

        // Test de evaluate(x)
        double x = 2.0;
        System.out.println("Évaluation de p1 en x=" + x + " : " + p1.evaluate(x));
        System.out.println("Évaluation de p2 en x=" + x + " : " + p2.evaluate(x));

        // Test de l'addition de polynômes
        MyPolynomial sum = p1.add(p2);
        System.out.println("Somme de p1 et p2: " + sum);

        // Test de la multiplication de polynômes
        MyPolynomial product = p1.multiply(p2);
        System.out.println("Produit de p1 et p2: " + product);
    }
}
