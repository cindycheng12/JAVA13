public class class2 {
    public static void main(String[] args) {
        try {
            int num=12,den=0;
            int ans=num/den;
            System.out.println("end of main()!!");
        
            if (den==0) {
                throw new Exception();
            }
            else{
                System.out.println(ans);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("除數為0");
        }
    }
}
