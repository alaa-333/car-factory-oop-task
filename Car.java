public class Car implements CarService {

    protected String maker;
    protected String model;
    protected Engin engin;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    protected int speed;

    public Car (String maker , String model, int speed )
    {
        this.speed = speed;
        this.maker = maker;
        this.model = model;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        if (speed > 50)
        {
            engin = new EnginElectric();
            System.out.println("now EnginElectric is work");

        } else
        {
            engin = new EnginGas();
            System.out.println("now EnginGas is work");
        }

    }

    @Override
    public void stop() {

        System.out.println("car stop");
        speed = 0;

    }

    @Override
    public void acclerate() {
        speed +=20;
        System.out.println("speed increased :");
        System.out.println("now speed is :"+getSpeed());
        start();

    }

    @Override
    public void breakSpeed() {
        if (speed == 0)
        {
            System.out.println("car is fexid");
            return;
        }
        speed-=20;
        System.out.println("speed decrese :");
        System.out.println("now speed is :"+getSpeed());
        start();

    }
}
