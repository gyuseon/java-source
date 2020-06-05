package thread;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	//synchronized -동기화   메소드보다는 블록으로 형성하는것이 좋다(중간마다 동기화를 사용하시)
	public /*synchronized*/ void setMemory(int memory) {
		synchronized (this) {
			
			this.memory = memory;
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" : "+this.memory);
		
		}
	}

}
