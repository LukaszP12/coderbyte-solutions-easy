package Codility;

import java.util.ArrayList;
import java.util.List;

public class Ideone {

    public static void main(String[] args) throws java.lang.Exception {
        List<ICalc> calcs = new ArrayList<ICalc>();
        calcs.add(new Add());
        calcs.add(new Multi());
        calcs.add(new Substract());

        for (ICalc c : calcs) {
            System.out.println(c.calc(2, 3));
        }
    }
}

    interface ICalc {
        int calc(int x,int y);
    }

    class Add implements ICalc {
        @Override
        public int calc(int x, int y) {
            return x + y;
        }
    }

    class Multi implements ICalc {
        @Override
        public int calc(int x, int y) {
            return x*y;
        }
    }

    class Substract implements ICalc {
        @Override
        public int calc(int x, int y) {
            return x/y;
        }
    }

