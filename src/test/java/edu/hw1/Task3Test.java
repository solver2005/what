package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Task3Test {
    @Test
    void test1() {
        int[][] t = {{1, 2, 3, 4}, {0, 6}};
        assertThat(edu.hw1.task3.isNeastable(t)).isEqualTo(true);
    }

    @Test
    void test2() {
        int[][] t = {{3, 1}, {4, 0}};
        assertThat(edu.hw1.task3.isNeastable(t)).isEqualTo(true);
    }

    @Test
    void test3() {
        int[][] t = {{9, 9, 8}, {8, 9}};
        assertThat(edu.hw1.task3.isNeastable(t)).isEqualTo(false);
    }

    @Test
    void test4() {
        int[][] t = {{1, 2, 3, 4}, {2, 3}};
        assertThat(edu.hw1.task3.isNeastable(t)).isEqualTo(false);
    }
}
