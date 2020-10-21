package niit.soft.beans;


public class SeriesBean {
    private  double firstItem;//首项
    private double var;//公差或公比
    private int num;//项数
    private double sum;//求和结果
    private String name;//数列类型

    public double getFirstItem() {
        return firstItem;
    }

    public void setFirstItem(double firstItem) {
        this.firstItem = firstItem;
    }

    public double getVar() {
        return var;
    }

    public void setVar(double var) {
        this.var = var;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
