class Student1{
    
        String name;
        int id;
        Student1(String name,int id){
            name=name;//here non static variable name and local variable are same preference is gieven by local variable
            id=id;
        }
        public static void main(String []args){
            Student1 s1=new Student1("jyothi",70);
            System.out.println(s1.name+"\n"+s1.id);
        }
    
}