public class class3 {
    public static void main(String[] args) {
        try {
            int num=12,den=0;
            int ans=num/den;
 
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("除數為0");
        }
        finally{
            System.out.println("end of main() method");
        }
    }
}
