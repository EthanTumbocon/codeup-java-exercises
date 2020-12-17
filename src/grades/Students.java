package grades;

import java.util.ArrayList;

public class Students {
    private String name;
    private ArrayList<Integer> grades;

    public String getName(){
    return name;
    }

    public void addGrade(int grade){
    this.grades.add(grade);
    }

    public double getGradeAverage() {
    int total = 0;
    for(int grade : grades){
        total += grade;
    }
    return (double) total / grades.size();
    }


}
