package pl.edu.wszib.lab1.mypackage;

import pl.edu.wszib.lab1.myabstract.MyAbstractClass;

public class MySecondClass extends MyAbstractClass {

    private String firstField;
    String firstField2;

    // modyfikatory dostępu:
    //  private
    //
    //  protected
    //  public

    public void run() {
        System.out.println("firstField = " + firstField);
        System.out.println("firstField2 = " + firstField2);
        myProtectedField = "my protected field";
        myProtected();
    }

    @Override
    protected void myAbstract() {

    }
}
