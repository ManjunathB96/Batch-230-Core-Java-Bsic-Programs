package day_16_and_17_binarysearch_algorithm;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteDataToFile {
    public static void main(String[] args) throws IOException {
        System.out.println("Write List Of Words Separated By Comma to store Inside File..");
        writeData();
    }

    static void writeData() {

        Scanner sc = new Scanner(System.in);
        try {
            FileWriter writer = new FileWriter("F:\\Batch-230 Core Java Programs\\src\\day_16_and_17_binarysearch_algorithm\\WordsList.txt");
            try {
                writer.write(sc.nextLine());
            } finally {
                writer.close();
            }
            System.out.println("SuccessFully data wrote to file");
        } catch (IOException i) {
            System.out.println(i);
        }
    }
}
//"Apple,banana,Manjunath,Kiran,brigelabz,TanuShree,Cat,dog,elephant,Frog,grass"

