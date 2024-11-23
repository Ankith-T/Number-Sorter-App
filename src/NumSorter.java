import java.util.Arrays;
import java.util.Scanner;
public class NumSorter {
    public static void main(String[] args) throws Exception {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter Three Numbers:");
        double firstNum = myScan.nextDouble();
        double secondNum = myScan.nextDouble();
        double thirdNum = myScan.nextDouble();
        displaySortedNumbers(firstNum, secondNum, thirdNum);
    }
    public static void displaySortedNumbers(double num1, double num2, double num3){
        double[] threeNums = {num1, num2, num3};
        Arrays.sort(threeNums);
        System.out.println(Arrays.toString(threeNums));

    }
}

