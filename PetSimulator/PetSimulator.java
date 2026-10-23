/*
 * Activity 3.1.3
 */
public class PetSimulator
{
  public static void main(String[] args)
  {
    Pet[] pets = new Pet[10];

    pets[0] = new Pet("Whiskers", Pet.CAT);
    pets[1] = new Pet("Mittens", Pet.CAT);
    pets[2] = new Pet("Rex", Pet.DOG);
    pets[3] = new Pet("Buddy", Pet.DOG);

    for (Pet pet : pets)
      if (pet != null)
        pet.feed();

    for (Pet pet : pets)
      if (pet != null)
        pet.setOwner("Braedyn");

    for (Pet pet : pets)
      if (pet != null && pet.getType() == Pet.DOG)
      {
        pet.makeNoise();
        pet.walk();
      }

    for (Pet pet : pets)
      if (pet != null && pet.getType() == Pet.CAT)
        pet.makeNoise();

    for (Pet pet : pets)
      if (pet != null)
        pet.giveTreat();

    for (Pet pet : pets)
      if (pet != null && pet.getType() == Pet.CAT)
        pet.groom();

    for (Pet pet : pets)
      if (pet != null)
        pet.play();

    for (Pet pet : pets)
      if (pet != null)
      {
        pet.sleep();
        pet.feed();
      }

    System.out.println("--- MY PETS ---");
    for (Pet pet : pets)
      if (pet != null)
        System.out.println(pet);

    pets[4] = new Pet("Cocoa", Pet.CAT);
    pets[5] = new Pet("Max", Pet.DOG);

    pets[4].setOwner("Friend");
    pets[5].setOwner("Friend");

    System.out.println("--- MY PETS ---");
    for (Pet pet : pets)
      if (pet != null)
        System.out.println(pet);
  }
}
