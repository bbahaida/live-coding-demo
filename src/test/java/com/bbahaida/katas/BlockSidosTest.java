package com.bbahaida.katas;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BlockSidosTest {
    @Test
    public void buildPages(){
        A a = new A();
        B b = (B) a;
        double d = 1.9;
    }
}

class A {

    public void m(){
        System.out.println("A");
    }
}

class B extends A{
    
}

