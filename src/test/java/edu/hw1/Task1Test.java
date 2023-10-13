package edu.hw1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Task1Test {
    @Test
    void f() {
        assertThat(edu.hw1.task1.f("01:01")).isEqualTo(61);
    }

    @Test
    void test2() {
        assertThat(edu.hw1.task1.f("01:61")).isEqualTo(-1);
    }

    @Test
    void test3() {
        assertThat(edu.hw1.task1.f("13:56")).isEqualTo(836);
    }

    @Test
    void test4() {
        assertThat(edu.hw1.task1.f("10:60")).isEqualTo(-1);
    }

    @Test
    void test5() {
        assertThat(edu.hw1.task1.f("999:53")).isEqualTo(59993);
    }
}
