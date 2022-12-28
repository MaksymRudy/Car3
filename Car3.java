public class Car3 {
    int age = 0;
    int power = 100;
    int turbo = 25;

    public static void main(String[] args) {
        Car3 Fiat1 = new Car3();
        Car3 Fiat2 = new Car3();

        System.out.println(Fiat1.getAge());
        System.out.println(Fiat1.calculateIndex());
        System.out.println(Fiat2.power);
        System.out.println(Fiat2.upgradePower(100));
        System.out.println(Fiat2.calculateIndex());
    }

    int getAge();{
        return age;
    }
    int calculateIndex() {
        return power * 10 + turbo;
    }

    int upgradePower(int newPower) {
        power = power + newPower;
        return power;

    }


}
