package Car_Chapter15;

public class Car_Chapter15 {
    private int gear; //ギアフィールド
    private int speed; //ギアチェンジ後のスピード

    public Car_Chapter15() {
        gear = 1; //ギア
        speed = 10; //速度
    }

    //ギアを変更するメソッド
    public void gearChange(int afterGear) {
        gear = afterGear;
        System.out.println("ギア1から" + gear + "に切り替えました");
    }

    //現在の速度を表示するメソッド
    public void run() {
        System.out.println("速度は時速" + speed + "kmです");
    }

    //メインメソッドを呼び出して結果を出力
    public static class Main {
        public static void main(String[] args) {
            Car_Chapter15 car = new Car_Chapter15();
            car.gearChange(3);
            car.run();
        }
    }
}