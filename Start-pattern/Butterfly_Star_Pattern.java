public class Butterfly_Star_Pattern {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=5;k>=i;k--){
                System.out.print(" ");
            }
            for(int l=5;l>=i;l--){
                System.out.print(" ");
            }
            for(int m=1;m<=i;m++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=2;i++){
            for(int j=1;j<=6;j++){
                System.out.print("*");
            }
            for(int k=1;k<=6;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++){
                System.out.print(" ");
            }
            for(int m=5;m>=i;m--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
