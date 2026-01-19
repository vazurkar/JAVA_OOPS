package Complesproblem;

public class complexclass {
    	private int realnum;
	private int imaginaryNum;
	public complexclass (int real , int imaginary){
		this.realnum = real;
		this.imaginaryNum = imaginary;
	}
	public void plus(complexclass c2){
		this.realnum = this.realnum + c2.realnum;
		this.imaginaryNum = this.imaginaryNum + c2.imaginaryNum;
	}

    public void multiply(complexclass c2){
		int tempreal = this.realnum;
		int tempimag = this.imaginaryNum;
		this.realnum = (tempreal * c2.realnum)- (tempimag * c2.imaginaryNum);
		this.imaginaryNum = (tempreal * c2.imaginaryNum) + (tempimag * c2.realnum);
	}
	public void print(){
		System.out.println(realnum +" + i"+imaginaryNum);
	}
}
