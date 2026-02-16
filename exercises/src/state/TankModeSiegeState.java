package state;

public class TankModeSiegeState extends TankState {

    public TankModeSiegeState(Tank context) {
        super(context);
    }

    @Override
    public void moverse() {
        System.out.println("Siege move");
    }

    @Override
    public void atacar() {
        System.out.println("Siege atack");
    }

}
