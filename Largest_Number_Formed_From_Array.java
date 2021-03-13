public class Main {

    public static void main(String[] args) {

    }

    public static String largestNumFromArr(int[] arr) {

        //Uses a sliding window solution to compare arr[i] and arr[i], where i is the left index and j is the right index:
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                //Uses string manipulation to add two numbers together as strings and not integers:
                String ij = String.valueOf(arr[i]) + String.valueOf(arr[j]);
                String ji = String.valueOf(arr[j]) + String.valueOf(arr[i]);

                //Converts the string values back to integer values and compares:
                int ijVal = Integer.valueOf(ij);
                int jiVal = Integer.valueOf(ji);

                //Swaps left and right values if they are not in order:
                if (jiVal > ijVal) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        //Builds a result string and returns it:
        String result = "";
        for (int val : arr) {
            result += val;
        }

        return result;
    }
}
