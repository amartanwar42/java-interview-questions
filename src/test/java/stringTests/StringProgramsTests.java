package stringTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import stringPrograms.StringPrograms;

public class StringProgramsTests {

    StringPrograms stringPrograms = new StringPrograms();

    @Test
    public void verifyPalindrome(){
        boolean result = stringPrograms.verifyPalindrome("amar");
        Assert.assertEquals(result,false);
    }
    @Test
    public void removeGivenCharacter(){
        String s = stringPrograms.removeGivenCharacter("amar", 'm');
        Assert.assertEquals(s,"aar");
    }

    @Test
    public void printDuplicateTest(){
        stringPrograms.printDuplicate("amarsinghtanwar");
    }

    @Test
    public void anagram(){
        Boolean angram = stringPrograms.angram("anar", "rama");
        System.out.println(angram);
    }

    @Test
    public void printFirstNonDuplicate(){
        stringPrograms.firstNonDuplicateChar("amar");
    }

    @Test
    public void containOnlyDigitTest(){
        Boolean result = stringPrograms.containsOnlyDigits("1232ad");
        System.out.println(result);
    }

    @Test
    public void containOnlyAlpha(){
        Boolean result = stringPrograms.containsOnlyAlpha("amar");
        System.out.println(result);
    }

    @Test
    public void containAlphaNumeric(){
        Boolean result = stringPrograms.containsAlphaNumeric("3@s");
        System.out.println(result);
    }

    @Test
    public void getCountOfVowelsAndConsonants(){
        stringPrograms.countNumberOfVowelsAndConsonants("amarsinghtanwar");
    }

    @Test(description = "remove all character which are duplicate")
    public void  removeDuplicateCharacter(){
        String result = stringPrograms.removeDuplicateCharacter("amar");
        Assert.assertEquals(result,"mr");
    }

    @Test(description = "Make string character unique remove all duplicates")
    public void removeDuplicate(){
        String amar = stringPrograms.removeDuplicate("amar");
        System.out.println(amar);
    }

    @Test
    public void countNumberOfWordsInGivenString(){
        stringPrograms.countNumberOfWordsInGivenString("This this is is done by Saket Saket");
    }

}
