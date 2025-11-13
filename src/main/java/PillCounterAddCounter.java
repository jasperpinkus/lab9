import java.util.ArrayList;

public class PillCounterAddCounter extends PillCounterDecorator {

  ArrayList<Integer> listCount = new ArrayList<>();
  int pillCount;
  PillCounter model;

  public PillCounterAddCounter(PillCounter counter) {
    super(counter);
    model = counter;
  }

  @Override
  public void addPill(int pillCount) {
    this.pillCount += pillCount;
    model.addPill(pillCount);
  }

  @Override
  public void reset() {
    listCount.add(pillCount);
    pillCount = 0;
    model.reset();
  }

  public ArrayList<Integer> totalPillCount() {
    return listCount;
  }
}
