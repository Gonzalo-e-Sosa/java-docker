package state;

public abstract class TankState {
    protected Tank context;

    public TankState(Tank context) {
        this.context = context;
    }

    public Tank getContext() {
        return this.context;
    }

    public abstract void moverse();

    public abstract void atacar();
}
