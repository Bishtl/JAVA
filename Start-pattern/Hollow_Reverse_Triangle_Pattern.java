public class Hollow_Reverse_Triangle_Pattern {
    public static void main(String[] args) {
        for(int i=1;i<=1;i++){
            for(int j=1;j<=10;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=5;k>=i;k--){
                if(k==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int l=4;l>=i;l--){
                if(l==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
