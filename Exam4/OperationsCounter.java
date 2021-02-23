class OperationsCounter{
/*	--------------------------------------------
			OperationsCounter
	--------------------------------------------
	-ifCount: int
	-arithmiticCount: int
	-startTime: long
	-stopTime: long
	-assignmentCount: long
	--------------------------------------------
	+increaseIf(): void
	+increaseArithmitic(operations: int): void
	+increaseAssignmentOperations(i: int): void
	+getIfCount(): int
	+getAddCount(): int
	+getAssignment(): int
	+resetCount(): void
	+startTimer(): void
	+stopTimer(): void
	+getTime(): long
	--------------------------------------------
*/
	private int ifCount = 0;
	private int arithmiticCount = 0;
	private long startTime = 0;
	private long stopTime = 0;
	private int assignmentCount = 0;

	public void increaseIf(){
		this.ifCount++;
	}
	public void increaseArithmitic(int operations){
		this.arithmiticCount += operations;
	}
	public void increaseAssignmentOperations(int i){
		this.assignmentCount += i;
	}

	public int getIfCount(){
		return ifCount;
	}
	public int getAddCount(){
		return this.arithmiticCount;
	}
	public int getAssignment(){
		return this.assignmentCount;
	}

	public void resetCount(){
		this.ifCount = 0;
		this.arithmiticCount = 0;
	}

	//Timer
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
}
