public class pattern4 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 5; k++) {

                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}