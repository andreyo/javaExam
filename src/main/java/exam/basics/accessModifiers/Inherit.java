package exam.basics.accessModifiers;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 08.12.12
 * Time: 12:10
 * To change this template use File | Settings | File Templates.
 */

/*

Given the code below, and making no other changes, which access modifiers
(public, protected or private) can legally be placed before myMethod() on line 3?
If line 3 is left as it is, which keywords can legally be placed before myMethod
on line 8?

 */

class HumptyDumpty {
    void myMethod() {
    }
}

class HankyPanky extends HumptyDumpty {
    void myMethod() {
    }
}