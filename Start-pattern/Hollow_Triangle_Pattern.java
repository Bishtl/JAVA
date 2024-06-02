public class Hollow_Triangle_Pattern {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                if(k==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int l=2;l<=i;l++){
                if(l==i){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
           
            System.out.println();
        }
        for(int i=1;i<=1;i++){
            for(int j=1;j<=10;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
