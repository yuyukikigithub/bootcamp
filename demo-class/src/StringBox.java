import java.util.Arrays;

public class StringBox
 {

    private char[] characters; // object reference type


    public StringBox (String str){
        // this.characters = characters.toCharArray();

        // char[] newArr = new char[str.length()]; 
        // for (int i = 0; i < str.length(); i++) {
        //     newArr[i] = str.charAt(i);
        // }
        // this.characters = newArr;

        // for (int i = 0; i < str.length(); i++) {
        //     characters[i]=str.charAt(i);
        // }

        this.characters = new char[str.length()]; 
        for (int i = 0; i < str.length(); i++) {
            this.characters[i] = str.charAt(i);
        }
    }

    @Override
    public String toString(){
        return String.valueOf(this.characters);
    }

    // public String concat(String str){
        
    //     char[] newArr = new char[this.characters.length+str.length()];
    //     for (int i = 0; i < this.characters.length; i++) {
    //         newArr[i]= this.characters[i];
    //     }
    //     for (int i = this.characters.length; i < newArr.length; i++) {
    //         newArr[i]=str.charAt(i-this.characters.length);
    //     }
        
    //     return String.valueOf(newArr);
    // }

    public StringBox concat(String str){

        int idx=0;
        char[] newArr = new char[this.characters.length+str.length()];
        for (int i = 0; i < this.characters.length; i++) {
            newArr[idx++]= this.characters[i];
        }
        for (int i = this.characters.length; i < newArr.length; i++) {
            newArr[idx++]=str.charAt(i-this.characters.length);
        }
        return new StringBox(String.valueOf(newArr));
    }

    public StringBox concat2(String str){
        int idx=0;
        char[] newArr = new char[this.characters.length+str.length()];
        for (int i = 0; i < this.characters.length; i++) {
            newArr[idx++]= this.characters[i];
        }
        for (int i = this.characters.length; i < newArr.length; i++) {
            newArr[idx++]=str.charAt(i-this.characters.length);
        }
        this.characters=newArr;
        return this;
    }

    public boolean isEmpty() {
        return this.characters.length==0;
    }

    public int length() {
        return this.characters.length;
    }

    public StringBox replace(int idx, String str){
        char[] newArr=new char[this.characters.length+str.length()];
        int index=0;
        for (int i = 0; i < this.characters.length; i++) {
            if (!(i==idx)) {
                newArr[index]=this.characters[i];
                index++;
                continue;
            }
            for (int j = 0; j < str.length(); j++) {
                newArr[index]=str.charAt(j);
                index++;
            }
        }
        this.characters=newArr;
        return this;
    }

    public StringBox(int start, int end, String str){

    }
    
    public static void main(String[] args) {
        StringBox string = new StringBox("hello");
        System.out.println(string.toString());
        System.out.println(string.length());
        System.out.println(string.concat("sfg"));

        String x = new String("hello");
        String y = x.concat("world");// x has not change the address // y is new
        System.out.println(y);//helloworld

        // concat vs concat2

        // string not change, pass by value, not change attribute, all new object
        StringBox string1 = string.concat(" world");
        System.out.println(string1.toString());// hello world
        System.out.println(string.toString()); // hello 

        //string change, pass by reference, change attribute, old object
        StringBox string2 = string.concat2(" buddy");
        System.out.println(string2.toString());// hello buddy
        System.out.println(string.toString());// hello buddy
        System.out.println(string.replace(2, "sdf"));
        System.out.println(Arrays.toString(string.characters));

        String word = "abcd";
        char ch = 'd';
        StringBuilder result=new StringBuilder(word);
        int index = -1;
        for (int i = 0; i < word.length(); i++) {
            if (ch==word.charAt(i)) {
                index=i;
                break;
            }
        }
        result.setCharAt(index, ch);
        
        System.out.println(result);
        
    }

    
}
