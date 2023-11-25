import java.util.Stack;

public class Model implements IEval {
    private String sanitize(String expression) {
        return expression.replaceAll("\\s+","");
    }

    public String toRPN(String infixExpression) {
        infixExpression = sanitize(infixExpression) + " ";
        StringBuilder rpn = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < infixExpression.length(); i++) {
            char c = infixExpression.charAt(i);

            if (Character.isLetterOrDigit(c) || c == '.') {
                rpn.append(c);

                if (i + 1 < infixExpression.length() && !Character.isDigit(infixExpression.charAt(i + 1))) {
                    rpn.append(" ");
                }
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    rpn.append(stack.pop());
                    rpn.append(" ");
                }
                if (!stack.isEmpty() && stack.peek() != '(') {
                    throw new IllegalArgumentException("Некорректное выражение");
                } else {
                    stack.pop();
                }
            } else {
                while (!stack.isEmpty() && operatorPriority(c) <= operatorPriority(stack.peek())) {
                    rpn.append(stack.pop());
                    rpn.append(" ");
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                throw new IllegalArgumentException("Некорректное выражение");
            }
            rpn.append(stack.pop());
            rpn.append(" ");
        }

        return rpn.toString().trim();
    }

    private int operatorPriority(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }

    public int evaluate(String expression) {
        String rpn = toRPN(expression);
        Stack<Integer> stack = new Stack<>();

        String[] tokens = rpn.split(" ");
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];

            if (token.matches("\\d+")) {
                stack.push(Integer.parseInt(token));
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result;

                switch (token) {
                    case "+":
                        result = operand1 + operand2;
                        break;
                    case "-":
                        result = operand1 - operand2;
                        break;
                    case "*":
                        result = operand1 * operand2;
                        break;
                    case "/":
                        if (operand2 == 0) {
                            return 0;
                        }
                        result = operand1 / operand2;
                        break;
                    default:
                        throw new IllegalArgumentException("Некорректный оператор");
                }

                stack.push(result);
            }
        }

        return stack.pop();
    }
}
