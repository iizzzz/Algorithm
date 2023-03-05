package src.datastructure.queue;

import java.util.ArrayList;

public class Implementation_Queue {
    private ArrayList<Integer> listQueue = new ArrayList<>();

    public void add(Integer data) {
        listQueue.add(data);
    }

    public Integer poll() {
        if (listQueue.size() == 0) {
            return null;
        } else {
            return listQueue.remove(0);
        }
    }

    public int size() {
        return listQueue.size();
    }

    public Integer peek() {
        if (listQueue.size() == 0) {
            return null;
        } else {
            return listQueue.get(0);
        }
    }

    public String show() {
        return listQueue.toString();
    }

    public void clear() {
        listQueue.clear();
    }
}
