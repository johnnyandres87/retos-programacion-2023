import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LenguajeHackerJohnny {
    public static void main(String[] args) {
        try (Scanner ingressFromPromt = new Scanner(System.in)) {
            System.out.println("introduce una palabra para transformar en minusculas a lenguaje hacker:");
            String word = ingressFromPromt.nextLine();

            System.out.println(toHackerLenguageTransform(word));
        }
    }

    private static String toHackerLenguageTransform(String wordToBeTransferm){

        Map<String, String> hackerLenguage = new HashMap<>();

        hackerLenguage.put("a", "4");
        hackerLenguage.put("b", "I3");
        hackerLenguage.put("c", "[");
        hackerLenguage.put("d", ")");
        hackerLenguage.put("e", "3");
        hackerLenguage.put("f", "|=");
        hackerLenguage.put("g", "&");
        hackerLenguage.put("h", "#");
        hackerLenguage.put("i", "1");
        hackerLenguage.put("j", ",_|");
        hackerLenguage.put("k", ">|");
        hackerLenguage.put("l", "1");
        hackerLenguage.put("m", "/\\/\\");
        hackerLenguage.put("n", "^/");
        hackerLenguage.put("o", "0");
        hackerLenguage.put("p", "|*");
        hackerLenguage.put("q", "(_,)");
        hackerLenguage.put("r", "I2");
        hackerLenguage.put("s", "5");
        hackerLenguage.put("t", "7");
        hackerLenguage.put("u", "(_)");
        hackerLenguage.put("v", "\\/");
        hackerLenguage.put("w", "\\/\\/");
        hackerLenguage.put("x", "><");
        hackerLenguage.put("y", "j");
        hackerLenguage.put("z", "2");
        hackerLenguage.put("0", "()");
        hackerLenguage.put("1", "L");
        hackerLenguage.put("2", "R");
        hackerLenguage.put("3", "E");
        hackerLenguage.put("4", "A");
        hackerLenguage.put("5", "S");
        hackerLenguage.put("6", "G");
        hackerLenguage.put("7", "T");
        hackerLenguage.put("8", "B");
        hackerLenguage.put("9", "9");
        
        if (wordToBeTransferm != null && !wordToBeTransferm.isEmpty()){
            wordToBeTransferm = wordToBeTransferm.toLowerCase();
            String[] wordToBeTransfermArray = wordToBeTransferm.split("");
            StringBuilder wordTransformed = new StringBuilder();

            for (String letter : wordToBeTransfermArray){
                if (hackerLenguage.containsKey(letter)){
                    wordTransformed.append(hackerLenguage.get(letter));
                } else {
                    wordTransformed.append(letter);
                }
            }
            return wordTransformed.toString();
        } else {
            return "No se ha introducido ninguna palabra";
        }

    }
}
