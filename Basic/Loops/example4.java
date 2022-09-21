package Basic.Loops;

public class example4 {
    public static void main(String[] args) {
        /*for(int a = 0;a<=50;a++){
            System.out.println("HELLO");
        }
        */
        
        /* 
         for(int i = 5;i<=50; i+=5){
System.out.println("The table of 5 are "+i);
        }
        */
for (int i = 5 ; i>=0 ; i--){
    for(int j = 1 ; j<=i; j++){
        System.out.print("*");
    }
    System.out.println("");
}
    }
    
}
