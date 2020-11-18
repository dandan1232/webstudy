package jdbcDemo.bean;

/**
 * @author admin
 * @date 2020/11/11 10:43
 * @description Emp
 * setter、getter方法
 * 无参构造方法、全参构造方法，除id之外的三个构造方法
 * toString方法
 */

public class Emp {
    private int id;
    private String name;
    private String job;
    private  double sal;

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }

    public Emp(int id, String name, String job, double sal) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    public Emp() {
    }

    public Emp(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

}
