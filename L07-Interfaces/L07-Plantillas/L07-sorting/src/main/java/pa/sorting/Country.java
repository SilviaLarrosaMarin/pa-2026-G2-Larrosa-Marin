package pa.sorting;


public class Country implements IOrdenable {
    private String name;

    public Country(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }   
    
    @Override
    public boolean menorQue(IOrdenable o) {
    	Country pais = (Country) o;
    	return name.compareTo(pais.name) < 0;
    }
    
    public String toString() {
    	return name;
    }
}
