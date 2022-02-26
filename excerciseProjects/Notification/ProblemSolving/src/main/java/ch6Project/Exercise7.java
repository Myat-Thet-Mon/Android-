package ch6Project;

import java.util.Scanner;

enum LetterGrade {
    A(true),
    B(true),
    C(true),
    D(false),
    E(false),
    F(false);

    private boolean isPass;

    LetterGrade(boolean isPass){
        this.isPass = isPass;
    }

    public boolean isPassing(){
        return isPass;
    }


}

public class Exercise7 {
    public static void main(String[] args) {
       LetterGrade tmp = LetterGrade.A;
       System.out.println("Testing A is passing " +tmp.isPassing());
       tmp=LetterGrade.D;
        System.out.println("Testing D is passing "+tmp.isPassing());
       // Grade grade=n
   // GradeMethod gradeMethod=new GradeMethod()
    }
}
