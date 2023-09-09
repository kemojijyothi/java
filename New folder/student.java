class Student{
    private int id;
    private String name;
     private long phonenumber;
     public Student(int id,String name,long phonenumber){
        this.id=id;
        this.name=name;
        this.phonenumber=phonenumber;
     }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }
}
class MianStudent{
    public static void main(String []args){
        Student s=new Student(56,"jyothi " ,9765434567l);
        System.out.println(s.getId());
         System.out.println(s.getName());
         System.out.println(s.getPhonenumber());
        
    }
}