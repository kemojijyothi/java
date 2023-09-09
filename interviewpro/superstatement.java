

class parentclass1 {
	parentclass1(){
		this(5);
		System.out.println("parentclass nonparemeter");
	}
	parentclass1(int i){
		System.out.println("parentclass int type");
	}
}
class childclass1 extends parentclass1{
	childclass1(){
		this(5.6);
		System.out.println("childclass non paramenter");
	}
	childclass1(double d){
		System.out.println("childclass doube type");
	}
	public static void main(String []args) {
		childclass1 cc=new childclass1();
	}
}
