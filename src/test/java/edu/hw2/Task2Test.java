package edu.hw2;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class Task2Test {
    @Test
    void test1() {
        Rectangle r = new Rectangle();
        r.setHeight(10);
        r.setWidth(20);
        assertThat(r.area()).isEqualTo(200);
    }

    @Test
    void test2() {
        Square s = new Square();
        s.setSize(10);
        assertThat(s.area()).isEqualTo(100);
    }
}
