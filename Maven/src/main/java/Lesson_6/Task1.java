package Lesson_6;

public class Task1 {

    public static void method1(String[][] array) throws MyArrayDataException, MyArraySizeException{
        if(array.length!=4 || array[0].length!=4)
            throw new MyArraySizeException();
        int sum = 0;
        for(int i = 0;i< array.length;i++){
            for(int j = 0;j<array[i].length;j++){
                try{
                    sum +=Integer.parseInt(array[i][j]);
                }catch(Exception e){
                    throw new MyArrayDataException(i, j);
                }
            }
        }
    }
}
