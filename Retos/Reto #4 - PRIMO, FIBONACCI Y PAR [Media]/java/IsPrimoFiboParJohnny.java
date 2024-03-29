import java.util.Scanner;

public class IsPrimoFiboParJohnny {

    public IsPrimoFiboParJohnny(){}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ;

        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        String result = "El valor " + n + " ";
        if (isPar(n)){
            result += "es par, ";
        }if(isPrimo(n)){
            result += "es primo, ";
        }if(isFibonacci(n)){
            result += "es fibonacci ";
        }if(!isFibonacci(n)){
            result += "no es fibonacci ";
        }if(isImpar(n)){
            result += "es impar ";
        }
        System.out.println(result);
        sc.close();
    }

    private static Boolean isPar(int n){
        return n % 2 == 0;
    }
    
    private static Boolean isPrimo(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    private static Boolean isFibonacci(int n){
        int a = 0;
        int b = 1;
        while(a < n){
            int c = a + b;
            a = b;
            b = c;
        }
        return a == n;
    }
    private static Boolean isImpar(int n){
        return !isPar(n);
    }
}
