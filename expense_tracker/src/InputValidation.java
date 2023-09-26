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
}





