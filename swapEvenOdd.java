
import java.util.io.*;
class swapEvenOdd
{
public static void main(String args[])
{
string input = "AXBYCZ";
StringBuilder output = new StringBuilder();
char[] characters = input.ToCharArray();
for (int i = 0; i < characters.Length; i++)
{
  if (i % 2 == 0)
  {
    if((i+1) < characters.Length )
    {
      output.Append(characters[i + 1]);
    }
               output.Append(characters[i]);
  }
}
}
}
