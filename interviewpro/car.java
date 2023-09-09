class Car{
    Engine e= new Engine();
}
class Engine{
    int choosino=354;
}
class Main{
    Car c=new Car();
    System.out.println(c.e.choosino);
}