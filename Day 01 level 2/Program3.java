class PalindromeChecker{
    private String text;
    public PalindromeChecker(String text){
        this.text=text;
    }
    public boolean isPalindrome(){
        int start=0,end=text.length()-1;
        while(start<end){
            if(text.charAt(start)!=text.charAt(end)) return false;
        
            start++;
            end--;
        }
        return true;
    }
    public void displayResult(){
        if(isPalindrome()) System.out.println(text+" is Palindrome");
        else System.out.println(text+" is not Palindrome");
    }
}
public class Program3 {
    public static void main(String[] args) {
        PalindromeChecker text1=new PalindromeChecker("malayalam");
        PalindromeChecker text2=new PalindromeChecker("rakesh");
        text1.displayResult();
        text2.displayResult();
        
    }
    
}
