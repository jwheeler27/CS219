package Discussion;

class A {
    int small = 0;

    static int medium = 45;

    //constructor
    public A()
    {
        System.out.println("We've created an object that uses class A");
    }
    //Accessor
    public int getSmall()
    {
        return this.small;
    }
    //Mutator
    public void setSmall(int x)
    {
        this.small = x;
    }
}

class B extends A {

    private int big = 0;

    //constructor
    public B() {
        //Call class A constructor to construct object B
        super();
        this.big = 100;

        //print out A's medium number by directly accessing the variable
        System.out.println("This is class A's medium number: " + super.medium);

    }

    public int getBig() {
        return this.big;
    }


    public static void main(String[] args)
    {
        //create a new B object which extends class A
        B example = new B();
        //Set small variable, which comes from class A
        example.setSmall(3);

        //Print variables object variables that come from A and B
        System.out.println("This variable comes from class A: " + example.getSmall());
        System.out.println("This variable comes from class B: " + example.getBig());

    }

}