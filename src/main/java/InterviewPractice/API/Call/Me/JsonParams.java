package InterviewPractice.API.Call.Me;

public class JsonParams {

    private String name;
    private  String id;

    public void setId(String id){
        this.id=id;


    }

    public String getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}