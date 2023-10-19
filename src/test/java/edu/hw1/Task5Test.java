package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Task5Test {
    @Test
    void test1() {
        assertThat(Task5.solution(11211230)).isEqualTo(true);
    }

    @Test
    void test2() {
        assertThat(Task5.solution(13001120)).isEqualTo(true);
    }

    @Test
    void test3() {
        assertThat(Task5.solution(23336014)).isEqualTo(true);
    }

    @Test
    void test4() {
        assertThat(Task5.solution(11)).isEqualTo(true);
    }

    @Test
    void test5() {
        assertThat(Task5.solution(12)).isEqualTo(false);
    }
}
