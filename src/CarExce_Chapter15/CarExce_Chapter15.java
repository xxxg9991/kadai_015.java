package CarExce_Chapter15;
public class CarExce_Chapter15 {
    //int型でフィールド内部データの設定
    private int speed;
    private int gear;

    //コントラクタ　　　　　　　　//引数の宣言数
    public CarExce_Chapter15(int speed, int gear) {
        //初期化処理
        this.speed = speed;
        this.gear = gear;
    }
    //ゲッターメソッド→フィールドにアクセスするため
    public int getSpeed() {
        return  this.speed;
    }
    public int getGear() {
        return this.gear;
    }
    //セッターメソッド→変化の処理にアクセスするため
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setGear(int gear) {
        this.gear = gear;
    }
    //ギアチェンジした後の処理
    public void gearChange(int afterGear) {
        setGear(afterGear);
        System.out.println("ギア1から" + getGear() + "に切り替えました");
    }

    //加速した時の速度処理
    public void accelerate(int amount) {
        this.speed += amount;
    }

    //減速した時の速度処理
    public void decelerate(int amount) {
        this.speed -= amount;
        //減速した時、if文を使って減速結果を出す
        if (this.speed < 0) {
            this.speed = 0;
        }
    }

    //runメソッドの呼び出しをして現在の速度結果を実行
    public void run() {
        System.out.println("速度は時速" + this.speed + "kmです");
    }
    //メインクラスを作成し、車の変化後の状態をプログラム
    public static class Main {
        public static void main(String[] args) {
            CarExce_Chapter15 car = new CarExce_Chapter15(0, 1);
            car.gearChange(3);
            car.accelerate(30);
            car.run();
            car.decelerate(10);
        }
    }
}