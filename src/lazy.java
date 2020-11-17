import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class lazy {

    public static lazy instance;
    public String [] arr= {"a","b","c","d"};
    List<String>list= Arrays.asList(arr);
    private lazy(){
        Collections.shuffle(list);
    }
    public void print()
    { for (String item : list){ System.out.printf("%s ", item); }System.out.println(); }

    public static lazy getInstance() {
        if(instance==null)
            instance=new lazy();
         return instance;
    }

}
