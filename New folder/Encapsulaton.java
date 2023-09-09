class Demo{
    private int i;
    private String s;
    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }
    public String getS() {
        return s;
    }
    public void setS(String s) {
        this.s = s;
    }
    
}
class MainDemo{
    public static void main(String [] args){
        Demo d=new Demo();
        d.setI(6);
        d.setS("jyothi");
        System.out.println(d.getI());
        System.out.println(d.getS());
    }
}