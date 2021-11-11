package test;

import static org.junit.Assert.assertTrue;

// PRIVATE_BEGIN
import com.gradescope.jh61b.grader.GradedTest;
// PRIVATE_END

import org.junit.Before;
import org.junit.Test;

// these are the same as public tests
public class ProjectTests {

  @Before
  public void before() {
    // Before each test.
  }

  /* PUBLIC_BEGIN
  // These tests are public tests.
  @Test(timeout = 3000)
  public void testPublicExampleOne() {
    assertTrue(true);
  }
  PUBLIC_END */

  // PRIVATE_BEGIN
  // These tests *will not* show up in the student distribution.
  @Test(timeout = 3000)
  @GradedTest(name = "testPrivateExampleOne", max_score = 2)
  public void testPrivateExampleOne() {
    assertTrue(true);
  }

  @Test(timeout = 3000)
  @GradedTest(name = "testPrivateExampleTwo", max_score = 2)
  public void testPrivateExampleTwo() {
    assertTrue(false);
  }
  // PRIVATE_END
}
