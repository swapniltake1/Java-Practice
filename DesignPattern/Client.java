package DesignPattern;

public class Client {

    public static void main(String[] args)
    {
       Calculator ob = FactoryD.getFactor("+");       // here calcultaor is datatype of getfactor method. we are passing "+" symbol in this method. 
       
       System.out.println(ob.getClass());   //this method are used for getmethod and classname which methods obj are exicuting. 
       
       String r = ob.services(15, 12);   // we are passing two parameters in services method which are defined in interface. and implemented by all 4 classes.
       
       System.out.println(r);    /// here we are printing r value which are comes from upper statement or ine number 11.
    }
}