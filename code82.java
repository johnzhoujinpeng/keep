public class code82 {
    public static void main(String[] args) {
int count=0;
        for (int k = 1; k <= 100; k++) {

            if (k % 5 != 0) {
                System.out.print(k);
                count++;

                if (count % 5 == 0) {
                    System.out.println();
                }

            }
        }

    }
}

