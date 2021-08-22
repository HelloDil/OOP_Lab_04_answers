//Question 01

abstract class Animal {
   private String name;
   public Animal(String name) {
       this.name = name;
   }
  abstract public String speak();
  public Animal() {
	  System.out.println("Animal constructor called");
	  }    
  
  public void display() {
      System.out.println("My name is " + this.name + ".  " + this.speak() + ".");
  }
}


class Dog extends Animal {
   public Dog(String name) {
      super(name);
   }
   public String speak() {
       return "Bow Wow";
   }
   public Dog() {
	   System.out.println("Dog constructor called");
	   }
}


class Cat extends Animal {
  public Cat(String name) {
      super(name);
   }
  public String speak() {
      return "Meow Meow";
  }
  public Cat() {
	  System.out.println("Cat constructor called");
	  }
}

class ToyCat extends Cat {
  String manufacturer;
  public ToyCat(String name, String manufacturer) {
     super(name);
     this.manufacturer = manufacturer;
  }
  public ToyCat() {
	  System.out.println("ToyCat constructor called");
	  }
  public void display() {
     super.display();
     System.out.println("I am from " + manufacturer + ".");
  }
}

class Main {
  public static void main(String[] args) {
     Animal animal1 = new Dog("test");
     animal1.display();
     
     Cat mycat = new Cat("Micky");
     mycat.display();
     
     Dog mydog = new Dog("Rover");
     mydog.display();
     
     ToyCat mytoy = new ToyCat("kittie","Toysrus");
     mytoy.display();
     ToyCat T1=new ToyCat();
     
     
  }
}
