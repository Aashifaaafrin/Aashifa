import java.util.io.*;
class diffChar
{
public static void main(String Args[])
{
char str[100],s1[100];
int i,count=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter two strings:");
for(i=0;str[i]!='\0'||s1[i]!='\0';i++)
{
if(s1[i]!=str[i])
count++;
}
if(count==1)
System.out.println("Yes");
else
System.out.println("No");
}
