class OperationsCounter{

	private int ifCount = 0;
	private int arithmiticCount = 0;
	private long startTime = 0;
	private long stopTime = 0;
	private int assignmentCount = 0;

	OperationsCounter(){

	}
	public void increaseIf(){
		this.ifCount++;
	}
	public int getIfCount(){
		return ifCount;
	}
	public void resetCount(){
		this.ifCount = 0;
		this.arithmiticCount = 0;
	}
	public void increaseArithmitic(int numberOfOperations){
		this.arithmiticCount += numberOfOperations;
	}
	public int getAddCount(){
		return this.arithmiticCount;
	}

	public void startTimer(){
		this.startTime = System.currentTimeMillis();
	}
	public void stopTimer(){
		this.stopTime = System.currentTimeMillis();
	}
	public long getTime(){
		long time = (this.stopTime - this.startTime);
		return time;
	}
	public void increaseAssignmentOperations(int i){
		this.assignmentCount += i;
	}
	public int getAssignment(){
		return this.assignmentCount;
	}
}
