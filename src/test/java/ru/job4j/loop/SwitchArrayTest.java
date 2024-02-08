package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SwitchArrayTest {
    @Test
    void whenSwapBorderArrayLengthIs4() {
        int[] input = {1, 2, 3, 4};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLengthIs6() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {6, 2, 3, 4, 5, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLengthIs3() {
        int[] input = {1, 2, 3};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {3, 2, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLengthIs1() {
        int[] input = {1};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int destination = input.length - 1;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap4to7() {
        int[] input = {1, 16, 3, 4, 19, 0, 74, 55, 99};
        int source = 4;
        int destination = 7;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {1, 16, 3, 4, 55, 0, 74, 19, 99};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap2to6() {
        int[] input = {1, 16, 3, 4, 19, 0, 74, 55, 99};
        int source = 2;
        int destination = 6;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {1, 16, 74, 4, 19, 0, 3, 55, 99};
        assertThat(result).containsExactly(expected);
    }
}