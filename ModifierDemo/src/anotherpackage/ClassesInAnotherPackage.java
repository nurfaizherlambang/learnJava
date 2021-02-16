package anotherpackage;

import modifierdemo.ModifierDemo;

public class ClassesInAnotherPackage {
    
}

class MyClassC extends ModifierDemo {
    public void printMessages() {
        //This is ok
        System.out.println(publicNum);
        //This is ok
        System.out.println(protectedNum);
        //This is NOT ok
        System.out.println(packagePrivateNum);
        //This is NOT ok
        System.out.println(privateNum);
    }
}

class MyClassD {
    public void printMessages() {
        ModifierDemo p = new ModifierDemo();
        //This is ok
        System.out.println(p.publicNum);
        //This is NOT ok
        System.out.println(p.protectedNum);
        //This is NOT ok
        System.out.println(p.packagePrivateNum);
        //This is NOT ok
        System.out.println(p.privateNum);
    }
}
