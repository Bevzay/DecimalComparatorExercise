public class DecimalComparator {

    /*
     * Write a method areEqualByThreeDecimalPlaces with two parameters of type double
     *
     * The method should return boolean and it needs to return
     * true if two double numbers are the same up to three decimal places
     *
     * Otherwise, return false
     */

    public static boolean areEqualByThreeDecimalPlaces(double firstDecimal, double secondDecimal) {

        int num1 = (int)(firstDecimal * 1000);
        int num2 = (int)(secondDecimal * 1000);

        if(num1 == num2) {
            return true;
        }

        return false;

    }

}
