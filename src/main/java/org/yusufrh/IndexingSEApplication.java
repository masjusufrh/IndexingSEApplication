package org.yusufrh;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IndexingSEApplication {
    private static final Logger logger = LogManager.getLogger(IndexingSEApplication.class);

    public static void main(String[] args){
    if (args.length == 0) {
        logger.error("Please provide file to continue....");
        logger.info("aaaa Please provide file to continue....");

        return;
        }
        indexer(args);
    }

    /**
     * Processing all files in the argument, counting number of words that start with upper case letter in each file
     * and List all the words that are longer than 5 characters long in each file
     *
     * @param fNames an array of filenames
     */
    private static void indexer(String[] fNames) {
        for (String fileName : fNames) {
            File file = new File(fileName);
            if (!file.exists()) {
                logger.error("File not found: {}", fileName);
                continue;
            }

            try (Scanner scanner = new Scanner(file)) {
                int upperCaseCount = 0;
                List<String> longWords = new ArrayList<>();

                while (scanner.hasNext()) {
                    String word = scanner.next();
                    // is it uppercase
                    if (Character.isUpperCase(word.charAt(0))) {
                        upperCaseCount++;
                    }

                    // more than 5 chars?
                    if (word.length() > 5) {
                        longWords.add(word);
                    }
                }

                System.out.println("File: " + fileName);
                System.out.println("Number of words starting with an uppercase letter: " + upperCaseCount);
                System.out.println("Words longer than 5 characters: " + longWords);
            } catch (FileNotFoundException e) {
                logger.error("Error reading file: {}", fileName, e);
            }
        }
    }
}