public class MyClass2
{
  private int a;
  public double b;
  
  public MyClass2(int first, double second)
  {
    this.a = first;
    this.b = second;
  }
  
  public static void incrementBoth(MyClass2 c1) {
    c1.a = c1.a + 1;
    c1.b = c1.b + 1.0;
  }
  
  // new method
  public static void incrementA(int first)
  {
    first = first + 1;
  }
  
  // new method
  public static void incrementB(double second)
  {
    second = second + 1.0;
  }
  
  public static void main(String[] args)
  {
    MyClass2 c1 = new MyClass2(10, 20.5);
    MyClass2 c2 = new MyClass2(10, 31.5);
    // different code below
    incrementA(c2.a);
    incrementB(c2.b);
    System.out.println(c2.a + ", "+ c2.b);
  }
}