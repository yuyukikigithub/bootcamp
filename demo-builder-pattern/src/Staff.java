public class Staff {
    private String name;
    private String yearOfExp;

    public Staff (){

    }
    public static Staff builder(){
        return new Staff();
    }

    private Staff (String name, String yearOfExp){
        this.name=name;
        this.yearOfExp=yearOfExp;
    }

    public Staff name (String name){
        this.name=name;
        return this;
    }
    public Staff yearOfExp( String yearOfExp ){
        this.yearOfExp=yearOfExp;
        return this;
    }
    public void setName (String name){
        this.name=name;
        
    }
    public void setYearOfExp( String yearOfExp ){
        this.yearOfExp=yearOfExp;
    }
    public static void main(String[] args) {
        Staff staff= Staff.builder().name("skudh").yearOfExp("isubdiuf");
        staff.name="skbf"; // can change
        System.out.println(staff.name);
    }
}
