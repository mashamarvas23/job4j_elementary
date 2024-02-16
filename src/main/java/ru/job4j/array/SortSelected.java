package ru.job4j.array;

import ru.job4j.loop.SwitchArray;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i <= data.length - 1; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexInRange(data, min, i, data.length - 1);
            SwitchArray.swap(data, index, i);
        }
        return data;
    }
}
