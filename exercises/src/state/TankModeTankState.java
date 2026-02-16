package state;

public class TankModeTankState extends TankState {

    public TankModeTankState(Tank context) {
        super(context);
    }

    @Override
    public void moverse() {
        System.out.println("Tank move");
    }

    @Override
    public void atacar() {
        System.out.println("Tank atack");
    }
}
