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
    public  int factorial(int n){
        if (n==0) return 1;
        return n*factorial(n-1);
    }

    public int potencial(int n, int p){
        if(p<=1) return n*1;
        return n*potencial(n, p-1);
    }

    public  int sumaTotal(int n) {
        if(n<10) return n;
        return (n%10)+ sumaTotal (n/10); 
    }

    public void descente(int n){
        if (n<=0) System.out.println(" "+1);
        else {
            System.out.print(n+" ");
            descente(n-1);
            
        }
        
    }

    public int inverso(int n){
        if (n<=1) return n;
        return Integer.parseInt("" + (n%10) + inverso(n/10));

       
        
    }


    
    

    


}
    

