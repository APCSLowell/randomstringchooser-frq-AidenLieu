import java.util.*;
public class RandomStringChooser
{
  private ArrayList<String> a;
  public RandomStringChooser(string[] b){
    a = new ArrayList<String>();
    for (int i = 0; i <b.length; i++){
      a.add(b[i]);
    }
  } 
  public String getNext(){
    if(a.size() > 0){
      return a.remove(Math.random() * a.size());
    }
    return "NONE";
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
