package Day16_Inheritance;

//Parent
class Animal
{
    void eat()
    {
        System.out.println("Animal is eating..");
    }
}

//Child 1
class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog is barking..");
    }
}

//Child 2
class Cat extends Animal
{
    void meow()
    {
        System.out.println("Cat is meowing..");
    }
}
public class Ex3_HierarchicalInheritance {
    public static void main(String[] args) {
       //Case 1
        Dog d = new Dog();
        d.eat(); //Parent
        d.bark(); //Dog

        //Case 2
        Cat c =new Cat();
        c.eat(); //Parent
        c.meow(); //Parent

        //Case 3
        Animal ad = new Dog();
        ad.eat();

        //Case 4
        Animal ac = new Cat();
        ac.eat();


    }
}
