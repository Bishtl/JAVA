public class Armstrong {
    public static void main(String[] args) {
        int n=371 , rem , result=0,temp=n; 

        while(n>0){
            rem=n%10;
            result=result+(rem*rem*rem); //1
            n=n/10;
        }
        //System.out.println(result);
        //System.out.println(temp);
        if(result==temp){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}
