package exercice19;

public class TestMyTime {
	public static void main(String[] args) {
        // Création d'un objet MyTime avec les valeurs par défaut (00:00:00)
        MyTime time1 = new MyTime();
        System.out.println("Heure initiale (par défaut) : " + time1);

        // Création d'un objet MyTime avec une heure spécifique
        MyTime time2 = new MyTime(14, 59, 59);
        System.out.println("Heure définie : " + time2);

        // Test des setters
        time2.setHour(23);
        time2.setMinute(59);
        time2.setSecond(58);
        System.out.println("Après modification : " + time2);

        // Test des méthodes nextSecond(), nextMinute(), nextHour()
        System.out.println("Après nextSecond() : " + time2.nextSecond());
        System.out.println("Après nextMinute() : " + time2.nextMinute());
        System.out.println("Après nextHour() : " + time2.nextHour());

        // Test des méthodes previousSecond(), previousMinute(), previousHour()
        System.out.println("Après previousSecond() : " + time2.previousSecond());
        System.out.println("Après previousMinute() : " + time2.previousMinute());
        System.out.println("Après previousHour() : " + time2.previousHour());

        // Test de setTime
        time2.setTime(5, 30, 15);
        System.out.println("Après setTime(5, 30, 15) : " + time2);
    }
}
