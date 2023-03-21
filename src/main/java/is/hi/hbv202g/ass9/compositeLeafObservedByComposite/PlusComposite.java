package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import is.hi.hbv202g.ass9.composite.MathExpression;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements is.hi.hbv202g.ass9.composite.MathExpression {
    int result = 0;

    private List<is.hi.hbv202g.ass9.composite.MathExpression> children = new ArrayList<is.hi.hbv202g.ass9.composite.MathExpression>();

    public void add(MathExpression mathExpression) {
        children.add(mathExpression);
    }

    @Override
    public int getResult() {
        int pointer = 0;
        int size = children.size();
        while (pointer < size) {
            result += children.get(pointer).getResult();
            pointer++;
        }
        return result;
    }
}
