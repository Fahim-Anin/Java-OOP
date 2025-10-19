import java.util.Arrays;

class GetAnagramkey{
    public String getAnagramKeyval(String str)
    { 
        return getAnagramKey(str);
        

    }
    private String getAnagramKey(String str) {
        char[] characters = str.toCharArray();
        Arrays.sort(characters);
        
        return new String(characters);
        }
    
}