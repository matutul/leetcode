class Solution {
    public int romanToInt(String s) {
        int result = 0;
        int i = 0;
        for(i = 0; i<s.length()-1; i++){
            switch(s.charAt(i)){
                case 'M':
                    result += 1000;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'C':
                    if(s.charAt(i+1) == 'D'){
                        result += 400;
                        i++;
                        break;
                    }
                    else if(s.charAt(i+1) == 'M'){
                        result += 900;
                        i++;
                        break;
                    }
                    result += 100;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'X':
                    if(s.charAt(i+1) == 'L'){
                        result += 40;
                        i++;
                        break;
                    }
                    else if(s.charAt(i+1) == 'C'){
                        result += 90;
                        i++;
                        break;
                    }
                    result += 10;
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'I':
                    if(s.charAt(i+1) == 'V'){
                        result += 4;
                        i++;
                        break;
                    }
                    else if(s.charAt(i+1) == 'X'){
                        result += 9;
                        i++;
                        break;
                    }
                    result += 1;
                    break;
            }
        }
        if(i<s.length()){
            switch(s.charAt(i)){
                case 'M':
                    result += 1000;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'C':
                    result += 100;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'X':
                    result += 10;
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'I':
                    result += 1;
                    break;
            }
        }
        return result;
    }
}