public class DemoIf {
    public static void main(String[] args) throws Exception {
        double salary = 15000.00d;

        if (salary > 14000) {
            System.out.println("salary > 14000");
        } 
        if (salary >= 15000) {
            System.out.println("salary >= 15000");
        } 
        if (salary >= 17000) {
            System.out.println("salary >= 17000");
        } 
        if (salary <= 15000) {
            System.out.println("salary <= 15000");
        }
        // (if) vs (else if) 
        // if, else if same condition, run first condition
        char grade = 'A';
        if (grade == 'A') {
            System.out.println("grade=A");
        } else if (grade == 'A') {
            System.out.println("grade=B");
        } else if (grade == 'A') {
            System.out.println("grade=C");
        } else if (grade == 'D') {
            System.out.println("grade=D");
        } else if (grade == 'E') {
            System.out.println("grade=E");
        } else {
            System.out.println("Failed");
        }
        // String grade1 = "A";
        // if (grade1 == "A") {
        //     System.out.println("grade1=A");
        // } else if (grade1 == "A") {
        //     System.out.println("grade1=B");
        // } else if (grade1 == "A") {
        //     System.out.println("grade1=C");
        // } else if (grade1 == "D") {
        //     System.out.println("grade1=D");
        // } else if (grade1 == "E") {
        //     System.out.println("grade1=E");
        // } else {
        //     System.out.println("Failed");
        // }

        switch (grade) {
            case 'A':
                System.out.println("Well Done");
                break;
            case 'B':
                System.out.println("Very good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Fair enough");
                break;
            case 'E':
                System.out.println("Add oil next time");
                break;
            default:
                System.out.println("You should retake the exam");
                break;
        }

        System.out.println("Below is grade of Gordon:");

        int score = 93;
        char gradeOfScore = 'A';
        // each case is no overlapping , with upper/ lower limit
        // high readability, but need to precisely define the range
        if (score >=90 && score<=100){
            gradeOfScore = 'A';
        }else if (score >=80 && score<90){
            gradeOfScore = 'B';
        }else if (score >=70 && score<80){
            gradeOfScore = 'C';
        }else if (score >=60 && score <70){
            gradeOfScore = 'D';
        }else if (score >=50 && score <60){
            gradeOfScore = 'E';
        }else {
            gradeOfScore = 'F';
        }
        System.out.println("Grade of score is "+gradeOfScore);

        System.out.println("Below is grade of Mordon:");

        double score1 = 69;
        double score2 = 59;
        double finalScore = 0d;
        // char gradeOfScore1 = 'A';
        // char gradeOfScore2 = 'A';
        char finalGrade = 'A';
        // run row from up to down, need to define the most narrow range
        // if (score1 >=90){
        //     gradeOfScore1 = 'A';
        // }else if (score1 >=80){
        //     gradeOfScore1 = 'B';
        // }else if (score1 >=70){
        //     gradeOfScore1 = 'C';
        // }else if (score1 >=60){
        //     gradeOfScore1 = 'D';
        // }else if (score1 >=50){
        //     gradeOfScore1 = 'E';
        // }else {
        //     gradeOfScore1 = 'F';
        // }

        // if (score2 >=90){
        //     gradeOfScore2 = 'A';
        // }else if (score2 >=80){
        //     gradeOfScore2 = 'B';
        // }else if (score2 >=70){
        //     gradeOfScore2 = 'C';
        // }else if (score2 >=60){
        //     gradeOfScore2 = 'D';
        // }else if (score2 >=50){
        //     gradeOfScore2 = 'E';
        // }else {
        //     gradeOfScore2 = 'F';
        // }
        // the most narrow condition is written first
        //XXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        // if (score1 >=50){
        //     gradeOfScore1 = 'E';
        // }else if (score1 >60){
        //     gradeOfScore1 = 'D';
        // }else if (score1 >70){
        //     gradeOfScore1 = 'C';
        // }else if (score1 >80){
        //     gradeOfScore1 = 'B';
        // }else if (score1 >90){
        //     gradeOfScore1 = 'A';
        // }else {
        //     gradeOfScore1 = 'F';
        // }

        
        if (score1<50||score2<50){
        // if (gradeOfScore1=='F'||gradeOfScore2=='F'){
            finalGrade = 'F';
        } else {
            finalScore = (score1+score2)/2;
            if (finalScore >=90){
                finalGrade = 'A';
            }else if (finalScore >=80){
                finalGrade = 'B';
            }else if (finalScore >=70){
                finalGrade = 'C';
            }else if (finalScore >=60){
                finalGrade = 'D';
            }else if (finalScore >=50){
                finalGrade = 'E';
            }else {
                finalGrade = 'F';
            }
        }


        System.out.println("Final grade of score is "+finalGrade+" and final score is "+finalScore+".");

    }
}
