import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Professor implements InvocationHandler {
    private ICourse course;

    public Professor(ICourse course) {
        this.course = course;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {

        try {
            if (method.getName().equals("showCourseDetails")) {
                return method.invoke(course);
            
            } else if (method.getName().startsWith("get")) {
                return method.invoke(course, args);

            } else if (method.getName().startsWith("set")) {
                return method.invoke(course, args);

            } else {
                throw new IllegalAccessException();
            }

        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }
}
