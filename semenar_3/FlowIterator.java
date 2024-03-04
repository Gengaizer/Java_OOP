package semenar_3;

import java.util.*;

public class FlowIterator implements Iterator<Group> {
    private ArrayList<Group> groups;
    private int count;

    public FlowIterator(ArrayList<Group> groups) {
        this.groups = groups;
    }

    @Override
    public boolean hasNext() {
        return count < groups.size();
    }

    @Override
    public Group next() {
        return groups.get(count++);
    }
}
