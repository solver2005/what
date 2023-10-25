package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class TestEvenArray {
    @Test
    void f() {
        assertThat(EvenArrayUtils.f()).isEqualTo(false);
    }
}
