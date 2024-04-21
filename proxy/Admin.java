import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Admin implements InvocationHandler {
    private ICourse course;

    public Admin(ICourse course) {
        this.course = course;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        
        try {
            return method.invoke(course, args);

        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }
}
