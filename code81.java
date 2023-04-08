public class code81 {
    public static void main(String[] args) {

int sum=0;

        for (int i=1;i<=100;i++){
            for (int x=1;x<=i;x++){
                System.out.print(x);
                sum+=x;
            }
            System.out.println();
        }
        System.out.println(sum);

    }
}
