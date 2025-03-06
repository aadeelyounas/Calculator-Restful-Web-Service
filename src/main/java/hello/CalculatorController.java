package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private String history = "";

    @GetMapping("/add")
    public String add(@RequestParam("op1") String op1, @RequestParam("op2") String op2) {
        double operand1 = Double.parseDouble(op1);
        double operand2 = Double.parseDouble(op2);
        double result = operand1 + operand2;
        String resStr = op1 + " + " + op2 + " = " + result;
        history += resStr + "<br>";
        return resStr;
    }

    @GetMapping("/minus")
    public String minus(@RequestParam("op1") String op1, @RequestParam("op2") String op2) {
        double operand1 = Double.parseDouble(op1);
        double operand2 = Double.parseDouble(op2);
        double result = operand1 - operand2;
        String resStr = op1 + " - " + op2 + " = " + result;
        history += resStr + "<br>";
        return resStr;
    }

    @GetMapping("/product")
    public String product(@RequestParam("op1") String op1, @RequestParam("op2") String op2) {
        double operand1 = Double.parseDouble(op1);
        double operand2 = Double.parseDouble(op2);
        double result = operand1 * operand2;
        String resStr = op1 + " * " + op2 + " = " + result;
        history += resStr + "<br>";
        return resStr;
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("op1") String op1, @RequestParam("op2") String op2) {
        double operand1 = Double.parseDouble(op1);
        double operand2 = Double.parseDouble(op2);
        if (operand2 == 0) {
            return "Error: Division by zero";
        }
        double result = operand1 / operand2;
        String resStr = op1 + " / " + op2 + " = " + result;
        history += resStr + "<br>";
        return resStr;
    }

    @GetMapping("/history")
    public String showHistory() {
        return history.isEmpty() ? "No history available." : history;
    }

    @GetMapping("/clear")
    public String clearHistory() {
        history = "";
        return "History cleared.";
    }
}