package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax196To5Then196() {
        int left = 196;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 196;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxMinus5To5Then5() {
        int left = -5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax15To15Then15() {
        int left = 15;
        int right = 15;
        int result = Max.max(left, right);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

}