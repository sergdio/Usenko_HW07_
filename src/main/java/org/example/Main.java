package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> inputData = List.of("5", "+", "5");
        Integer result = 10;
        String resultString = prepareResults(inputData, result);
        System.out.println(resultString);
    }

    public static String prepareResults(List<String> inputData, Integer result) {
        StringBuilder formattedResult = new StringBuilder();

        for (int i = 0; i < inputData.size() - 1; i++) {
            formattedResult.append(inputData.get(i));
        }

        if (inputData.get(inputData.size() - 2).equals("+") || inputData.get(inputData.size() - 2).equals("-")) {
            formattedResult.append(inputData.get(inputData.size() - 2)).append(inputData.get(inputData.size() - 1));
        }

        formattedResult.append("=").append(result);

        return formattedResult.toString();
    }
}