package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		String filePath = "D:\\2024\\Java\\FileParsing\\reactiontimes.csv";

		try (var br = new BufferedReader(new FileReader(filePath))) {

			String line;
			int min = Integer.MIN_VALUE;
			int max = Integer.MAX_VALUE;
			int total = 0;
			int lineNumber = 0;

			while ((line = br.readLine()) != null) {
				String[] fields = line.split(",");

				if (fields.length != 3) {
					System.err.println("Line doesn't contain 3 fields: " + line);
					continue;
				}

				int reactionTime = 0;
				try {
					reactionTime = Integer.parseInt(fields[2]);
				} catch (NumberFormatException e) {
					System.out.println("Number badly formatted in file: " + fields[2] + " on line " + lineNumber);
				}

				if (reactionTime < min) {
					min = reactionTime;
				}

				if (reactionTime > max) {
					max = reactionTime;
				}

				total += reactionTime;

				lineNumber++;
			}
			
			if(lineNumber == 0) {
				System.out.println("No line in file.");
				return;
			}

			System.out.println("Min: " + min + " ms");
			System.out.println("Max: " + max + " ms");
			System.out.println("Average: " + (double)total/lineNumber + " ms");
		} catch (FileNotFoundException e) {
			System.out.println("Cannot open: " + filePath);
		} catch (IOException e) {
			System.out.println("Cannot read: " + filePath);
		}
	}
}
