
class Solution {
    public int numUniqueEmails(String[] emails)
 {

        String[] unique = new String[emails.length];
        int count = 0;

        for (String email : emails)
 {
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < email.length(); i++)
 {
                char ch = email.charAt(i);

                if (ch == '+')
 {
                    while (email.charAt(i) != '@')
 {
                        i++;
                    }
                    result.append(email.substring(i));
                    break;
                }

                if (ch == '@') 
{
                    result.append(email.substring(i));
                    break;
                }

                if (ch != '.')
 {
                    result.append(ch);
                }
            }

            String normalized = result.toString();
            boolean found = false;

            for (int i = 0; i < count; i++) 
{
                if (unique[i].equals(normalized))
 {
                    found = true;
                    break;
                }
            }

            if (!found)
 {
                unique[count] = normalized;
                count++;
            }
        }

        return count;
    }
}
