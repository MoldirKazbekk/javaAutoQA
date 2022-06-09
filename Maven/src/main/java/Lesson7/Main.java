package Lesson7;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        AppData data = new AppData(3, 3);
        String[] colNames = {"Test-1", "Final", "Midterm"};
        data.setHeader(colNames);
        int[][] array = {{100, 80, 35}, {68, 95, 65}, {53, 82, 91}};
        data.setData(array);
        save(data);
        BufferedReader reader = new BufferedReader(new FileReader("Maven/src/main/java/Lesson7/src.csv"));
        String line;
        while ((line = reader.readLine()) != null)
            System.out.println(line);

    }

    public static void save(AppData data) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("Maven/src/main/java/Lesson7/src.csv"));

        for (String s : data.getHeader())
            writer.write(s + ";");
        writer.write("\n");

        for (int[] rows : data.getData()) {
            for (int a : rows) {
                writer.write(a + ";");
            }
            writer.write("\n");
        }

        writer.close();

    }

}
