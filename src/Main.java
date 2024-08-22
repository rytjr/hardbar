import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] list = new int[9][9];

        int max = 0;
        int max2 = 0;
        int max3 = 0;

        for(int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                list[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (list[i][j] > max) {
                    max = list[i][j];
                }
            }
        }

        for(int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(max == 0) {
                    max3 = 1;
                    max2 = 1;

                }
                else {
                    if(max == list[i][j]) {
                        max3 = i+1;
                        max2 = j+1;
                    }
                }
            }
        }
        System.out.println(max);
        System.out.print(max3 + " " + max2);
    }
}