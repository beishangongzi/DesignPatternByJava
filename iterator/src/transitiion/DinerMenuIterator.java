package transitiion;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] list;
    int position = 0;

    public DinerMenuIterator(MenuItem[] list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return this.position < list.length && list[position] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = list[this.position];
        this.position = this.position + 1;
        return menuItem;
    }
}
