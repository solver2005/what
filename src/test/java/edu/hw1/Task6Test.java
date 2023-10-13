package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Task6Test {
    @Test
    void test1() {
        assertThat(edu.hw1.task6.f(6621, 0)).isEqualTo(5);
    }

    @Test
    void test2() {
        assertThat(edu.hw1.task6.f(6554, 0)).isEqualTo(4);
    }

    @Test
    void test3() {
        assertThat(edu.hw1.task6.f(1234, 0)).isEqualTo(3);
    }
}
