 class Cat extends Animal{
    @Override
    public void eat(int food) {
        System.out.println("Кіт їсть " + food + " одиниць їжі");
    }

    public static void meow() {
        System.out.println("Кіт мурчить");
    }

}

