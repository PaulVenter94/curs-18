package ro.fasttrackit.curs18;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RecursiveTest {
    Recursiv recursiv;

    @BeforeEach
    void setup() {
        recursiv = new Recursiv();
    }

    @Test
    @DisplayName("When null is received THEN throw exception")
    void ifNullThenException() {
        assertThrows(IllegalArgumentException.class, () -> recursiv.lenght(null));
    }

    @Test
    @DisplayName("WHEN empty string is given THEN return 0")
    void ifEmptyString() {
        assertThat(recursiv.lenght("")).isEqualTo(0);
    }

    @Test
    @DisplayName("When given a word THEN return its lenght")
    void forWord() {
        assertThat(recursiv.lenght("word")).isEqualTo(4);
    }
}
