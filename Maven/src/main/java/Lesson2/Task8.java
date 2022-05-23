package Lesson2;

public class Task8 {
    public static void main(String[] args) {
        int[][] arr = new int[7][7];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j)
                    arr[i][j] = 1;
                if(i+j==arr.length-1)
                    arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
