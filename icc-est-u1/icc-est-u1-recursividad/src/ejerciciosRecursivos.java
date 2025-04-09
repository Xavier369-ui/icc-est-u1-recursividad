public class ejerciciosRecursivos {
    public int fibronaci(int n){
        if (n<=1 ){
            return  n;
        } 
    
        
        return fibronaci(n-1)+fibronaci(n-2);
    }

    public int sumaConsecutivos(int n) {
        if (n==1) return 1;
        return n + sumaConsecutivos(n-1);

    }        
    
}
