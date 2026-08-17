import java.util.Arrays;

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        int total = 0;

        for (int i = 0; i < boxTypes.length; i++) {

            int box = boxTypes[i][0];
            int unit = boxTypes[i][1];

            if (box <= truckSize) {
                total += box * unit;
                truckSize -= box;
            } 
            else {
                total += truckSize * unit;
                break;
            }

            if (truckSize == 0) {
                break;
            }
        }

        return total;
    }
}