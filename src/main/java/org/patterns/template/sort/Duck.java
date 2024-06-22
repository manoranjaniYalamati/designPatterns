package org.patterns.template.sort;

public class Duck implements Comparable<Duck>{
    int weight;
    int height;

    public Duck(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public int compareTo(Duck o) {
        if(this.weight < o.weight) {
            return -1;
        }
        else if(this.weight == o.weight) {
            return 0;
        }
        return 1;
    }
}
