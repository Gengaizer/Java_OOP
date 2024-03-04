package semenar_3;

import java.util.Comparator;

public class FlowComparator implements Comparator<Flow> {
    // @Override
    // public int compare(Student t1, Student t2) {

    // return t1.getGrade().compareTo(t2.getGrade());
    // }

    @Override
    public int compare(Flow g1, Flow g2) {
        return g1.getSize().compareTo(g2.getSize());
    }
}
