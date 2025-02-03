package exercice16;

public class TestMain {
    public static void main(String[] args) {
        // Test de MyPoint
        MyPoint[] points = new MyPoint[2];
        points[0] = new MyPoint(0, 0);
        System.out.println(points[0]); // Affichage du premier point
        points[1] = new MyPoint(3, 4);
        System.out.println(points[1]); // Affichage du deuxième point

        // Test de MyLine
        MyLine dummyLine = new MyLine(points[0], points[1]);
        System.out.println(dummyLine); // Affichage de la ligne

        // Test des getters et setters
        dummyLine.setBegin(new MyPoint(1, 1));
        dummyLine.setEnd(new MyPoint(4, 5));
        System.out.println("Longueur de la ligne : " + dummyLine.getLength());
        System.out.println("Gradient de la ligne : " + dummyLine.getGradient());

        // Test de MyCircle
        MyCircle dummyCircle = new MyCircle(points[1], 5);
        System.out.println(dummyCircle); // Affichage du cercle

        // Test des getters et setters
        dummyCircle.setRadius(7);
        dummyCircle.setCenter(new MyPoint(2, 2));
        System.out.println("Aire du cercle : " + dummyCircle.getArea());
        System.out.println("Circonférence du cercle : " + dummyCircle.getCircumference());

        // Autre test avec une instance anonyme
        MyCircle anotherCircle = new MyCircle(new MyPoint(6, 8), 3);
        System.out.println(anotherCircle);
        System.out.println("Distance entre les cercles : " + dummyCircle.distance(anotherCircle));

        // Test de MyTriangle
        MyTriangle triangle = new MyTriangle(new MyPoint(0, 0), new MyPoint(3, 0), new MyPoint(0, 4));
        System.out.println(triangle); // Affichage du triangle
        System.out.println("Périmètre du triangle : " + triangle.getPerimeter());
        System.out.println("Type du triangle : " + triangle.getType());
    }
}
