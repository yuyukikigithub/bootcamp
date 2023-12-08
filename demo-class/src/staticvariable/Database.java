package staticvariable;

import java.util.Arrays;

public class Database {
    private static String[] strings = new String[0]; // in class, as class data

    // no static, no final -> instance variable
    // static
    // final -> instance variable
    // static final

    // instance (final vs no-final)
    // int number; -> setter
    // final int number=3; -> no setter

    // final vs static final
    // 'final' is still instance variable, the object can be called by 'this'
    // 'static final' is constant
    
    private final int hourPerDay = 24;// as constant instance variable, cannot be changed
    private static final int minPerHour = 60; // as constant, in class, as class data, cannot be changed
    
    public static void add(String str) { // static method
        String[] strArr = Arrays.copyOf(Database.strings, Database.strings.length + 1);
        strArr[Database.strings.length] = str;
        Database.strings = strArr;

    }

    public static boolean isValidIndex(int idx) {
        return (idx >= 0 && idx < strings.length);
    }

    public static boolean remove(int idx) { // static method
        if (isValidIndex(idx)) {
            String[] delArr = new String[Database.strings.length - 1];
            int index = 0;
            for (int i = 0; i < strings.length; i++) {
                if (idx == i)
                    continue;
                delArr[index++] = strings[i];
            }
            strings = delArr;
            return true;
        }
        return false;
    }

    public boolean removeInstance(int idx) { // instance method
        if (isValidIndex(idx)) {
            String[] delArr = new String[Database.strings.length - 1];
            int index = 0;
            for (int i = 0; i < strings.length; i++) {
                if (idx == i)
                    continue;
                delArr[index++] = strings[i];

            }
            strings = delArr;
            return true;
        }
        return false;
    }

    public static String get(int idx) {
        if (isValidIndex(idx)) {
            return strings[idx];
        }
        return null;
    }

    public String read(int idx) {
        return Database.strings[idx];
    }

    public static String[] getAllStrings() {
        return strings;
    }

    public static void main(String[] args) {
        // we need not create object to operate static variable
        Database db1 = new Database(); // XXXXXX
        // db1.add("first");// add should be called in static way, so class should be
        // used directly
        Database.add("first");
        Database.add("second");
        Database.add("third");
        System.out.println(Arrays.toString(Database.getAllStrings()));
        // the static attribute 'strings' in all object of this class is amended by
        // static method
        Database.remove(1); // static method can amend static attribute
        // db1.removeInstance(1);// instance method can amend static attribute too
        System.out.println(Database.get(1));
        System.out.println(Arrays.toString(Database.getAllStrings()));

    }
}
