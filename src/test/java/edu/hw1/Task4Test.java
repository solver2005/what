package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Task4Test {
    @Test
    void test1(){
        assertThat(edu.hw1.task4.fixString("123456")).isEqualTo("214365");
    }
    @Test
    void test2(){
        assertThat(edu.hw1.task4.fixString("hTsii  s aimex dpus rtni.g")).isEqualTo("This is a mixed up string.");
    }
    @Test
    void test3(){

        assertThat(edu.hw1.task4.fixString("badce")).isEqualTo("abcde");
    }
}
