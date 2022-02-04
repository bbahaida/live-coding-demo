package com.bbahaida.turing;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class TuringTest {

    @Test
    public void valid_should_return_true(){
        String input = "()[]";
        boolean result = Turing.valid(input);
        Assertions.assertThat(result).isTrue();
    }
    @Test
    public void valid_should_return_false(){
        String input = "()]";
        boolean result = Turing.valid(input);
        Assertions.assertThat(result).isFalse();
    }
}
