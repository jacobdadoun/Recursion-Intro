package edu.touro.mco264;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RecursionTest {
    Recursion recur = new Recursion();

    @Test
    void add(){
        System.out.println(recur.add(4,3));
    }

    @Test
    void mult(){
        System.out.println(recur.mult(4,4));
    }

    @Test
     void pow(){
        System.out.println(recur.pow(4,3));
    }

}
