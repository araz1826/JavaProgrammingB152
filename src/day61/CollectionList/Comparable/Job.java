package day61.CollectionList.Comparable;

public class Job implements Comparable<Job> {// add comparable to sort in main method

    private String location;
    private double salary;
    private String companyName;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Job(String location, double salary, String companyName) {
        this.location = location;
        this.salary = salary;
        this.companyName = companyName;

    }

    @Override
    public String toString() {
        return "Job{" +
                "location='" + location + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    @Override  // you will fill inside
    public int compareTo(Job other) { // this is how u compare this job to other
        if(this.salary>other.salary){
            return 1;
        }else if(this.salary<other.salary){
            return -1;
        }else {
            return 0;
        }

    }
}
