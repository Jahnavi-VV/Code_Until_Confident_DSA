import java.util.*;
class LongestCommonPrefixIn_Str{
static String findPrefix(String[]arr){
String first=arr[0];
int i=0;
while(i<first.length()){
char c=first.charAt(i);
for(int j=1;j<arr.length;j++){
if(i>=arr[j].length()||arr[j].charAt(i)!=c){
return first.substring(0,i);
}
}
i++;
}
return first;
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String[]arr=new String[n];
for(int i=0;i<n;i++){
arr[i]=sc.next();
}
System.out.println(findPrefix(arr));
}
}