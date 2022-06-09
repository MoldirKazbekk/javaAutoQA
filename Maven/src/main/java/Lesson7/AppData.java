package Lesson7;

public class AppData {
    private String[] header;
    private int[][] data;
    public AppData(int row, int column){
        header = new String[column];
        data = new int[row][column];
    }
    public void setHeader(String[] header){
        this.header = header;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public int[][] getData() {
        return data;
    }

    public String[] getHeader() {
        return header;
    }

}
