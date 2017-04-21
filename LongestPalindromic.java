public class Solution { 
    public String longestPalindrome(String s) { 
        int cur=0; 
        int last=0; 
        int max=0; 
        int j1=0; 
        int j2=0; 
        int finalMax=0; 
        int finalCur=0; 
        int finalLast=0; 
        String res=null; 
        for(int i=0;i<s.length();i++){ 
            if(i+1<s.length()&&s.charAt(i)==s.charAt(i+1)){ 
                cur=i; 
                last=i+1; 
                max=last-cur+1; 
                for(j1=i+2,j2=i-1;j1<s.length()&&j2>-1;j1++,j2--){ 
                    if(j1<s.length()&&j2>-1&&s.charAt(j1)==s.charAt(j2)){ 
                        cur=j2; 
                        last=j1; 
                        max=last-cur+1; 
                         //System.out.println(max); 
                    } 
                    else{ 
                        break; 
                    } 
                     
                } 
            } 
            if(max>finalMax){ 
               finalMax=max; 
               finalCur=cur; 
               finalLast=last; 
            } 
            if(i+2<s.length()&&s.charAt(i)==s.charAt(i+2)){ 
                cur=i; 
                last=i+2; 
                max=last-cur+1; 
                for(j2=i-1,j1=i+3;j1<s.length()&&j2>=0;j1++,j2--){ 
                    if(j1<s.length()&&j2>=0&&s.charAt(j1)==s.charAt(j2)){ 
                        cur=j2; 
                        last=j1; 
                        max=last-cur+1; 
                    } 
                    else{ 
                        break; 
                    } 
                } 
            } 
            //System.out.println(i); 
            if(max>finalMax){ 
               finalMax=max; 
               finalCur=cur; 
               finalLast=last; 
            } 
            if(finalMax==s.length()){ 
            res=s; 
            } 
            else{ 
            res=s.substring(finalCur,finalLast+1); 
            }   
        } 
        return res; 
    } 
}