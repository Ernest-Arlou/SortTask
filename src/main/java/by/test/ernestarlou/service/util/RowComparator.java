package by.test.ernestarlou.service.util;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.Comparator;

public class RowComparator implements Comparator<String[]> {
    @Override
    public int compare(String[] arrayA, String[] arrayB) {
        int minArrayLength = Integer.min(arrayA.length, arrayB.length);
        int result = 0;

        for (int i = 0; i < minArrayLength; i++) {
            boolean aIsNumber = NumberUtils.isCreatable(arrayA[i]);
            boolean bIsNumber = NumberUtils.isCreatable(arrayB[i]);

            if (aIsNumber && bIsNumber) {
                result = Double.compare(NumberUtils.createDouble(arrayA[i]), NumberUtils.createDouble(arrayB[i]));
                if (result == 0) {
                    continue;
                } else {
                    return result;
                }
            }

            if (!aIsNumber && !bIsNumber) {
                result = arrayA[i].compareTo(arrayB[i]);
                if (result == 0) {
                    continue;
                } else {
                    return result;
                }
            }

            if (aIsNumber) {
                return -1;
            } else {
                return 1;
            }
        }
        return 0;
    }
}
