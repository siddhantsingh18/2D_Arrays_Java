public class practice {
    public static void main(String[] args) {

        int [][] arr;

        arr = new int[3][4];

        int[][] brr = {
                {1,2},
                {2,3,4},
                {3,4,5,6},
                {1}
        };

        int rowLength = brr.length;
        //int colLength = brr.length;

        for(int i =0; i<=rowLength-1; i++){

            int colLength = brr[i].length;
            for(int j =0; j<=colLength-1;j++) {
                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }
    }
}