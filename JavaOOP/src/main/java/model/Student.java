package model;

public class Student {
    //学生姓名，年龄，性别，学号
     public String  name;
    public Integer age;
    public  char  gender;
    public String  id;

  public Student(String name,Integer age,char  gender,String  id){
      this.name = name;
      this.age = age;
      this.gender = gender;
      this.id = id;
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
