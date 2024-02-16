package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SortSelectedTest {
    @Test
    public void whenSort34125Then12345() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort967Then679() {
        int[] data = new int[]{9, 6, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{6, 7, 9};
        assertThat(result).containsExactly(expected);
    }
}