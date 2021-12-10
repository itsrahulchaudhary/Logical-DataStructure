package in.rahulit.stack;

import java.util.Stack;
/** LeetCode
 * 20. Valid Parentheses
 * 
 * Input - "()[]{}" , "()" , ([)]"
 * TC- O(n)
 * SC- O(n)
 */
public class Solution01 {

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.add(c);
			} else {
				if (stack.isEmpty())
					return false;
				if (c == ']' && stack.peek() != '[')
					return false;
				if (c == '}' && stack.peek() != '{')
					return false;
				if (c == ')' && stack.peek() != '(')
					return false;

				stack.pop();
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String s = "()[]{}";
		Solution01 sol = new Solution01();
		System.out.println(sol.isValid(s));

	}

}
