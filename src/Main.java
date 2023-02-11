public class Main {
    public static void main(String[] args) {




        System.out.println("(a)");
        System.out.println(" ");

        int n =5;
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }



        System.out.println(" ");
        System.out.println("(b)");
        System.out.println(" ");


        for(int i = 1; i<=n; i++) {
            for (int z = i; z<=n; z++){
                System.out.print("  ");
            }
            for (int z = 1; z< i; z++) {
                System.out.print("* ");
            }
            for (int z = 1; z<=i; z++){
                System.out.print("* ");
            }
            System.out.println();
        }



        System.out.println(" ");
        System.out.println("(c)");
        System.out.println(" ");


        for(int i = 1; i<=n; i++) {
            for (int l = 1; l<=i; l++){
                System.out.print("  ");
            }
            for (int l = i; l< n; l++){
                System.out.print("* ");
            }
            for (int l = i; l<= n; l++){
                System.out.print("* ");
            }
            System.out.println();
        }



        System.out.println(" ");
        System.out.println("(d)");
        System.out.println(" ");
        // Nevaru izdomāt/atrast kā būtu pareizi ar skaitļiem


        for(int i = 1; i<=n; i++) {
            for (int z = i; z<=n; z++){
                System.out.print("  ");
            }
            for (int z = 1; z< i; z++) {
                System.out.print(1+i);
            }
            for (int z = 1; z<=i; z++){
                System.out.print(1);
            }
            System.out.println();
        }




        System.out.println(" ");
        System.out.println("(e)");
        System.out.println(" ");


        for(int i = 1; i<n; i++) {
            for (int z = i; z<=n; z++){
                System.out.print("  ");
            }
            for (int z = 1; z< i; z++) {
                System.out.print("* ");
            }
            for (int z = 1; z<=i; z++){
                System.out.print("* ");
            }
            System.out.println();

        }
        for(int i = 1; i<=n; i++) {
            for (int l = 1; l<=i; l++){
                System.out.print("  ");
            }
            for (int l = i; l< n; l++){
                System.out.print("* ");
            }
            for (int l = i; l<= n; l++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}