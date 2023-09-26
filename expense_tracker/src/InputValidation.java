import java.util.Arrays;
import java.util.List; 


public class InputValidation {
     
    public static void validateAmount(double amount) throws IllegalArgumentException {
        // 1. The ```amount``` should be greater than 0 and less than 1000. 
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount should be greater than 0.");
        }

        if (amount >= 1000) {
            throw new IllegalArgumentException("Amount should be less than 1000.");
        }

        // 2. It should be a valid number.
        if (!String.valueOf(amount).matches("^\\d+(\\.\\d+)?$")) {
            throw new IllegalArgumentException("Amount is not a valid number.");
        }
        
    }

    //3. The ```category``` should be a valid string input from the following list: "food", "travel", "bills", "entertainment", "other" .
    private static String[] validCategories = {"food", "travel", "bills", "entertainment", "other"};
    private static List<String> validCategoriesList = Arrays.asList(validCategories);

    public static void validateCategory(String category) throws IllegalArgumentException {
        // Incase input like "Food".
        String inputCategory = category.toLowerCase();
        // 4. You should display error messages on the GUI and not accept the invalid input. . You should throw an appropriate exception. 
        if (!validCategoriesList.contains(inputCategory)) {
            throw new IllegalArgumentException("Category is not valid. Valid categories are: food, travel, bills, entertainment, other.");
        }
    }
}





