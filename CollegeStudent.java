public class CollegeStudent extends Student {

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {

        if (degree.equals("12") || degree.equals("13") || degree.equals("14")) {
            this.degree = degree;
        } else {
            System.out.println("Invalid degree. Please enter 12, 13, or 14.");
        }
        System.out.println("Degree set to: " + this.degree);

    }

    private  String degree;

    //test
    //write a method to return the degree of the student
     int getDegreeInt() {
        return Integer.parseInt(degree);}
    //write a method to return the degree of the student as a string


    @Override
    public String toString() {
        return "CollegeStudent{" +
                "degree='" + degree + '\n' +
                '}';
    }
}
