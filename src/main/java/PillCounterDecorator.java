public class PillCounterDecorator implements PillCounter {
  PillCounter counter;

  public PillCounterDecorator(PillCounter counter) {
    this.counter = counter;
  }

  @Override
  public void addPill(int count) {
    counter.addPill(count);
  }

  @Override
  public void removePill() {
    counter.removePill();
  }

  @Override
  public void reset() {
    counter.reset();
  }

  @Override
  public int getPillCount() {
  return counter.getPillCount();
  }
}
