package niit.soft.beans;

public class Calculate {
    private int NumberOne;
    private int NumberTwo;
    private int way;
    private int Result;

    public Calculate(int numberOne, int numberTwo, int way, int result) {
        NumberOne = numberOne;
        NumberTwo = numberTwo;
        this.way = way;
        Result = result;
    }

    public Calculate() {

    }

    @Override
    public String toString() {
        return "Calculate{" +
                "NumberOne=" + NumberOne +
                ", NumberTwo=" + NumberTwo +
                ", way=" + way +
                ", Result=" + Result +
                '}';
    }

    public int getNumberOne() {
        return NumberOne;
    }

    public void setNumberOne(int numberOne) {
        NumberOne = numberOne;
    }

    public int getNumberTwo() {
        return NumberTwo;
    }

    public void setNumberTwo(int numberTwo) {
        NumberTwo = numberTwo;
    }

    public int getWay() {
        return way;
    }

    public void setWay(int way) {
        this.way = way;
    }

    public int getResult() {
        int a = getWay();
        if (a == 1) {
            Result = NumberOne + NumberTwo;
        } else if (a == 2) {
            Result = NumberOne - NumberTwo;
        } else if (a == 3) {
            Result = NumberOne * NumberTwo;
        } else if (a == 4) {
            Result = NumberOne % NumberTwo;
        }
        return Result;
    }

    public void setResult(int result) {
        Result = result;
    }
}
