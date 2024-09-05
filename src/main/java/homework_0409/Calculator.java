package homework_0409;


public interface Calculator<T> {
    T add(T a, T b);
    T sub(T a, T b);
    T multi(T a, T b);
    T div(T a, T b);
}
