

public class returnn {
    void demoSum(int a, int b)
    {
        int sum = 0;
        sum = (a + b) / 10;
        System.out.println(sum);
 
        
    }
 
   
    public static void main(String[] args)
    {
        
        new returnn().demoSum(5, 5);
 
      
        System.out.print(
            "No return keyword is used and program executed successfully");
    }
}