package Generics;



public class Generic_Test implements Print {


    Numbers<Integer> numbers = new Numbers<>(7);
    Names<String>names=new Names<>("Moshe");





    public void details(){
   System.out.println(first+space+names.getName()+space+Second+space+numbers.getNumber());

    }
}
