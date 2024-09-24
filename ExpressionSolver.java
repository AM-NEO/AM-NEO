import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ExpressionSolver {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript"); // Attempt to get the JavaScript engine

        // Check if the engine is available
        if (engine == null) {
            System.err.println("JavaScript engine is not available.");
            return;
        }

        // Define the expression to evaluate
        String expression = "3 + 5 * (2 - 8) / 2"; // Example expression

        try {
            // Evaluate the expression
            Object result = engine.eval(expression);
            System.out.println("The result of the expression '" + expression + "' is: " + result);
        } catch (ScriptException e) {
            System.err.println("Error evaluating expression: " + e.getMessage());
        }
    }
}