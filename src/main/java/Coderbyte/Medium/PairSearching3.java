package Coderbyte.Medium;

import java.util.ArrayList;

public class PairSearching3 {

    public static class Node {
        private Node parent = null;
        private int num;

        public Node(int num, Node parent) {
            this.num = num;
            this.parent = parent;
        }

        public Node getParent() {
            return this.parent;
        }

        public int getNum() {
            return num;
        }
    }

    public static boolean hasPair(Node node) {

        String strVal = "";
        Node t = node;
        while (t != null) {
            strVal = t.getNum() + strVal;
            t = t.getParent();
        }
        if (strVal.length() < 2) {
            return false;
        }
        for (int i = 1; i < strVal.length(); i++) {
            if (strVal.charAt(i) == strVal.charAt(i - 1)) {
                return true;
            }
        }

        return false;
    }

    public static int PairSearching3(int num) {
        ArrayList<Node> processor = new ArrayList<>();

        processor.add(new Node(num, null));

        int count = 0;

        if (hasPair(processor.get(0))) {
            return count;
        }

        processorLoop:
        while (true) {
            ArrayList<Node> dump = new ArrayList<>();
            for (int i = 0; i < processor.size(); i++) {
                Node processorNode = processor.get(i);
                if (hasPair(processorNode)) {
                    break processorLoop;
                }
            }
            for (int i = 0; i < processor.size(); i++) {
                int currentNum = processor.get(i).getNum();
                String strVal = String.valueOf(currentNum);

                for (int j = 0; j < strVal.length(); j++) {
                    int pieceOfNum = Character.getNumericValue(strVal.charAt(j));
                    dump.add(new Node(pieceOfNum * currentNum, processor.get(i)));
                }
            }
            processor.clear();
            processor.addAll(dump);
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(PairSearching3(8));
        System.out.println(PairSearching3(198));
    }
}
