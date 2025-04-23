import java.util.*;
public class RandomStringChooser
{
  private List<String> words;
public RandomStringChooser(String[] wordArray)
{
words = new ArrayList<String>();
for (String singleWord : wordArray)
{
 words.add(singleWord);
}
}
public String getNext()
{
if (words.size() > 0)
{
return words.remove((int)(Math.random() * words.size()));
}
return "NONE";
} 
}
