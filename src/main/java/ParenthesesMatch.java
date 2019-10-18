import java.util.Stack;

public class ParenthesesMatch {
    public static Boolean isMatch(String str)
    {
        if(str=="")
            return true;
        Stack<Character> st=new Stack<Character>();
        for(int index=0;index<str.length();index++)
        {
            if(str.charAt(index)=='('||str.charAt(index)=='{'||str.charAt(index)=='[')
            {
                st.push(str.charAt(index));
            }
            else
            {
                if(str.charAt(index)==')')
                {
                    if(!st.empty()&&st.peek()=='(')
                        st.pop();
                    else
                        return false;
                }
                else if(str.charAt(index)=='}')
                {
                    if(!st.empty()&&st.peek()=='{')
                        st.pop();
                    else
                        return false;
                }
                else if(str.charAt(index)==']')
                {
                    if(!st.empty()&&st.peek()=='[')
                        st.pop();
                    else
                        return false;
                }

            }

        }
        return st.empty();


    }

    static public void main(String[] args){
        String str="{({([])})";
        System.out.println(isMatch(str));
    }
}
