public class ejerciciosRecursivos {
    /* 
    public int fibronaci(int n){
        if (n<=1 ){
            return  n;
        } 
    
        
        return fibronaci(n-1)+fibronaci(n-2);
    }
    */

    /* 
    public int sumaConsecutivos(int n) {
        if (n==1) return 1;
        return n + sumaConsecutivos(n-1);
    */
    //}
    
    /* 
    public static int getPotencial(int base,int exponente){
        if (exponente==0){
            return 1;           
        }else{
            return base * getPotencial(base,exponente-1);
        }        
    }
    /* 
     
    public static int sumDigitos(int n){
        if(n<10){
            return n;
        }else {
            int ultimodigito=n % 10;
            int resta=n/10;
            return sumDigitos(resta)+ultimodigito;
        }
    
    }
    */
    /* 
    public static void formaDesendente(int n){
        if(n<1) return;
        System.out.print(n +  "  ");
        formaDesendente(n-1);
    }
    */ 
    public static int reverso(int n){
        return reversoRecursivo(n,0);
    }
    private static int reversoRecursivo(int n,int invertido){
        if(n==0) return invertido;
        return reversoRecursivo(n/10, invertido*10+n%10);
    }

    
}
