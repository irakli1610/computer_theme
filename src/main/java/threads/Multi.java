package threads;


public class Multi extends Thread {
	private int threadNum;
	@Override
	public void run() {
		for(int i=1; i<11; i++) {
					System.out.println("number: "+ i+ "  thread : "+ threadNum);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}
	}
	public Multi(int threadNum) {
		this.threadNum = threadNum;
	}
	public int getThreadNum() {
		return threadNum;
	}
	public void setThreadNum(int threadNum) {
		this.threadNum = threadNum;
	}	
}
