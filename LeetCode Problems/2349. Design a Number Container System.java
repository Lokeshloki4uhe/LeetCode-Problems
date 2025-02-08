//LEETCODE 2349. Design a Number Container System


class NumberContainers {
    HashMap<Integer, TreeSet<Integer>> map = new HashMap<>();
    HashMap<Integer, Integer> keyValue = new HashMap<>();
    public NumberContainers() {

    }
    
    public void change(int index, int number) {
        if (keyValue.containsKey(index)) { 
            int oldNum = keyValue.get(index);
            map.get(oldNum).remove(index);
            if (map.get(oldNum).isEmpty()) {
                map.remove(oldNum);
            }
        }
        keyValue.put(index, number);
        map.putIfAbsent(number, new TreeSet<>());
        map.get(number).add(index);
    }

    public int find(int number) {
        if (!map.containsKey(number) || map.get(number).isEmpty()) return -1;
        return map.get(number).first();
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */


