package exercice;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        long startTime = System.nanoTime();
        String texte = "exemple de texte a classer";
        List<Character> ordre = List.of('c', 't', 'e', 'x', 'a', 'm', 'p', 'l', 's', 'r', 'd');
        Exercice.solution(texte, ordre);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Durée d'exécution texte court : " + duration + " nanosecondes");
    }

    public static void test2() {
        long startTime = System.nanoTime();
        String texte = "La vie est une aventure passionnante remplie de défis et d'opportunités Chaque jour apporte son lot de surprises et d'apprentissages Il est important de rester ouvert d'esprit et de saisir chaque occasion de grandir et d'évoluer Avec détermination et persévérance nous pouvons surmonter les obstacles et atteindre nos objectifs La clé du succès réside dans notre capacité à s'adapter au changement et à embrasser les nouvelles expériences Alors profitons de chaque instant et construisons un avenir meilleur ensemble La vie est une aventure passionnante remplie de défis et d'opportunités Chaque jour apporte La vie est une aventure passionnante remplie de défis et d'opportunités Chaque jour apporte La vie est une aventure passionnante remplie de défis et d'opportunités Chaque jour apporte";
        List<Character> ordre = List.of('a', 'e', 'i', 'o', 'u', 'r', 's', 'n', 't', 'l', 'c', 'd', 'p', 'm', 'v', 'g');
        Exercice.solution(texte, ordre);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Durée d'exécution texte court : " + duration + " nanosecondes");
    }
}