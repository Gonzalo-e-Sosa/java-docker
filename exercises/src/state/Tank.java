package state;

public class Tank {
    private TankState state;

    public void setState(TankState state) {
        this.state = state;
    }

    public void moverse() {
        this.state.moverse();
    }

    public void atacar() {
        this.state.atacar();
    }
}
