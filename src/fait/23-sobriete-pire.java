package exercice;

import java.util.*;


public class sobriete {
	public static String trierMots(String phrase, List<Character> alphabet) {
        // Créer une map pour associer chaque lettre à une liste de mots commençant par cette lettre
        Map<Character, List<String>> motsParLettre = new HashMap<>();
        for (char lettre : alphabet) {
            motsParLettre.put(lettre, new ArrayList<>());
        }

        // Diviser la phrase en mots
        String[] mots = phrase.toLowerCase().split("\\W+");

        // Parcourir chaque mot et l'ajouter à la liste correspondante dans la map
        for (String mot : mots) {
            if (!mot.isEmpty()) {
                char premiereLettre = mot.charAt(0);
                if (motsParLettre.containsKey(premiereLettre)) {
                    List<String> motsDeLaLettre = motsParLettre.get(premiereLettre);
                    motsDeLaLettre.add(mot);
                }
            }
        }

        // Créer une liste de mots triés en parcourant l'alphabet et concaténant les listes de mots
        StringBuilder phraseTrie = new StringBuilder();
        for (char lettre : alphabet) {
            List<String> motsDeLaLettre = motsParLettre.get(lettre);
            for (String mot : motsDeLaLettre) {
                phraseTrie.append(mot).append(" ");
            }
        }

        return phraseTrie.toString().trim();
    }
}
