class Student{
    String name;
    int id;
    long phonenumber;
    int age;
    static String institutename="sridhars";
    Student(String stdname,int stdid,long stdphonenumber,int stdage){
        name=stdname;
        id=stdid;
        phonenumber=stdphonenumber;
        age=stdage;
    }
    public static void main(String []args){
       Student s1=new Student("jyothi",34,8765434565l,23);
        System.out.println("studentname is:"+s1.name+"\n"+"student id is:"+s1.id+"\n"+"student phonenumber:"+s1.phonenumber+"\n"+"student age is:"+s1.age);
        System.out.println();
      Student s2=new Student("jyothi",34,8765434565l,23);
        System.out.println("studentname is:"+s2.name+"\n"+"student id is:"+s2.id+"\n"+"student phonenumber:"+s2.phonenumber+"\n"+"student age is:"+s2.age);

    }
}