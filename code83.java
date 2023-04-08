public class code83 {
        public static void main(String[] args){
            double sum1=0.0;double sum2=0.0;
    for (double i=1.0;i<=100;i++){
        for (double x=1.0;x<=i;x++) {
            if ( x==i&&x%2==0) {
                System.out.print(1/x);
sum1+=1/x;
            }else if (x==i){
                System.out.print(1/x);
sum2+=1/x;
            }
        }
        System.out.println();
    }
            System.out.println(sum1);
            System.out.println(sum2);
            System.out.println(sum2-sum1);
    }
}
