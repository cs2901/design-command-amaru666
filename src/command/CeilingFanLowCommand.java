package command;

public class CeilingFanLowCommand implements Command {
  CeilingFan fan;

  public CeilingFanLowCommand(CeilingFan fan) {
    this.fan = fan;
  }

  @Override
  public void execute() {
    fan.low();
  }

}
