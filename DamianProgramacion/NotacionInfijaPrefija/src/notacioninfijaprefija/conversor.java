package notacioninfijaprefija;

import java.util.Stack;
import javax.swing.JLabel;

public class conversor {
    static void  convertir(String infija, JLabel mostrarPre, JLabel mostrarInfi){
        mostrarPre.setText("Notacion Prefija: "+infijaAPrefija(infija));
    }
    
    static int precedence(char c){
        switch(c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    static StringBuilder infijaAPrefija(String expression){
        StringBuilder result = new StringBuilder();
        StringBuilder input = new StringBuilder(expression);
        input.reverse();
        Stack<Character> stack = new Stack<>();
        
        char[] charsExp = new String(input).toCharArray();
        for(int i = 0; i<charsExp.length; i++){
            char c = charsExp[i];
            if(precedence(c)>0){
                while(stack.isEmpty()==false && precedence(stack.peek())>precedence(c)){
                    Character dato = stack.pop();
                    result.append(dato);
                    System.out.println(dato);
                }
                
                stack.push(c);
            }
            else if(c==')'){
                char x = stack.pop();
                while(x!='('){
                    result.append(x);
                    x = stack.pop();
                }
            }else if(c=='('){
                stack.push(c);
            }else{
                result.append(c);
            }
        }
        
        for(int i=0; i<=stack.size()+1; i++){
            Character dato = stack.pop();
            result.append(dato);
        }
        return result.reverse();
    }
}
