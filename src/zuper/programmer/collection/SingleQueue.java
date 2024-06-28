package zuper.programmer.collection;

import java.util.AbstractQueue;
import java.util.Collections;
import java.util.Iterator;

public class SingleQueue<E> extends AbstractQueue<E> {

    private E data;

    @Override
    public Iterator<E> iterator() {
        return Collections.singleton(data).iterator();
    }

    @Override
    public int size() {
        return data != null ? 1 : 0 ;
    }

    @Override
    public boolean offer(E e) {
        if (data == null) {
            data = e;
            return true;
        }
        return false;
    }

    @Override
    public E peek() {
        return data;
    }

    @Override
    public E poll() {
        E temp = data;
        data = null;
        return temp;
    }
}
