package ru.job4j.loop;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CounterTest {
    @Test
    void whenStartMinus3Finish7Then22() {
        int start = -3;
        int finish = 7;
        int expected = 22;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart47Finish2Then0() {
        int start = 47;
        int finish = 2;
        int expected = 0;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartMinus6Finish0Then0() {
        int start = -6;
        int finish = 0;
        int expected = -21;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }
}
