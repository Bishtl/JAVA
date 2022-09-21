package Method;

public class example5{
    static void checkAge(int age){
        if(age<18){
            System.out.println("Accese denied");
        }
        else{
            System.out.println("you have Access , Enjoy it ");
        }
       
    }
    public static void main(String[] args) {
       checkAge(22);     
    }
}