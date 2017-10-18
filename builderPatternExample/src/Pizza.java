
public abstract class Pizza implements Item {
    @Override
    public abstract float price();

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
