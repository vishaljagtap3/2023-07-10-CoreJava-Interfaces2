public class Emp {
    private int id;
    private String name;
    protected int sal;

    public Emp(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
}


class EmpComparator implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2) {
        Emp e1 = (Emp) obj1;
        Emp e2 = (Emp) obj2;

        if(e1.getId() > e2.getId()) {
            return 1;
        }

        if(e1.getId() < e2.getId()) {
            return -1;
        }

        return 0;
    }
}