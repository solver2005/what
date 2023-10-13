package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Task7Test {
    @Test
    void test1() {
        assertThat(edu.hw1.task7.rotateRight(8, 1)).isEqualTo(4);
    }

    @Test
    void test2() {
        assertThat(edu.hw1.task7.rotateLeft(16, 1)).isEqualTo(1);
    }

    @Test
    void test3() {
        assertThat(edu.hw1.task7.rotateLeft(17, 2)).isEqualTo(6);
    }
}
