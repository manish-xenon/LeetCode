//Given an absolute path for a file (Unix-style), simplify it.
//
//        For example,
//        path = "/home/", => "/home"
//        path = "/a/./b/../../c/", => "/c"
//
//        click to show corner cases.
//        Corner Cases:
//
//        Did you consider the case where path = "/../"?
//        In this case, you should return "/".
//        Another corner case is the path might contain multiple slashes '/' together,
//        such as "/home//foo/".
//        In this case, you should ignore redundant slashes and return "/home/foo".


package stack;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by manish on 1/11/15.
 */
public class SimplifyPath {
    public static void main(String[] args) {
        SimplifyPath sp = new SimplifyPath();
        String test = sp.simplifyPath("/abc/...");

        System.out.println(test);
    }

    public String simplifyPath(String path) {
        String[] gadha = path.split("/");
        String temp = "";
        String divide = "/";
        String answer = "";
        Stack<String> spath = new Stack<String>();
        StringBuilder stringBuilder = new StringBuilder();

        for (String ghoda : gadha) {
            if (ghoda.equals("")) continue;
            else if (ghoda.equals(".")) continue;
            else if (ghoda.equals("..")) {
                if (!spath.empty()) spath.pop();
            } else
                spath.push(ghoda);
        }

        if(spath.empty()) return divide;

//        if (!spath.empty()) {
//            while (!spath.empty()) {
//                temp = spath.pop();
//                answer = divide + temp + answer;
//            }
//        }

        Iterator<String> iterator = spath.iterator();
        if(!spath.empty()){
            while(iterator.hasNext()){
                answer = answer + divide + iterator.next();
            }
        }


        return answer;

    }
}
