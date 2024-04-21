import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class Guest implements InvocationHandler {
    private ICourse course;

    public Guest(ICourse course) {
        this.course = course;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {

        try {
            if (isValidMethod(method.getName())) {
                return method.invoke(course, args);

            } else {
                throw new IllegalAccessException();
            }

        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }

    private boolean isValidMethod(String name) {
        Pattern pattern = Pattern.compile("^(get|show)(?!.*(video|content|certificate|Details)).*");
        return pattern.matcher(name).matches();
    }
}
