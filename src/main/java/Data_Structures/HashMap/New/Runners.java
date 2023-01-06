package Data_Structures.HashMap.New;

import org.openqa.selenium.devtools.v103.css.model.Value;

import java.util.*;

public class Runners {




public Set<String>runnersData(){

    HashMap<String,Double> scores =new HashMap<>();

    scores.put("Moshe",5.5);
    scores.put("John",9.5);
    scores.put("Chris",3.5);
    scores.put("Bob",6.7);
    scores.put("Alice",4.5);

  Double minScore = Collections.min(scores.values());

  Set<String> list = new TreeSet<>();

  for(Map.Entry<String,Double>score:scores.entrySet()){
      if(score.getValue()==minScore){
          list.add(score.getKey()+":"+score.getValue());



      }
  }

return list;
}

}

