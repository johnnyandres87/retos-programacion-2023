import java.util.Scanner;

public class PassGeneratorJohnny {

    private static Boolean isUpperCase;
    private static Boolean isNumber;
    private static Boolean isSpecialCharacter;
    private static Boolean isLowerCase;

    public PassGeneratorJohnny() {
       
    }

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Ingrese la longitud de la contraseña");
     int passLength = scanner.nextInt();

     while (passLength < 8 || passLength > 16) {
         System.out.println("La longitud de la contraseña debe ser mayor a 8 y menor a 16");
         passLength = scanner.nextInt();
     }

        System.out.println("¿Desea que la contraseña contenga mayúsculas? (true/false)");
        isUpperCase = scanner.nextBoolean();
        System.out.println("¿Desea que la contraseña contenga minúsculas? (true/false)");
        isLowerCase = scanner.nextBoolean();
        System.out.println("¿Desea que la contraseña contenga números? (true/false)");
        isNumber = scanner.nextBoolean();
        System.out.println("¿Desea que la contraseña contenga caracteres especiales? (true/false)");
        isSpecialCharacter = scanner.nextBoolean();

    System.out.println("La contraseña generada es: " + generatePassword(passLength, isUpperCase, isLowerCase, isNumber, isSpecialCharacter));

     scanner.close();
    }

    private static String generatePassword(int passLength, Boolean isUpperCase, Boolean isLowerCase, Boolean isNumber, Boolean isSpecialCharacter) {
        String password = "";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*()_+";

        String characters = "";

        if (isUpperCase) {
            characters += upperCase;
        }
        if (isLowerCase) {
            characters += lowerCase;
        }
        if (isNumber) {
            characters += numbers;
        }
        if (isSpecialCharacter) {
            characters += specialCharacters;
        }

        for (int i = 0; i < passLength; i++) {
            int random = (int) (Math.random() * characters.length());
            password += characters.charAt(random);
        }

        return password;
    }

    



}
