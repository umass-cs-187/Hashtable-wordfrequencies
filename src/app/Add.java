package app;

public class Add {
  private int a;
  private int b;

  public Add(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public int run() {
    // PRIVATE_BEGIN
    return this.a + this.b;
    // PRIVATE_END
    /* PUBLIC_BEGIN
    // TODO: Implement the addition of a and b.
    return -1;
    PUBLIC_END */
  }
}
