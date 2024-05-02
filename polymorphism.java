class polymorphism {
    public static void main(String[] args) {
      System.out.println("The animal makes a sound");
    }
  }
  
  class Pig extends polymorphism {
    public void animalSound() {
      System.out.println("The pig says: wee wee");
    }
  }
  
  class Dog extends polymorphism {
    public void animalSound() {
      System.out.println("The dog says: bow wow");
    }
  }
  