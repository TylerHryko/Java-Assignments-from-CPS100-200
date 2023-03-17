package yamldata;
import java.util.*;


public class Utils
{
  Library library;
  List<Student> allStudentList;
  
  public Utils(String filename)
  {
    this.library = Loader.loadLibrary(filename);
    this.allStudentList = library.getStudents();
  }
  
  public List<String> getAllCityNames()
  {
    List<String> cityList = new ArrayList<String>();
    
    Iterator<Student> itStudent = allStudentList.iterator();
    while(itStudent.hasNext())
    {
      Student tmpStudent = itStudent.next();
      String city = tmpStudent.getCity();
      
      if(!cityList.contains(city))
      {
        cityList.add(city);
      }
    }
    Collections.sort(cityList);
    
    return cityList;
  }
  
  public List<Student> getTop10DebtersFromCity(String city)
  {
    final int MAX = 10;
    List<Student> cityList = this.studentsFromCity(city);
    List<Student> listByDebt = this.getStudentsSortedByDebt(cityList);
    listByDebt = this.getListUpToMax(listByDebt, MAX);
    return listByDebt;
  }
  
  public List<Student> getListUpToMax(List<Student> stList, int max)
  {
    int myMax = Math.min(max, stList.size()); 
    
    return stList.subList(0, myMax);
  }
  
  public List<Student> getStudentsSortedByDebt(List<Student> stList)
  {
    Collections.sort(stList, Student.DEBT_DESCEND_ORDER);
    return stList;
  }
  
  public List<Student> studentsFromCity(String city)
  {
    List<Student> tmpList = new LinkedList<Student>();
    for (Student student: allStudentList)
    {
      if (student.getCity().compareTo(city) == 0)
      {
        tmpList.add(student);
      }
    }
    
    return tmpList;
  }
  
  public List<Student> getAllStudentList()
  {
    return allStudentList;
  }
  
  public void showStudentList(List<Student> mylist)
  {
    Iterator<Student> studentIterator = mylist.iterator();
    while(studentIterator.hasNext())
    {
      System.out.println(studentIterator.next());
      System.out.println("=================================");
      System.out.println("=================================");
    }
    
      
  }
  
}
