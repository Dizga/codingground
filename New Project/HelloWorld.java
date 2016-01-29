public class HelloWorld{
    
    public static final int WHITE = 1;
    public static final int BLACK = 2;
    public static final int VOID = 0;
    //public static final int[] SOLVED = {2,2,2,0,1,1,1};
    public static final int[] SOLVED = {0,1,1,1,2,2,2};

     public static void main(String []args){
         

         
        int[] jeux = {1,1,1,0,2,2,2};
         
        if(Solver(jeux))
            System.out.println(WHITE);
     }
     
     public static boolean Solver(int tab[]){
         
         
         for(int i=0; i<7 ;i++){
            
            if(tab[i]==WHITE && tab[i+1]==VOID){
                
                tab[i] = VOID;
                tab[i+1] = WHITE;
                if(!Solver(tab)){
                    tab[i] = WHITE;
                    tab[i+1] = VOID;
                }
                
            }
         }
        //System.out.println(tab[0]+","+tab[1]+","+tab[2]+","+tab[3]+","+tab[4]+","+tab[5]+","+tab[6]);
        if(Solved(tab))
            return true;
        else
            return false;
         
     }
     
     public static boolean Solved(int tab[]){
        if(java.util.Arrays.equals(tab,SOLVED))
            return true;
        else
            return false;
         
     }
}
