package Lesson2;

public class Task10 {
    public static void main(String[] args) {
        shiftElements(new int[]{1,2,3},1);
        System.out.println();
        shiftElements(new int[]{1,2,3,4,5},-3);
    }
    public static void shiftElements(int[] array, int times){
        int n = array.length;
        if(times<0){
            n *=-1;
        }
            int index = 0;
            int temp = array[0];
            for(int i=0;i<array.length;i++){
                 if(!(index + times< array.length && index+times>=0))
                     index = index + times - n;
                 else
                     index +=times;
                 int cur = array[index];
                 array[index] = temp;
                 temp = cur;
            }
        for(int a:array)
            System.out.print(a + " ");
    }
}
