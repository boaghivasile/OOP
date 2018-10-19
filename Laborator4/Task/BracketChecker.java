package com.Vasilica.Laborator4.Task;

public class BracketChecker {
    private static Stack stk = new Stack(100);

    BracketChecker() {
    }

    public static boolean bracketExpression(String exp) {
        for (int i = 0; i < exp.length(); ++i) {
            switch (exp.charAt(i)) {
                case '(':
                    stk.addElement('(');
                    break;
                case ')':
                    if (stk.getTopElement() == '(') {
                        stk.popTop();
                    }
                    break;
                case '[':
                    stk.addElement('[');
                    break;
                case ']':
                    if (stk.getTopElement() == '[') {
                        stk.popTop();
                    }
                    break;
                case '{':
                    stk.addElement('{');
                    break;
                case '}':
                    if (stk.getTopElement() == '}') {
                        stk.popTop();
                    }
            }
        }

        return stk.isEmpty();
    }
}


