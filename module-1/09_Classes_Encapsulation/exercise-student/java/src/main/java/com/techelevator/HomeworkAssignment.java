package com.techelevator;

public class HomeworkAssignment {
    private int combinedPointTotal;
    private int possiblePointTotal;
    private String studentName;

    public String getLetterGrade() {
        if (( combinedPointTotal / possiblePointTotal ) * 100 >=90){
            return "A";
        } else if ((combinedPointTotal / possiblePointTotal) * 100 >= 80) {
             return "B";
        }else if ((combinedPointTotal / possiblePointTotal) * 100 >= 70) {
            return "C";
        }else if ((combinedPointTotal / possiblePointTotal) * 100 >= 60) {
            return "D";
        }else {
            return "F";
        }
        public HomeworkAssignment (int possiblePointTotal) {
            this.possiblePointTotal = possiblePointTotal;
        }
        public int getCombinedPointTotal() {
            return combinedPointTotal;
        }
        public void setCombinedPointTotal(int combinedPointTotal) {
            this.combinedPointTotal = combinedPointTotal;
        }
        public String getStudentName(){
            return studentName;
        }
        public void setStudentName(){
            this.studentName = studentName;
        }
        public int getPossiblePointTotal(){
            return possiblePointTotal;
        }


}
