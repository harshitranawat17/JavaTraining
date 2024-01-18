package JavaPrograms_111to120;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class Problem_119_Createcustomexception {

    public static void processData(int value) throws CustomException {
        if (value < 0) {

            throw new CustomException("Value cannot be negative");
        }

        System.out.println("Processing data for value: " + value);
    }

    public static void main(String[] args) {
        try {
  
            processData(10);

        } catch (CustomException e) {

            System.err.println("Custom Exception caught: " + e.getMessage());
        }
    }
}
