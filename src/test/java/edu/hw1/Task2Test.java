package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class Task2Test {
    @Test
    void test1(){
        assertThat(edu.hw1.task2.f(422)).isEqualTo(3);
    }
    @Test
    void test2(){
        assertThat(edu.hw1.task2.f(0)).isEqualTo(1);
    }
    @Test
    void test3(){
        assertThat(edu.hw1.task2.f(4666)).isEqualTo(4);
    }
}
