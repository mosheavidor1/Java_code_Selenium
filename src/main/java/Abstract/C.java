package Abstract;

public class C extends B{

    int x;
    int y;


    public C(int x ,int y){
        this.x=x;
        this.y=y;

        sum();
    }


    @Override
    int sum() {


        return x+y;
    }


}
