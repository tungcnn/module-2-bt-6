package methods;

public interface IMethods<T> {
    void add(T obj);
    void remove(T obj);
    void update(T obj, T obj2);
    T search(String str);
    void show();
}
