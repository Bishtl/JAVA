public class Palindrome {
    public static void main(String[] args) {
        int a=15 , rem , result=0 , temp=a; 
        while(a>0){
            rem=a%10; ///515
            result=(result*10)+rem; //0+5=5 , 50+1=51 , 510+5=515
            a=a/10;
        }
        if(temp==result){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        
    }
}
