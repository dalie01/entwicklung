package dalieOCP.object.relationship.is_A;

class A {}
class B extends A {} //B is-A A

interface I {}
class B1 implements I{} //B1 is-A I

interface I1 {}
interface I2 extends I1 {} //I2 is-A I1


class Execute {

}
