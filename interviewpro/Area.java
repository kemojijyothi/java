

public class Area {
    private int length;
    private int breadth;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public void disply() {
		System.out.println(length*breadth);
	}
    
}
class MainArea{
	public static void main(String args[]) {
		Area ma=new Area();
		ma.setLength(20);
		ma.setBreadth(30);
		ma.disply();
		
	}
}
