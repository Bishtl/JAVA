public class Prime_Number {
    public static void main(String[] args) {
        int a=14 ,count=0;
        for(int i=2;i<a;i++){
            if(a%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.print("this is prime number");
        }
        else{
            System.out.println("this is not prime number");
        }
    }
}
