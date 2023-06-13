public class Plate {
    public int food;

    public int getFood() {
        return food;
    }

    public Plate(int food) {
        this.food = food;
    }


    public void setFood(int food){ //чтобы в тарелке с едой не могло получиться отрицательного количества еды
        if(food >= 0){
            this.food = food;
        }
        else{
            System.out.println("Ошибка!  Количество еды не может быть отрицательным числом");
        }
    }

    public void addFood(int y) {
        food -= y;
    }
    public void deleteFood(int x) {
        food += x;
    }

    public void info() {
        System.out.println("В тарелке: " + food + "граммов");
    }
}