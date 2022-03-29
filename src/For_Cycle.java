public class For_Cycle {

    public static void main(String[] args) {

//        int count = 10;
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < count; j++)
//            System.out.print(j + " ");
//            System.out.println();
//            count--;
//        }
        System.out.println();
//        int count2 = 0;
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < count2 + 1; j++)
//                System.out.print(j + " ");
//            System.out.println();
//            count2 = count2 + 1;
//        }
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < count; j++)
//                System.out.print(j + " ");
//            System.out.println();
//            count = count - 1;
//        }
//        System.out.println();
//        int count2 = 9;
//        for (int i = 1; i < 11; i++) {
//            for (int j = -1; j < count2; j++) {
//                System.out.print(count2 + " ");
////                System.out.println();
//                count2--;
//            }
//        }
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 9; i >= 0; i--) {
            for (int j = i; j < 9 ; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i ; j++) {
                System.out.print(j + " ");
                }
            System.out.println();
        }

        for (int i = 9; i >= 0; i--) {
            for (int j = i; j < 9 ; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}




