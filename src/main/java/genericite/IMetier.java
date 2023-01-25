package genericite;

import java.util.List;

public interface IMetier<T> {

    void add(T o);
     List<T> getAll();
    T findById(Long id);

    void delete(Long id);
}
