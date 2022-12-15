public class Student {
    private String name;
    private int points = 0;
    private static int totalPointsEarned = 0;
    private static int greatestPoints = 0;

    public Student (String name) {
        this.name = name;
    }

    public void addPoints(int points) {
        this.points+=points;
        totalPointsEarned+=points;
        if (this.points>greatestPoints) {
            greatestPoints = this.points;
        }
    }

    public String studentInfo() {
        return "Student: " + name + "\nPoints: " + points;
     }

     public static int getTotalPointsEarned() {
        return totalPointsEarned;
     }

     public static int getGreatestPoints() {
        return greatestPoints;
     }
}
