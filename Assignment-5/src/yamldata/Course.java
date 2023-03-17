package yamldata;

public class Course
{
  private String name;
  private String instructor;
  private int price;
  
  public Course()
  {
    name = "";
    instructor = "";
    price = -100;
  }
  
  public Course(String name, String instructor, int price)
  {
    this.name = name;
    this.instructor = instructor;
    this.price = price;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getInstructor()
  {
    return instructor;
  }

  public void setInstructor(String instructor)
  {
    this.instructor = instructor;
  }

  public int getPrice()
  {
    return price;
  }

  public void setPrice(int price)
  {
    this.price = price;
  }


  public String toString()
  {
    String str = "";
    str += "Course Name: " + this.name + "\n"; 
    str += "Instructor: " + this.instructor + "\n"; 
    str += "Course Price: " + this.price + "\n"; 
    
    return str;
  }
}
