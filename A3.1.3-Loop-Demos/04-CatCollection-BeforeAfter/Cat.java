public class Cat
{
  private String name;
  private int age;

  public Cat(String initName)
  {
    name = initName;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String newName)
  {
    name = newName;
  }

  public void setAge(int newAge)
  {
    age = newAge;
  }

  public String toString()
  {
    return name;
  }
}
