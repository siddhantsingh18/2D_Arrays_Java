public class find_max {
    public static void main(String[] args) {

        int arr[][] = { {1,2,3}, {11,29,30} };
        int maxValue = arr[0][0];

        for(int i =0; i<arr.length;i++) {
            for(int j =0; j<arr[i].length; j++) {
                if(arr[i][j] > maxValue) {
                    maxValue = arr[i][j];
                }
            }
        }
        System.out.println(maxValue);
    }
}