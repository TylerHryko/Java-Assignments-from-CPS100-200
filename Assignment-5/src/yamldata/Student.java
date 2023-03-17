package yamldata;
import java.util.*;


public class Student
{
  private String first;
  private String last;
  private int id;
  private int age;
  private String city;
  private ArrayList<Course> courses;
  private int money;
  
  public Student(String first, String last, int id, int age, String city,
      ArrayList<Course> courses, int money)
  {
    this.first = first;
    this.last = last;
    this.id = id;
    this.age = age;
    this.city = city;
    this.courses = courses;
    this.money = money;
  }

  public Student()
  {
    first = "";
    last = "";
    id = 0;
    age = 0;
    city = "";
    courses = null;
    money = 0;
  }

  public String getFirst()
  {
    return first;
  }

  public void setFirst(String first)
  {
    this.first = first;
  }

  public String getLast()
  {
    return last;
  }

  public void setLast(String last)
  {
    this.last = last;
  }

  public int getId()
  {
    return id;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public int getAge()
  {
    return age;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  public String getCity()
  {
    return city;
  }

  public void setCity(String city)
  {
    this.city = city;
  }

  public ArrayList<Course> getCourses()
  {
    return courses;
  }

  public void setCourses(ArrayList<Course> courses)
  {
    this.courses = courses;
  }

  public int getMoney()
  {
    return money;
  }

  public void setMoney(int money)
  {
    this.money = money;
  }

  @Override
  public String toString()
  {
    String str = "\n";
    str += "First: " + first + "\n";
    str += "Last: " + last + "\n";
    str += "Id: " + id + "\n";
    str += "Age: " + age + "\n";
    str += "City: " + city + "\n";
    str += "Money: " + money + "\n";
    str += "COURSES: " + "\n";
    for(int index = 0; index < courses.size(); index++)
      str += courses.get(index);
    return str;
  }

  // COMPARATORS !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
  public static final Comparator<Student> FIRST_NAME_ORDER = new Comparator<Student>()
  {
    public int compare(Student e1, Student e2)
    {
      return e1.getFirst().compareTo(e2.getFirst());
    }
  };

  public static final Comparator<Student> LAST_NAME_ORDER = new Comparator<Student>()
  {
    public int compare(Student e1, Student e2)
    {
      return e1.getLast().compareTo(e2.getLast());
    }
  };

  public static final Comparator<Student> ID_ASCEND_ORDER = new Comparator<Student>()
  {
    public int compare(Student e1, Student e2)
    {
      if (e1.getId() < e2.getId())
        return +1;
      else if (e1.getId() > e2.getId())
        return -1;
      else
        return 0;
    }
  };

  public static final Comparator<Student> AGE_DESCEND_ORDER = new Comparator<Student>()
  {
    public int compare(Student e1, Student e2)
    {
      if (e1.getAge() > e2.getAge())
        return -1;
      else if (e1.getAge() < e2.getAge())
        return +1;
      else
        return 0;
    }
  };

  public static final Comparator<Student> DEBT_DESCEND_ORDER = new Comparator<Student>()
  {
    public int compare(Student student1, Student student2)
    {
      int money_paid1 = student1.getMoney();
      int money_paid2 = student2.getMoney();
      
      int tuition1 = 0;
      int tuition2 = 0;
      
      for(Course course: student1.getCourses())
      {
         tuition1 += course.getPrice();
      }
      
      for(Course course: student2.getCourses())
      {
         tuition1 += course.getPrice();
      }
      
      int debt1 = tuition1 - money_paid1;
      int debt2 = tuition2 - money_paid2;
      
      if (debt1 < debt2)
        return -1;
      else if (debt1 > debt2)
        return +1;
      else
        return 0;
      
    }
  };

}
