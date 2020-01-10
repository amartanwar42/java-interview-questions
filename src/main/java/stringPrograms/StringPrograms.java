package stringPrograms;

import java.util.*;

public class StringPrograms {

    public boolean verifyPalindrome(String str){
        Boolean result=false;
        StringBuilder string = new StringBuilder(str);
        string.reverse();

        if(string.toString().equals(str)){
            result= true;
        }
        return result;
    }

    public String removeGivenCharacter(String str, char c){
        String s = str.replaceAll(Character.toString(c), "");
        return s;
    }

    public String removeDuplicateCharacter(String str){

        HashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        StringBuilder stringBuilder= new StringBuilder();

        char[] chars = str.toCharArray();

        for (char c:chars) {
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }

        
        for (Map.Entry<Character, Integer> entr:map.entrySet()) {
            if(entr.getValue()<2){
                System.out.println(entr.getKey());
                stringBuilder.append(entr.getKey());
        }


    }
        return stringBuilder.toString();
    }
    
    public String removeDuplicate(String str){
        HashSet<Character> characters = new LinkedHashSet<>();

        char[] chars = str.toCharArray();

        for (char c:chars) {
            characters.add(c);
        }

        StringBuilder stringBuilder= new StringBuilder();
        for (char c:characters) {
         stringBuilder.append(Character.toString(c));
        }

        return stringBuilder.toString();
    }

    public void printDuplicate(String str){
        HashSet<Character> characters = new HashSet<>();

        char[] chars = str.toCharArray();
        HashMap<Character,Integer> hashMap= new HashMap<>();

        for (char c:chars) {
            if(!characters.add(c)){
                if(hashMap.containsKey(c)){
                    hashMap.put(c,hashMap.get(c)+1);
                }
                else{
                    hashMap.put(c,1);
                }
            }

        }

        for (Map.Entry<Character, Integer> ent:hashMap.entrySet()) {
            System.out.println(ent.getKey()+"            "+ent.getValue());
        }

    }

    public Boolean angram(String s1, String s2){
        char[] chars = s1.toCharArray();
        char[] chars1 = s2.toCharArray();
        Boolean result=false;

        Arrays.sort(chars);
        Arrays.sort(chars1);

        if(chars.length==chars1.length){
            for (int i = 0; i < chars.length; i++) {
                if(chars[i]!=chars1[i]){
                    break;
                }
                else {
                    result=true;
                }
            }
        }


        return result;
    }

    public void firstNonDuplicateChar(String str){
        char[] chars = str.toCharArray();

        HashMap<Character,Integer> map= new LinkedHashMap<>();

        for (char c:chars) {
            map.put(c,map.containsKey(c) ? map.get(c)+1 : 1);
        }

        for (Map.Entry<Character,Integer> entry:map.entrySet()) {
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }
    }

    public Boolean containsOnlyDigits(String str){
        String regex = "\\d+";


        boolean matches = str.matches(regex);

        return matches;
    }

    public Boolean containsOnlyAlpha(String str){
        String regex = "\\D+";

        boolean matches = str.matches(regex);

        return matches;
    }

    public Boolean containsAlphaNumeric(String str){
        String regex = "\\w+";

        boolean matches = str.matches(regex);

        return matches;
    }

    public void countNumberOfVowelsAndConsonants(String str){
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("vowel",0);
        hashMap.put("consonants",0);


        char vowels[]={'a','e','i','o','u'};

        char[] chars = str.toCharArray();
        for (char c:chars) {
            for (char c1:vowels) {
                if(c==c1){
                    hashMap.put("vowel",hashMap.get("vowel")+1);
                    break;
                }
                else{
                    hashMap.put("consonants",hashMap.get("consonants")+1);
                    break;
                }

            }
        }

        for (Map.Entry<String,Integer> ent: hashMap.entrySet()) {
            System.out.println(ent.getKey()+"            "+ent.getValue());
        }

    }

    public void countNumberOfWordsInGivenString(String str){
        String[] str2 = str.split(" ");
        HashMap<String,Integer> hashMap= new LinkedHashMap<>();

        for (String s:str2) {
            hashMap.put(s,hashMap.containsKey(s) ? hashMap.get(s)+1 : 1);
        }

        System.out.println(hashMap);

    }


}
