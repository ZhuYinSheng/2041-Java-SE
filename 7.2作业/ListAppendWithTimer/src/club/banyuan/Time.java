package club.banyuan;

public class Time implements Timer {

  private long startTime = 0;
  private long endTime = 0;
  private long subTime = 0;
  private boolean isSuspended = true;

  @Override
  public void start() throws IllegalStateException {
    if (!isSuspended) {
      throw new IllegalStateException();
    } else {
      startTime = System.currentTimeMillis();
      isSuspended = false;
    }
  }

  @Override
  public void stop() throws IllegalStateException {
    if (isSuspended) {
      throw new IllegalStateException();
    } else {
      endTime = System.currentTimeMillis();
      isSuspended = true;
    }
  }

  @Override
  public void reset() {
    subTime = 0;
    isSuspended = true;
  }

  @Override
  public long getTimeMillisecond() {
    subTime = endTime - startTime;
    return subTime;
  }
}
