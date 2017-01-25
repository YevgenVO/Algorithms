package gmail.yevgenij.v.o.addTwoNumbers;


public class Main {
    private ListNode listNodeFirst;
    private ListNode listNodeSecond;
    private ListNode listNodeThird;

    public static void main(String[] args) {
        Main a = new Main();
        a.listNodeFirst = new ListNode(5);
        a.listNodeFirst.setNext(new ListNode(9));
        a.listNodeFirst.getNext().setNext(new ListNode(9));
        a.listNodeSecond = new ListNode(9);
        a.listNodeSecond.setNext(new ListNode(9));
        a.listNodeSecond.getNext().setNext(new ListNode(9));
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        a.listNodeThird = addTwoNumbers.addTwoNumbers(a.listNodeFirst, a.listNodeSecond);
        System.out.println(a.listNodeThird.getNum() + " -> " + a.listNodeThird.getNext().getNum() + " -> " + a.listNodeThird.getNext().getNext().getNum());
    }
}