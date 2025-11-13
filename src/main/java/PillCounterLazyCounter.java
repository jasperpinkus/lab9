public class PillCounterLazyCounter extends PillCounterDecorator{

  int pillCount;
  PillCounter model;

  public PillCounterLazyCounter(PillCounter counter) {
    super(counter);
    model = counter;
  }

  @Override
  public void addPill(int count) {
    pillCount += count;
  }

  @Override
  public void reset() {
    countPills();
    model.reset();
  }

  @Override
  public int getPillCount() {
    countPills();
    return model.getPillCount();
  }

  private void countPills() {
    model.addPill(pillCount);
    pillCount = 0;
  }
}
