public class App {
    public static void main(String[] args) throws Exception { 

        //int n = 5;
        //int resultadoFinal = factorial(n);
        //System.out.println("Resultado: " + n);
    /*     
    }
    public static int factorial(int n){
        if(n==0){
            System.out.println("Alcance el caso base");
            return 1;
        }
        int resultado = n  *  factorial(n - 1);
        System.out.println("Calculando factorial de:" + n + "* factorial("+ (n-1)+"-1)");
        return resultado;
    */
    //ejerciciosRecursivos eR = new ejerciciosRecursivos();
        /* 
        int base = 2;
        int  exponente = 3;
        int  resultado = ejerciciosRecursivos.getPotencial(base,exponente);
        
        System.out.println(base + " elevado a " +  exponente  + " es iguala a " + resultado);
        */
    
        /* 
        int n = 1234;
        int suma = ejerciciosRecursivos.sumDigitos(n);
        System.out.println("La suma del codigo: " + n +"  es :"+ suma );
        */
        //ejerciciosRecursivos.formaDesendente(10);
        int numero = 12324;
        int invertido = ejerciciosRecursivos.reverso(numero);
        System.out.println("Reverso:  " + invertido);
    }
    

    
}
