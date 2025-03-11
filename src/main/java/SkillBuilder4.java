
/**
 * SkillBuilder5 is a class for completing the Skill
 * Builder 5 assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder4 {

    // replace this line with your constants
    static int t_index;
    static int y_index;
    static boolean LOOKFORT;
    static boolean  LOOKFORY;



    public static String findTYPattern(String s)
    {
        int index = 0;

        LOOKFORT = true;

        while (index < s.length()) {
            if (s.toLowerCase().charAt(index) == 't' && LOOKFORT) {
                t_index = index;
                LOOKFORT = false;
                LOOKFORY = true;
            }

            if (s.toLowerCase().charAt(index) == 'y' && LOOKFORY) {
                y_index = index;
                LOOKFORY = false;
                return s.substring(t_index, y_index+1);
            }

            // if (!LOOKFORT && !LOOKFORY) {
            //     return s.substring(t_index, y_index+1);
            // }

            index++;
        }


        return "";
    }
}
