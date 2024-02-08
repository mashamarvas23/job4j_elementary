package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FindLoopTest {
    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[]{5, 10, 3};
        int element = 5;
        int result = FindLoop.indexOf(data, element);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[]{7, 13, 18, 20, 45};
        int element = 10;
        int result = FindLoop.indexOf(data, element);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHas144Then3() {
        int[] data = new int[]{7, 13, 18, 144, 45, 19, 0};
        int element = 144;
        int result = FindLoop.indexOf(data, element);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }
}