public class CrewMember extends Person {
//private int age;
private FlightCrewJob job;
private float salary;

    public FlightCrewJob getJob() {
        return job;
    }

    public void setJob(FlightCrewJob job) {
        this.job = job;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public CrewMember(String name) {
        super(name);
    }//Constructor ends here




}//end of class
