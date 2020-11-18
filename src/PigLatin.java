public class PigLatin {
    public static String pigIt(String str) {
        String regex = "\\s+";
        String result = "";
        String jesper[] = str.split(regex);
        for(String i : jesper)
        {
            if(Character.isLetter(i.charAt(0)))
                result += i.substring(1) + i.substring(0,1) + "ay ";
            else
                result += i + " ";
        }
        return result = result.substring(0,result.length() - 1);

    }
}