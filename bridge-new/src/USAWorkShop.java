public class USAWorkShop extends WorkShop{

    public USAWorkShop(Engine engine) {
        super(engine);
    }

    @Override
    void setType() {
        engine.setType("USA");
    }

    @Override
    void setSpeed() {
        engine.setSpeed(250);
    }
}
