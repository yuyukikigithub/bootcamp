public enum Gender {
    MALE('M'),
    FEMALE('F')
    ;
    private char gender;
    private Gender(char gender){
        this.gender=gender;
    }
    public char getGender(){
        return this.gender;
    }
    public static Gender fromGender(char gender){
        for (Gender element : Gender.values()) {
            if (element.gender==gender) {
                return element;
            }
        }
        return null;
    }
    // @Override
    // public String toString(){
    //     return "Gender("+this.gender+")";
    // }
    public static void main(String[] args) {
        System.out.println(Gender.FEMALE.getGender());
    }
}
