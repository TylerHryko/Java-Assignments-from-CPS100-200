package yamldata;

import java.io.*;
import java.util.*;
import com.esotericsoftware.yamlbeans.*;

// YAMLBEANS Library is NEEDED
public class Loader
{
  public static Library loadLibrary(String filename)
  {
    Library library = null;
    try
    {
      YamlReader reader = new YamlReader(new FileReader(filename));
      reader.getConfig().setClassTag("ruby/object:Course", Course.class);
      reader.getConfig().setPropertyElementType(Library.class, "students", Student.class);
      reader.getConfig().setPropertyElementType(Student.class, "courses", Course.class);

      library = reader.read(Library.class);
    }
    catch(Exception e )
    {
      System.out.println(e.getMessage());
    }
    return library;
  }

}
