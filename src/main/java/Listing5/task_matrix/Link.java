package Listing5.task_matrix;

public class Link {
    private Link down;
    private Link right;
    double aDouble;

    public Link(double aDouble) {
        this.aDouble = aDouble;
    }

    public Link getDown() {
        return down;
    }

    public void setDown(Link down) {
        this.down = down;
    }

    public Link getRight() {
        return right;
    }

    public double getaDouble() {
        return aDouble;
    }

    public void setRight(Link right) {
        this.right = right;
    }
    @Override
    public String toString() {
        if (getDown() == null && getRight() != null)
            return "dData = " + aDouble + " Right link = " + getRight().getaDouble() + " Down link = 0" ;
        else if (getRight() == null && getDown() != null)
           return "dData = " + aDouble + " Right link = 0" + " Down link = " + getDown().getaDouble();
        else if (getDown() != null && getRight() != null)
            return "dData = " + aDouble + " Right link = " + getRight().getaDouble() + " Down link = " + getDown().getaDouble();
        else return "dData = " + aDouble;
    }
}
