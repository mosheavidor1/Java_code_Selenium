package Stream;

public class PeopleList {

    private final int age;
    private final String name;
    private final Gender gender;

    public PeopleList(String name, int age, Gender gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    @Override

    public String toString(){
        return "PeopleList{"+"name='"+name+'\''+",age="+age+",gender="+gender+'}';


    }

}