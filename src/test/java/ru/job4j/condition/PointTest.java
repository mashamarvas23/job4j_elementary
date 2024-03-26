package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.BDDAssertions.withPrecision;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        Point first = new Point(0, 0);
        Point second = new Point(2, 0);
        double output = first.distance(second);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when43toMinus29then8dot48() {
        double expected = 8.48;
        Point first = new Point(4, 3);
        Point second = new Point(-2, 9);
        double output = first.distance(second);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when12Minus6toMinus131then25dot96() {
        double expected = 25.96;
        Point first = new Point(12, -6);
        Point second = new Point(-13, 1);
        double output = first.distance(second);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when98to76then2dot82() {
        double expected = 2.82;
        Point first = new Point(9, 8);
        Point second = new Point(7, 6);
        double output = first.distance(second);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when98Minus3to765then8dot48() {
        double expected = 8.48;
        Point first = new Point(9, 8, -3);
        Point second = new Point(7, 6, 5);
        double output = first.distance3d(second);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when321to456then5dot91() {
        double expected = 5.91;
        Point first = new Point(3, 2, 1);
        Point second = new Point(4, 5, 6);
        double output = first.distance3d(second);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}