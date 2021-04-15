public class Operations{

	private long assignmentCount = 0;
	private long ifCount = 0;
	private long forCount = 0;
	private long whileCount = 0;
	private long plusCount = 0;
	private long minusCount = 0;
	private long totalOps = 0;

	public void addAssignment(int count){
		this.assignmentCount += count;
	}

	public void addIf(int count){
		this.ifCount += count;
	}

	public void addFor(int count){
		this.forCount += count;
	}

	public void addWhile(int count){
		this.whileCount += count;
	}

	public void addPlus(int count){
		this.plusCount += count;
	}

	public void addMinus(int count){
		this.minusCount += count;
	}

	public void showOps(){
		this.totalOps = assignmentCount + ifCount + forCount +
			whileCount + plusCount + minusCount;
		System.out.println("Assignments: " + this.assignmentCount +
			", Ifs: " + this.ifCount + ", Fors: " + forCount +
			", Whiles: " + this.whileCount + ", Additions: " +
			this.plusCount + ", Subtractions: " + minusCount +
			", Total Operations: " + this.totalOps);
	}
}
