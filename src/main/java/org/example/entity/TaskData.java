package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
    
    private Set<Task> annsTasks = new HashSet<Task>();
    private Set<Task> bobsTasks = new HashSet<Task>();
    private Set<Task> carolsTasks = new HashSet<Task>();
    private Set<Task> unassignedTasks = new HashSet<Task>();

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks){
        this.annsTasks = annsTasks;
        this.bobsTasks =  bobsTasks;
        this.carolsTasks =  carolsTasks;
        this.unassignedTasks =  unassignedTasks;
    }



    public Set<Task> getTasks(String task){
        switch(task){
            case "ann":
                return this.annsTasks;
            case "bob":
                return this.bobsTasks;
            case "carol":
                return this.carolsTasks;
            default:
                return this.unassignedTasks;
        }
    }

    public Set<Task> getUnion(Set<Task> set1, Set<Task> set2){
        Set<Task> union = new HashSet<Task>(set1);
        union.addAll(set2);
        return union;
    } 

    public Set<Task> getIntersection(Set<Task> set1, Set<Task> set2){
        Set<Task> intersection = new HashSet<Task>(set1);
        intersection.retainAll(set2);
        return intersection;
    }

    public Set<Task> getDifferences(Set<Task> set1, Set<Task> set2){
        Set<Task> difference = new HashSet<Task>(set1);
        difference.removeAll(set2);
        return difference;
    }
}
