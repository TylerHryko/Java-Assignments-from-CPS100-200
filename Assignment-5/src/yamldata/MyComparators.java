package yamldata;

import java.util.*;

public class MyComparators
{
  public static final Comparator<String> REVERSE_LAST_NAME_ORDER = new Comparator<String>()
  {
    public int compare(String e1, String e2)
    {
      return e2.compareTo(e1);
    }
  };

}
