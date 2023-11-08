package spring5.ch03_pjt_03;

public class CalAdd implements ICalculator {
    @Override
    public int doOperation(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
}
