class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int i = ransomNote.length();
        while(0<i--){
            char _char = ransomNote.charAt(i);
            int charIndex = magazine.indexOf(_char);
            if(charIndex>-1){
                magazine = magazine.substring(0, charIndex) + magazine.substring(charIndex+1);
            }else{
                return false;
            }
        }
    return true;
    }
}