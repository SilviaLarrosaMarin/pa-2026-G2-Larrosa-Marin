package pa.sorting;


public class Grade implements IOrdenable {
    private double value;

    public Grade(double grade) {
        value = grade;
    }
    
    public double getValue() {
        return value;
    }
    
    @Override
    public boolean menorQue(IOrdenable o) {
    	Grade g = (Grade) o;
    	return value < g.value;
    }
    
    public String toString() {
    	return String.valueOf(value);
    }
}
