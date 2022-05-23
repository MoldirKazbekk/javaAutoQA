package Lesson2;
//5-task
public class Array {
    public static void main(String[] args) {
        int[] array = new int[]{1,0,1,1,0,0,1};
        for(int i=0;i<array.length;i++){
            if(array[i]==1)
                array[i]=0;
            else
                array[i]=1;
        }
        for(int a:array)
            System.out.print(a + " ");
    }
}
