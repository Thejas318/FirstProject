package Practice.November2022.DateNov29;

public abstract class SubServiceProvider extends ServiceProvider{

    //If the implementing class is not overriding all the methods in interface. we can solve the error by making the class abstract.
    // like what serviceprovider class has done here.
    // but when we extend that class [service provider]. it is responsibility of the child class [subservice provider] to override the methods present in the interface.
    // well anyways the this child class can be made abstract and this provlem is solved without overriding like done above.
}
