public class person {
    private String SchoolName ="Bingham University";
    private String name;

    private String password;

    private String MatricNo;

    private int StaffNo;

    public person(String schoolName, String name, String password, int staffNo) {
        SchoolName = schoolName;
        this.name = name;
        this.password = password;
        StaffNo = staffNo;
    }
    person(){
        System.out.println("objected Created");
    }

    public person(String schoolName, String name, String password, String matricNo) {
        SchoolName = "Bingham";
        this.name = name;
        this.password = password;
        MatricNo = matricNo;
    }




    String getName(){
        return name;
    }
    void setName(String name){
        this.name =name;
    }
    String getPassword(){
        return password;
    }
    void setPassword(String password){
        this.password=password;
    }
}
