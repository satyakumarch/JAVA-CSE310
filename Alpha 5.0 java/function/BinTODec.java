public class BinTODec {
    public static void bintodec(int binNum) {
        int pow = 0;
        int decNum = 0;
        int originalBinNum = binNum; // Store the original binary number for printing

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)(Math.pow(2, pow)));
            pow++;
            binNum = binNum / 10;
        }

        System.out.println("Decimal of " + originalBinNum + " = " + decNum);
    }

    public static void main(String[] args) {
        bintodec(101);
    }
}
