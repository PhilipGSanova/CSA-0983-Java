/*Create a method that takes String as input and throws an exception if the string does not contain vowels*/
class VowelsException extends Exception{
    public VowelsException(String message){
        super(message);
    }
}
public class Ex2_3 {
    public static void checkvowel(String str) throws VowelsException {
        boolean vowel = false;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i) == 'a' ||str.charAt(i) == 'e' ||str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i) == 'u' ||
            str.charAt(i) == 'A' ||str.charAt(i) == 'E' ||str.charAt(i) == 'I' ||str.charAt(i) == 'O' ||str.charAt(i) == 'U' ){
                vowel = true;
                break;
            }
        }
        if(vowel){
            System.out.println("The given string contains vowels");
        }else{
            throw new VowelsException("The given string does not contain vowels");
        }
    }

    public static void main(String[] args) {
        try {
            checkvowel("This is vowels");
        } catch (VowelsException e) {
            System.out.println(e.getMessage());
        }
    }
}
