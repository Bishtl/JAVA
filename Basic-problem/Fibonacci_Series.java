public class Fibonacci_Series{
    public static void main(String[] args) {
        int i=0,j=1,c;
        System.out.println(i);
        System.out.println(j);
        for(int k=2;k<=10;k++){
            c=i+j;
            System.out.println(c);
            i=j; //0,1,1,2,3,
            j=c; 
        }
    }
}