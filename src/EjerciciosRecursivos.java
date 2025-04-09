public class EjerciciosRecursivos {
    public  int fibonacci(int n) {
        if (n==0) return 0;
        else if (n==1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public  int sumaCon(int n){
        if (n==0||n==1) return n;
        return n+sumaCon(n-1);

    }
    


}
    

