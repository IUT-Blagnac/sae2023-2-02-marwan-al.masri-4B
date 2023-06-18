public class test {
    public static void main(String[] args) {
        testEspaces();
        testVide();
        testNormal();
        testChiffres();
}

private static void testEspaces() {
    String chaine = "   Java   Module   IUT    ";
    List<Character> ordre = Arrays.asList('J', 'M', 'I');
    List<String> resultat = Exercice.solution(chaine, ordre);

    if (resultat.equals(Arrays.asList("Java", "Module", "IUT"))) {
        System.out.println("Test espace valide");
    } else {
        System.out.println("Test espace non valide");
    }

    System.out.println();
}

private static void testVide() {
    String chaine = "";
    List<Character> ordre = Arrays.asList('A', 'B', 'C');
    List<String> resultat = Exercice.solution(chaine, ordre);

    if (resultat.equals(new ArrayList<String>())) {
        System.out.println("Test vide valide");
    } else {
        System.out.println("Test vide non valide");
    }

private static void testNormal() {
    String chaine = "Java Module";
    List<Character> ordre = Arrays.asList('M', 'J');
    List<String> resultat = Exercice.solution(chaine, ordre);

    if (resultat.equals(Arrays.asList("Module", "Java")) {
        System.out.println("Test 1 valide");
    } else {
        System.out.println("Test 1 non valide");
    }
}

private static void testChiffres() {
    String chaine = "Java 123 Module 444";
    List<Character> ordre = Arrays.asList('J', 'M');
    List<String> resultat = Exercice.solution(chaine, ordre);

    if (resultat.equals(Arrays.asList("Java", "Module"))) {
        System.out.println("Test chiffre valide");
    } else {
        System.out.println("Test chiffre non valide");
    }
}
}