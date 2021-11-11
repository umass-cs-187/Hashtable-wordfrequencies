package app;

public class App {
  private static void print() {
    // PRIVATE_BEGIN
    // This is typically the solution for the project.
    System.out.println("Hello, New 187 Project!");
    // The student skeleton code is below.
    // PRIVATE_END
    /* PUBLIC_BEGIN
    // TODO: Print out your name.
    System.out.println("Hello, <your name here>!");
    PUBLIC_END */
  }

  public static void main(String[] args) throws Exception {
    App.print();

    Add adder = new Add(4, 5);
    System.out.println(adder.run());
  }
}
