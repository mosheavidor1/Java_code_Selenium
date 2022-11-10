package Generics;

public class Names<T> {

    T name;

    public Names(T name){

        this.name=name;
    }

public T getName(){
    return name;
    }
}