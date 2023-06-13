

public class MainClass {
    public static void main(String[] args) {
//        Cat cat = new Cat("Васька" ,50, false);
//        Plate plate = new Plate(100);
//        plate.info();
//        cat.eat();
//
//        int catRes;
//        catRes = plate.getFood()-cat.getAppetite();
//        if(catRes >= 50){
//            cat.setSatiety(true);
//            System.out.println("Котик наелся");
//        } else if (catRes < 0) System.out.println("Не может быть отрицательного числа");

        Cat[] cats = new Cat[3];
        cats[0] = new Cat ("Барсик",40,false);
        cats[1] = new Cat ("Маркиз",32,false);
        cats[2] = new Cat ("Мурзик",34, false);

        Plate plate = new Plate(200);
        plate. info();
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].satiety == false && cats[i].appetite < plate.food){
                cats[i].eat(plate);
                cats[i].satiety = true;
                System.out.println("Кот " + cats[i].name + " поел!");
            } else {
                System.out.println("Кот " + cats[i].name + " не поел!");
            }
        }
    }
}