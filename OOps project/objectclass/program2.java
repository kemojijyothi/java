package objectclass;

public class program2 {
        int id;
        String s;
        program2(int id,String s){
            this.id=id;
            this.s=s;
        }

    public static void main(String[] args) {
        program2 p=new program2(89,"jyothi");
        System.out.println(p.toString());
        //System.out.println(p);
        }
        @Override
    public String toString(){
            return id+" "+s;
        }

}
