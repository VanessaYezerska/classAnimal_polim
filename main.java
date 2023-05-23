public class main {
    public static void main(String[] args) {
        Animal animal1 = new Lion();
        Animal animal2 = new Elephant();
        Animal animal3 = new Cat();

        // Виклик перевизначених методів
        animal1.eat(5);  // "Lion їсть 5 одиниць їжі"
        animal2.eat(10); // "Elephant їсть 10 одиниць їжі"
        animal3.eat(2);  //  "Cat їсть 2 одиниці їжі"

        // Виклик статичних методів
        Lion.roar();     // Виводить: "Lion ричить"
        Elephant.trumpet();  // Виводить: "Elephant трубить"
        Cat.meow();   // Виводить: "Cat мурчить"
    }
}