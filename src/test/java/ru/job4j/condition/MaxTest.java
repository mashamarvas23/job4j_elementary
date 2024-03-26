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

    @Test
    void whenMax15To1To60Then60() {
        int first = 15;
        int second = 1;
        int third = 60;
        int result = Max.max(first, second, third);
        int expected = 60;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax13ToMinus6To7Then13() {
        int first = 13;
        int second = -6;
        int third = 7;
        int result = Max.max(first, second, third);
        int expected = 13;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax55To66To77TTo12hen77() {
        int first = 55;
        int second = 66;
        int third = 77;
        int fourth = 12;
        int result = Max.max(first, second, third, fourth);
        int expected = 77;
        assertThat(result).isEqualTo(expected);
    }

}