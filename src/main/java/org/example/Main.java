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

        for (int i = 0; i < inputData.size(); i++) {
            if (i > 0 && inputData.get(i).startsWith("-")) {
                formattedResult.append(inputData.get(i));
            } else {
                formattedResult.append(inputData.get(i));
            }
        }
// test007
        formattedResult.append("=").append(result);

        return formattedResult.toString();
    }
}