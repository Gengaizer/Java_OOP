package semenar_3;

import java.util.ArrayList;
import java.util.Iterator;

public class Flow implements Comparable<Flow>, Iterable<Group> {
    private ArrayList<Group> groups;
    private Integer size;

    public Flow(ArrayList<Group> groups) {
        this.groups = groups;
        this.size = groups.size();
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = groups.size();
    }

    @Override
    public int compareTo(Flow g1) {
        return this.size.compareTo(g1.size);
    }

    @Override
    public Iterator<Group> iterator() {
        return new FlowIterator(groups);
    }

}
