package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Task5Test {
    @Test
    void test1() {
        assertThat(edu.hw1.task5.Palindrome("11211230")).isEqualTo(true);
    }

    @Test
    void test2() {
        assertThat(edu.hw1.task5.Palindrome("13001120")).isEqualTo(true);
    }

    @Test
    void test3() {
        assertThat(edu.hw1.task5.Palindrome("23336014")).isEqualTo(true);
    }

    @Test
    void test4() {
        assertThat(edu.hw1.task5.Palindrome("11")).isEqualTo(true);
    }

    @Test
    void test5() {
        assertThat(edu.hw1.task5.Palindrome("12")).isEqualTo(false);
    }
}
