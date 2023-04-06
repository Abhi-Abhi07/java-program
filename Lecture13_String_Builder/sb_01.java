import java.util.*;

public class sb_01{
    
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("iron");
        System.out.println(sb);

        // // charAt index 0
        // sb.charAt(1);
        // System.out.println(sb.charAt(1));


        // // setcharAt index 3
        // sb.setCharAt(3, 'm');
        // System.out.println(sb);


        // // insert() function
        // sb.insert(0, 'F');
        // // sb.insert(4, 'r');
        // System.out.println(sb);


        // // delete function()
        // // sb.delete(2, 3); // 2 is inclusive and 3 is exclusive (2,2)
        // sb.delete(2, 4); // 2 is inclusive and 4 is exclusive (2,3)
        // System.out.println(sb);


        //                     // string ke case me
        // sb.append('m');   // str = str+"m";
        // System.out.println(sb);
        // sb.append('a');   // str = str+"a";
        // System.out.println(sb);
        // sb.append('n');   // str = str+'n';
        // System.out.println(sb);
        // sb.append(sb);
        // System.out.println(sb);


        System.out.println(sb.length());

    }
}