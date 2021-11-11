package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runner.JUnitCore;
import com.gradescope.jh61b.grader.GradedTestListenerJSON;

@RunWith(Suite.class)
@Suite.SuiteClasses({
  ProjectTests.class,
})
public class RunTests {
  public static void main(String[] args) {
    JUnitCore runner = new JUnitCore();
    runner.addListener(new GradedTestListenerJSON());
    runner.run(RunTests.class);
  }
}
