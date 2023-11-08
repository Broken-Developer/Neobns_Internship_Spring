package ch02_pjt_02;

public class CalAdd implements ICalculator {
    @Override
    public int doOperation(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
}
