package Singletone;

public  class SingleTon {

private static SingleTon instance=null;

private SingleTon(){
}

public static SingleTon getInstance(){

    if(instance==null){
        instance=new SingleTon();
    }
    return instance;
}

public void Run(){

    System.out.println("Singleton action");

}
}