public class class4 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int num=12;
        int den[]={12,0,3,0,0,4};

        for (int i = 0; i < 10; i++) {        
            if (den[i]==0) {                          
                break;
            }
            else if(i>6){
                break;
            }
            else{System.out.println("ans="+num/den[i]);}
            
        } 
        System.out.println("程式執行有誤");
    }
}
