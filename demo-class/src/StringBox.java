import java.util.Arrays;

public class StringBox
 {

    private char[] characters;


    public StringBox (String characters){
        // this.characters = characters.toCharArray();
        char[] newArr = new char[characters.length()]; 
        for (int i = 0; i < characters.length(); i++) {
            newArr[i] = characters.charAt(i);
        }
        this.characters = newArr;
    }

    public char[] append(String str){
        
        char[] newArr = new char[this.characters.length+str.length()];
        for (int i = 0; i < this.characters.length; i++) {
            newArr[i]= this.characters[i];
        }
        for (int i = this.characters.length; i < newArr.length; i++) {
            newArr[i]=str.charAt(i-this.characters.length);
        }
        
        return newArr;
    }
    public static void main(String[] args) {
        StringBox string = new StringBox("hello");
        System.out.println(string.append("sfg"));
    }
}
