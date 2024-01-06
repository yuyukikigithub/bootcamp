public record CatRecord(String name, int age, EyeRecord eye) {
    public void eat(){
        System.out.println(this.name);
    }
}
