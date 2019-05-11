package command;

public class KitchenOnCommand implements Command {
    Kitchen kitchen;

    public KitchenOnCommand(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    @Override
    public void execute() {
        kitchen.on();
    }
}
