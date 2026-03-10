package ArrayMatrix;

public class plusOne {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 9};
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] == 9){
                digits[i] = 0;
            } else {
                digits[i] += 1;
                for (int j = 0; j < digits.length; j++) {
                    System.out.println(digits[j]);
                }
                break;
            }
        }
        // all digits were 9
        int[] newArr = new int[digits.length + 1];
        newArr[0] = 1;
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}

