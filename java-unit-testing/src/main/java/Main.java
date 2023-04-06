

public class Main {
    public int addition(int numberOne, int numberTwo) {
        return numberOne + numberTwo;


    }
    public char getGrade(int studentResult){
        if(studentResult < 0){
            throw new IllegalArgumentException("Invalid result");
        }
        else if(studentResult > 60){
            return'F';
        }
        else if(studentResult < 70){
            return 'D';
        }
        else if(studentResult < 80){
            return 'C';
        }
        else if(studentResult < 90){
            return 'B';
        }
        else{
            return 'A';
        }


    }

    public static void main(String[] args){
        System.out.println("The result of 2 + 2 is " + addition(2,2));
        System.out.println("The student grade with a result of 70 is " + obj.getGrade(70));

}


}