package Constructors;

public class PrintTheUserName{

    String name;

    public PrintTheUserName(String name){
        this.name=name;

    }

    void print(String name){

        this.name=name;
        System.out.println("The user name  is "+":"+name);
    }

}