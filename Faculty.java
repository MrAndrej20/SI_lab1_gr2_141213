import java.util.ArrayList;

class Faculty {
    String name;
    ArrayList<Student> students;

    Faculty(String name) {
        this.name = name;
        this.students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void deleteStudent(Student student) {
        this.students.remove(student);
    }

    public double averageStudentGrade() {
        double gradeSum = 0;
        int gradeCount = 0;
        for (int i = 0; i < this.students.size(); i++) {
            Student student = this.students.get(i);
            double[] studentGrades = student.getGrades();
            for (int j = 0; j < studentGrades.length; j++) {
                gradeCount++;
                gradeSum += studentGrades[j];
            }
        }
        return gradeSum / gradeCount;
    }

    public double averageStudentECTSCredits() {
        double creditsSum = 0;
        for (int i = 0; i < this.students.size(); i++) {
            Student student = this.students.get(i);
            creditsSum += student.ECTSCredits();
        }
        return creditsSum / this.students.size();
    }
}