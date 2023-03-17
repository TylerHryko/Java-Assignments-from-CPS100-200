package yamldata;

import java.util.*;

public class Library
{
  private Date date;
  private ArrayList<Student> students;

  public Library()
  {
    date = null;
    students = null;
  }
  public Date getDate()
  {
    return date;
  }

  public void setDate(Date date)
  {
    this.date = date;
  }

  public ArrayList<Student> getStudents()
  {
    return students;
  }

  public void setStudents(ArrayList<Student> students)
  {
    this.students = students;
  }

  public String toString()
  {
    String str = "";
    str += "DATE: " + date + "\n";

    for (int index = 0; index < students.size(); index++)
    {
      str += students.get(index);
    }
    return str;
  }
}
