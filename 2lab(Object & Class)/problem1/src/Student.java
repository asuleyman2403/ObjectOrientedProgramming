public class Student {
    String name;
    int id;
    int year_of_study;
    Student(String name,int id,int year_of_study)
    {
        this.name = name;
        this.id = id;
        this.year_of_study = year_of_study;
    }
    Student()
    {
        name = "name";
        id = 0;
        year_of_study = 0;
    }
    public void show()
    {
        System.out.println(id+" "+name+" "+year_of_study);
    }
}

