public class Solution {
    
    
    String[] A;
    String T,U;
    
    public boolean solution(String[] A, String T, String U) {
        
        
        char index, counter=0;
        int i;
        if (A[0].contains(T)&&A[A.length-1].contains(U))
        {
                for (index=0;index<A.length;index++)
                {
                    i=A[index].length();
                    if(A[index].charAt(i)==A[index+1].charAt(i)){
                      counter++;  
                    }
                }
                
                if (counter>0&&counter<A.length){
                    return true;
                }
       }
        return false;
        
       
}
}