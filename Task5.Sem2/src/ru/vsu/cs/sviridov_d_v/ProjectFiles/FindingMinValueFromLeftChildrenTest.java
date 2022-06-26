package ru.vsu.cs.sviridov_d_v.ProjectFiles;

import org.junit.Assert;
import org.junit.Test;
import ru.vsu.cs.sviridov_d_v.ProjectFiles.bst.BSTreeAlgorithms;

public class FindingMinValueFromLeftChildrenTest {

    SimpleBinaryTree<Integer> tree = new SimpleBinaryTree<>(Integer::parseInt);

    @Test
    public void testFindingMinValueFromLeftChildren1() throws Exception {
        tree.fromBracketNotation("8 (6 (4 (5), 6), 5 (, 5 (2, 8)))");

        Integer factualResult = BSTreeAlgorithms.getMinNode((tree.getRoot()));

        Integer expectedResult = 4;

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void testFindingMinValueFromLeftChildren2() throws Exception {
        tree.fromBracketNotation("80 (62 (55 (26 (5, 39), 57)), 94)");

        Integer factualResult = BSTreeAlgorithms.getMinNode((tree.getRoot()));

        Integer expectedResult = 5;

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void testFindingMinValueFromLeftChildren3() throws Exception {
        tree.fromBracketNotation("93 (56 (55 (21 (23, 39), 57)), 83)");

        Integer factualResult = BSTreeAlgorithms.getMinNode((tree.getRoot()));

        Integer expectedResult = 21;

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void testFindingMinValueFromLeftChildren4() throws Exception {
        tree.fromBracketNotation("18 (6 (5), 5 (, 3 (2, 8)))");

        Integer factualResult = BSTreeAlgorithms.getMinNode((tree.getRoot()));

        Integer expectedResult = 5;

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void testFindingMinValueFromLeftChildren5() throws Exception {
        tree.fromBracketNotation("10 (7 (4 (1), 6), 5 (, 5 (2, 8)))");

        Integer factualResult = BSTreeAlgorithms.getMinNode((tree.getRoot()));

        Integer expectedResult = 1;

        Assert.assertEquals(expectedResult, factualResult);
    }
}
