public class Teacher extends Employee implements Comparable<Teacher>{

    protected String major;


    public Teacher(int no, String name, String major) {
        super(no, name);
        this.major = major;
    }

    public void teach(){
        System.out.println("Teacher is teaching.");
    }

    public String getMajor() {
        return major;
    }

    @Override
    public void work() {
        teach();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + no;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Teacher other = (Teacher) obj;
        if (no != other.no)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                '}';
    }

    @Override
    public int compareTo(Teacher t) {
        int result = 0;
        if (no < t.no)
            result = -1;
        else if (no > t.no)
            result = 1;

        return result;
    }
}
