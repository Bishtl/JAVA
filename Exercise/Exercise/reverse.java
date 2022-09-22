package Exercise.Exercise;

public class reverse {
    public static void main(String[] args) {
        String name = "Rohit" ;
        String b = "";
            for(int i = 0;i<name.length();i++){ 
                char a = name.charAt(i);
                b = a+b;
            }

        System.out.println(b);
     }
}
