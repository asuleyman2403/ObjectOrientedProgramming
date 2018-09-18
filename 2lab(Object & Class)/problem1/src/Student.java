public class Student {
    private String name;
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
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void getID()
    {
        System.out.println(id);
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public void getyear()
    {
        System.out.println(year_of_study);
    }
    public void setYear(int year)
    {
        year_of_study = year;
    }
}

