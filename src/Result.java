public class Result implements Comparable<Result> {
    private String firstName;
    private String lastName;
    private int points;

    public Result(String firstName, String lastName, int points) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.points = points;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firsName) {
        this.firstName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(Result o) {
        if (this.points > o.points) {
            return -1;
        } else if (this.points == o.points) {
            return this.lastName.compareTo(o.lastName);
        } else
            return 1;
    }

    @Override
    public String toString() {
        return firstName + ";" + lastName + ";" + points;
    }
}
