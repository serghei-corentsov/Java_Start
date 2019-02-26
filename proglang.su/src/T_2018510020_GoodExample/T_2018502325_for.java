package T_2018510020_GoodExample;

public class T_2018502325_for {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            System.out.println("i= "+ i);
            for (int j = 1; j <= 3; j++) {
                System.out.println("   j= "+ j);
                for (int k = 1; k <= 2; k++) {
                    System.out.println("      k= "+k);
                    for (int l = 1; l <= 4; l++) {
//                        System.out.println("         l= "+ l); //прекрасно отображает пример но очень сильно все разбрасывает

                        System.out.println("i--> " + i + " j--> " + j + " k--> " + k + " l--> " + l);
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
    }
}