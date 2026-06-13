public class basics {
    public static void main(String[] args) {

        //DECLARATION
        int [][] arr;

        //ALLOCATION
        arr = new int[3][4];

        //INIT
        int[][] brr = {
                {1,2},
                {2,3},
                {3,4},
                {4,5}
        };

        //PRINT SPECIFIC INDEX
        System.out.println("Value : " +brr[0][0]);

        //PRINT A 2D ARRAY MATRIX
        int rowLength = brr.length;
        int colLength = brr[0].length;

        for(int i = 0; i<=rowLength-1; i++) {
            for(int j =0; j<=colLength-1; j++) {
                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }

    }
}