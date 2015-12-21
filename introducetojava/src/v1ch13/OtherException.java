package v1ch13;

/**
 * Created by Eric on 12/21/2015.
 */
public class OtherException extends InvalidRadiusException {

    /**
     * Construct an exception
     *
     * @param radius
     */

    // 父类没有无参构造方法

    // 因为OtherException在执行构造方法时,会先调用父类的构造方法,如果不是显式调用父类构造方法,则编译器会自动调用super().
    // 这里由于InvalidRadiusException没有无产方法,所以无法调用super(),也无法定义public OtherException(){ }
    public OtherException(double radius) {
        super(radius);
    }

//    public OtherException() {
//
//    }
}
