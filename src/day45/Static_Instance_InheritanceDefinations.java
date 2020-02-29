package day45;

public class Static_Instance_InheritanceDefinations {
    //Static method: it has only one copy for each and every object get from this template,
        //if the value change, everyone get affected. we do not need object to call static field
            //classname.staticmember

    //Instance field: each object get their own value and changing one object`s field value does not affect
      //other object

    //INTERVIEW QUESTIONS: what can we access in static method: only static members(method, fields). because you do not need to object to call only by class name so that is the only thing you can access
                            //what can we access in instance method: everything
                     // what can we access in constructor: everyting

    //INHERITANCE: using the existing field of existing class. you just extends the class.
            //how many class you can inherited from: YOU CAN ONLY INHERITANCE 1 CLASS(1 super class)

    //Differnce PROTECTED AND DEFAULT: default in same package, protected on top of default.same packed but
                                            //you can also access with sub classes in different package.
    //PROTECTED is accessible subclasses outside the package, but default not

    //You can not inherit constructor
}
