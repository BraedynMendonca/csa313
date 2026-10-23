public class CatCollection
{
  public static void main(String[] args)
  {
    Cat[] cats = {new Cat("Fluffy"), new Cat("Freckles"), new Cat("Boots")};
    for (Cat c : cats) {
      c.setAge(2);
    }
    for (Cat c : cats) {
      System.out.println(c);
    }
  }
}
