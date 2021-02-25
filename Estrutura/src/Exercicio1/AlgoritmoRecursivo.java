package Exercicio1;

public class AlgoritmoRecursivo {
    public static int S(int num, int x){
        if(num<1)
            return x;
        x+=(num%10);
        return S(num/10, x);
    }

    public static void main(String[] args) {
        int num = 700;
        int x = S(num, 0);

        System.out.println("O valor de x é: " + x);
    }
}