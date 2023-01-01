package threads;

public class MultiWithInterface implements Runnable {
	private int threadNum;

	@Override
	public void run() {

		System.out.println("  thread : " + threadNum);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public MultiWithInterface(int threadNum) {
		super();
		this.threadNum = threadNum;
	}

	public int getThreadNum() {
		return threadNum;
	}

	public void setThreadNum(int threadNum) {
		this.threadNum = threadNum;
	}

}
