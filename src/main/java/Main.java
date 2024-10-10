import java.util.Arrays;

public class Main {
    public final int[] customerData1 = {101,104,107,0,0,0};
    public final int[] customerData2 = {102,105,108};
    public final int n = 3;
    public final int m = 3;

    public int[] mergeData(int[] customerData1, int[] customerData2, int n, int m){
        int[] mergedData = new int[n + m];
        for (int i = 0; i < customerData1.length; i++) {
            mergedData[i] = customerData1[i];
        }
        for (int i = 0; i < customerData2.length; i++) {
            mergedData[i + n] = customerData2[i];
        }

        for (int i = 0; i < mergedData.length; i++) {
            for (int j = 0; j < mergedData.length; j++) {
                if (mergedData[j] > mergedData[i]){
                    int swap1 = mergedData[i];
                    int swap2 = mergedData[j];
                    mergedData[i] = swap2;
                    mergedData[j] = swap1;
                }
            }
        }
        customerData1 = mergedData;
        return customerData1;
    }


    public static void main(String[] args) {
        Main main = new Main();
        int[] output = main.mergeData(main.customerData1, main.customerData2, main.n, main.m);
        System.out.println(Arrays.toString(output));
    }
}