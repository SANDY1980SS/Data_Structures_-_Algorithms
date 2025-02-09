package leetCode;

public class ReverseString_344 {
    public  void reverseString(char[] s) {
        reverse(s,0);
    }
    public static void reverse(char[] ch,int index){
        if(index == (ch.length)/2) return;
        char temp = ch[index];
        ch[index] = ch[ch.length-1-index];
        ch[ch.length-1-index] = temp;
        reverse(ch,index+1);
    }
}
