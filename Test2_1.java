import java.util.ArrayList;
import java.util.List;

public class Test2_1 {
    public List<List<Integer>> generate(int numRows) {
        if(numRows <= 0)
            return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> firstLine = new ArrayList<>();
        firstLine.add(1);
        res.add(firstLine);
        if(numRows == 1)
            return res;
        List<Integer> secondLine = new ArrayList<>();
        secondLine.add(1);
        secondLine.add(1);
        res.add(secondLine);
        if(numRows == 2)
            return res;
        for (int i = 2; i < numRows; i++) {
            List<Integer> preLine = res.get(i - 1);
            List<Integer> line = new ArrayList<>();
            line.add(1);
            for (int j = 1; j < i; j++) {
                int a = preLine.get(j);
                int b = preLine.get(j-1);
                line.add(a + b);
            }
            line.add(1);
            res.add(line);
        }
        return res;
    }

    public boolean threeConsecutiveOdds(List<Integer> arr) {
        for(int i = 0; i < arr.size() - 2; i++){
            if(arr.get(i) % 2 == 1 && arr.get(i+1) % 2 ==1 && arr.get(i+2) % 2 ==1)
                return true;
        }
        return false;
    }
}
