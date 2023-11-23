public class DemoSwitch {
    public static void main(String[] args) {
        // if, else if , comparison/  logical operator
        // switch, single value comparison (==)
        char grade = 'D';
        switch (grade) {
            case 'A':
                System.out.println("You are A");
                break;
            case 'B':
                System.out.println("You are B");
                break;
            case 'C':
                System.out.println("You are C");
                break;
            case 'D':
                System.out.println("You are D");
                break;
            case 'E':
                System.out.println("You are E");
                break;
            default:
                break;
            
        }

        char vipGrade = 'S';
        double discount = 0.0d;
        switch (vipGrade) {
            case 'G':
                discount+=0.1d;
                // break;
            case 'S':
                discount+=0.1d;
                // break;
            case 'N':
                discount+=0.1d;
            //     break;
            // default:
            //     break;
        }
        System.out.println("vip1 ("+vipGrade+") Discount = "+discount);

        char vipGrade1 = 'C';
        double discount1 = 0.0d;
        switch (vipGrade1) {
            case 'G':
                discount1+=0.3d;
                break;
            case 'S':
                discount1+=0.2d;
                break;
            case 'C':
                discount1+=0.1d;
                break;
            case 'N':
                discount1+=0.05d;
                break;
            default:
                break;
        }
        System.out.println("vip2 ("+vipGrade1+") Discount = "+discount1);
        char vipGrade2 = 'A';
        switch (vipGrade2) {
            case 'A':
                System.out.println("You are execellent");
                break;
            case 'B':
                
        
            default:
                break;
        }
    }
}
