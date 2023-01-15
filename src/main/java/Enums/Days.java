package Enums;

public enum Days{

SUNDAY("firstDay"),Monday("SecondDay"),Tuesday("ThirdDay");


private  String count;

private Days(String count){

    this.count=count;
}

    public String getCount() {
        return count;

    }
}