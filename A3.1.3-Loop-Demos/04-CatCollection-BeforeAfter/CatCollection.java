public class CatCollection
{
  public static void main(String[] args)
  {
    Cat[] cats = {new Cat("Fluffy"), new Cat("Freckles"), new Cat("Boots")};
    for (Cat c : cats) {
      if (c.getName().equals("Boots")) {
        System.out.println(c);
        c.setName("Kitty");
        System.out.println(c);
      }
    }
  }
}
