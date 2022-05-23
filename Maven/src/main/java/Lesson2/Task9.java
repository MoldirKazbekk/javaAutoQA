package Lesson2;

public class Task9 {
    public static void main(String[] args) {
        int[] arr = createArray(5,9);
        for(int a:arr)
            System.out.print(a + " ");
    }
    public static int[] createArray(int length, int initialValue){
        int[] newArr = new int[length];
        for(int i=0;i<length;i++){
            newArr[i] = initialValue;
        }
        return newArr;
    }
}
