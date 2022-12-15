package Day39_OOP_Recap.ShapeTask;

public class Shape {
    private String name;

    public String getName() {
        return name;
    } // public access modifier they have;

    public void setName(String name) {
        if (name == null) {
            System.err.println(" Name cannot be null!");
            System.exit(1);//terminate the program and the value 1 shows something went wrong;
        }
        if (name.isEmpty() || name.isBlank()) {
            System.err.println("Invalid Name");
            System.exit(1);
        }
        this.name = name;
    }

    public Shape(String name) {
        setName(name);
    }

    public double area() {
        return 0; // we don't know the shape at this stage exactly;
    }

    public double perimeter() {
        return 0;
    }


}
/*
Shape:
	variables:
			name

	Encapsulate the field

	Add a constructor to set the filed

	Methods:
		area(){}
		perimeter(){}
 */
