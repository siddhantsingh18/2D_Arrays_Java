import java.util.*;

public class taking_userInput {
    public static void main(String[] args) {

        int[][] arr = new int[3][2];
        Scanner sc = new Scanner(System.in);

        //TAKING INPUT
        for(int i=0; i<=arr.length-1;i++) {
            for(int j =0; j<=arr[i].length-1;j++) {
                System.out.println("Provide value for row= " + i + " and cloumn = " + j);
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<=arr.length-1; i++) {
            for(int j =0; j<=arr[i].length-1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}