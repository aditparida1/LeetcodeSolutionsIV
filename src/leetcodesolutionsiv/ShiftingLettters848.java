
package leetcodesolutionsiv;
import java.util.*;
/**
 *
 * @author aditp
 */
public class ShiftingLettters848
{
    public String shiftingLetters(String S, int[] shifts) 
    {
        int[] finalShift = new int[shifts.length];
        for (int i = 0; i < shifts.length; i++)
        {
            shifts[i] = shifts[i] % 26;
        }
        int sum = 0;
        for(int i = shifts.length - 1; i >= 0; --i)
        {
            if(i == shifts.length - 1)
            {
                finalShift[i] = shifts[i];
            }
            else
            {
                finalShift[i] = shifts[i] + finalShift[i + 1];
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< finalShift.length; ++i)
        {
            char op = shiftChar(S.charAt(i), finalShift[i]);
            sb.append(op);
        }
        
        return sb.toString();
    }
    private char shiftChar(char ip, int n)
    {
        int shift = n % 26;
        if(ip + shift > 'z')
        {
            int dest = ip + shift;
            return (char)(ip + shift - 'z' + 'a' - 1);
        }
        return (char)(ip + shift);
    }
}
