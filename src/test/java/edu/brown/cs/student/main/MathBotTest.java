package edu.brown.cs.student.main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathBotTest {

  @Test
  public void testAddition() {
    MathBot matherator9000 = new MathBot();
    double output = matherator9000.add(10.5, 3);
    assertEquals(13.5, output, 0.01);
  }

  @Test
  public void testLargerNumbers() {
    MathBot matherator9001 = new MathBot();
    double output = matherator9001.add(100000, 200303);
    assertEquals(300303, output, 0.01);
  }

  @Test
  public void testSubtraction() {
    MathBot matherator9002 = new MathBot();
    double output = matherator9002.subtract(18, 17);
    assertEquals(1, output, 0.01);
  }

  // TODO: add more unit tests of your own

  @Test
  public void testNegativeAddition(){
    MathBot negAdd = new MathBot();
    double negFirstNotOverall = negAdd.add(-3, 4);
    assertEquals(1,negFirstNotOverall, 0.01);
    double negSecondNotOverall = negAdd.add(5, -2);
    assertEquals(3, negSecondNotOverall, 0.01);
    double negFirstYOverall = negAdd.add(-6.5,3);
    assertEquals(-3.5, negFirstYOverall, 0.01);
    double negSecondYOverall = negAdd.add(1,-5.8);
    assertEquals(-4.8, negSecondYOverall, 0.01);
    double negBoth = negAdd.add(-3.6, -4.4);
    assertEquals(-8, negBoth, 0.01);
  }

  @Test
  public void testZero(){
    MathBot forZero = new MathBot();
    double firstInputZero = forZero.add(0, 22);
    assertEquals(22, firstInputZero, 0.01);
    double equalsZeroFirstInputNeg = forZero.add(-24, 24);
    assertEquals(0, equalsZeroFirstInputNeg, 0.01);
  }
}
