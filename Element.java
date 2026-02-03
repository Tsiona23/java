/*create an abstruct class named Element that holds properties of elements, 
including their symbol, atomic number , and atomic weight , include a constructor
that requires values for all three properties and a get method for each values. also include an abstruct method name nmed describElement() 
*/
public abstract class Element {
    private String symbol;
    private int atomicnumber;
    private double atomicweight;

    public Element(String symbol, int atomicnumber, double atomicweight) {
        this.symbol = symbol;
        this.atomicnumber = atomicnumber;
        this.atomicweight = atomicweight;
    }

    public String getsymbol() {
        return symbol;
    }

    public int getatomicnumber() {
        return atomicnumber;
    }

    public double getatomicweight() {
        return atomicweight;
    }

    public abstract void describeElement();
}

/*
 * create two extended sub classes
 * named MetalElement and NonMetalElement . each contains a describeElement()
 * method that displays the details of the element and
 * a brief explanation of the properties of the element type.
 * write an application named elementArray that creates and displays an array
 * that holds atleaset two elements of each type
 */
class MetalElement extends Element {
    public MetalElement(String symbol, int atomicnumber, double atomicweight) {
        super(symbol, atomicnumber, atomicweight);
    }

    @Override
    public void describeElement() {
        System.out.println("Metal element");
        System.out.println("symbol: " + getsymbol());
        System.out.println("atomic number: " + getatomicnumber());
        System.out.println("atomic weight: " + getatomicweight());
        System.out.println();
    }
}

class NonMetalElement extends Element {
    public NonMetalElement(String symbol, int atomicnumber, double atomicweight) {
        super(symbol, atomicnumber, atomicweight);
    }

    @Override
    public void describeElement() {
        System.out.println("Non-metal element");
        System.out.println("symbol: " + getsymbol());
        System.out.println("atomic number: " + getatomicnumber());
        System.out.println("atomic weight: " + getatomicweight());
        System.out.println();
    }
}

class elementArray {
    public static void main(String[] args) {
        Element[] elements = new Element[3];
        elements[0] = new MetalElement("Fe", 26, 55.85);
        elements[1] = new MetalElement("Au", 79, 196.97);
        elements[2] = new NonMetalElement("O", 8, 16.00);

        for (Element e : elements) {
            e.describeElement();
        }
    }
}
