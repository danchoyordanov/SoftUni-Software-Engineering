package stackOfStrings;

import java.util.ArrayList;

public class StackOfStrings {
    private ArrayList<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(String item) {
        this.data.add(item);
    }

    public String peek() {
        if (isEmpty()) {
            return null;
        } else {
            return data.get(data.size() - 1);
        }
    }
    public String pop(){
        if (isEmpty()) {
            return null;
        } else {
            return data.remove(data.size() - 1);
        }
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }
}
