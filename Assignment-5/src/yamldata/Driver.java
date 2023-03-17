package yamldata;

//import java.io.*;
import java.util.*;


//import com.esotericsoftware.yamlbeans.*;


public class Driver
{

  public static void main(String[] args)
  {
    //String filename = "in10.yaml";
    //String filename = "in1000.yaml";
    String filename = "in10000.yaml";
    //String filename = "in100000.yaml";
    Utils util = new Utils(filename);
    //List<Student> studList = util.getAllStudentList();
    //util.showStudentList(studList);
    //*******************************
//    final int MAX = 10;
//    List<Student> cityList = util.studentsFromCity("Comox");
//    //util.showStudentList(cityList);
//    List<Student> listByDebt = util.getStudentsSortedByDebt(cityList);
//    //util.showStudentList(listByDebt);
//    listByDebt = util.getListUpToMax(listByDebt, MAX);
//    util.showStudentList(listByDebt);
    // util.showStudentList(util.getTop10DebtersFromCity("Comox"));
    List<Student> debtList = util.getTop10DebtersFromCity("Comox");
    util.showStudentList(debtList);
    debtList = util.getTop10DebtersFromCity("Courtenay");
    util.showStudentList(debtList);
    debtList = util.getTop10DebtersFromCity("Campbell River");
    util.showStudentList(debtList);
    //*******************************
    List<String> myCityList = util.getAllCityNames();
    System.out.println(myCityList);
    //*******************************
    // Create a Set of Last Names
    //util.distinctLastNames(filename);

  }
}
