public class Lion extends Animal {

    @Override
    public void eat(int food) {
        System.out.println("Lion їсть " + food + " одиниць їжі");
    }

    public static void roar() {
        System.out.println("Lion ричить");
    }

}
