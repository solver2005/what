package edu.hw1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TestMain {
    @Test
    void f() {
        assertThat(Main.f()).isEqualTo(true);
    }
}
