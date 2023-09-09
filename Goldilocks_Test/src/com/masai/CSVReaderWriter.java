package com.masai;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVReaderWriter {
    public static void main(String[] args) {
        String inputFile = "D:\\input.csv"; // Full path to input CSV file
        String outputFile = "D:\\output.csv"; // Full path to output file

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            FileWriter writer = new FileWriter(outputFile);

            String line;
            double sum = 0;

            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");

                // Assuming the numeric values are in the first three columns
                double num1 = Double.parseDouble(values[0]);
                double num2 = Double.parseDouble(values[1]);
                double num3 = Double.parseDouble(values[2]);

                // Writing the line to the output file
                writer.write(line + "\n");

                // Calculating the sum of the numeric values
                sum += num1 + num2 + num3;
            }

            // Writing the sum to the output file
            writer.write("Sum," + sum + "\n");

            // Closing the reader and writer
            reader.close();
            writer.close();

            System.out.println("CSV file read and written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
