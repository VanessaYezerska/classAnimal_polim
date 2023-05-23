public class Elephant extends Animal {
    @Override
    public void eat(int food) {
        System.out.println("Elephant їсть " + food + " одиниць їжі");
    }

    public static void trumpet() {
        System.out.println("Elephant трубить");
    }

}
