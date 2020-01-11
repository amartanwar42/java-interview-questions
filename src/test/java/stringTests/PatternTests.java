package stringTests;

import org.testng.annotations.Test;
import patternPrograms.PatternPrograms;

public class PatternTests {
    PatternPrograms patternPrograms= new PatternPrograms();

    @Test
    public void rightTriangle(){
        patternPrograms.rightTriangle(5);
    }

    @Test
    public void leftTriangle(){
        patternPrograms.leftTriangle(5);
    }

    @Test
    public void printPyramid(){
        patternPrograms.printPyramid(5);
    }

    @Test
    public void reverseDiamond(){
        patternPrograms.printReverseDiamond(5);
    }
    @Test
    public void printDiamond(){
        patternPrograms.printDiamond(5);
    }

    @Test
    public void downwardTriangleStar(){
        patternPrograms.downwardTriangleStar(5);
    }

    @Test
    public void rightPascalsTriangle(){
        patternPrograms.rightPascalsTriangle(5);
    }

    @Test
    public void leftPascalsTriangle(){
        patternPrograms.leftPascalsTriangle(7);
    }
}
