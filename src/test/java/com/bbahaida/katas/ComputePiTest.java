package com.bbahaida.katas;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComputePiTest {

    @Test
    public void computePi_should_return_between_1_and_4(){
        Assertions.assertThat(ComputePi.computePi(1000000)).isBetween(3d, 3.4);
    }

}
