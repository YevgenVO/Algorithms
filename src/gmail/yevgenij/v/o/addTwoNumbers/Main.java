package gmail.yevgenij.v.o.addTwoNumbers;


public class Main {
    private static ListNode listNodeFirst;
    private static ListNode listNodeSecond;
    private static ListNode listNodeThird;

    public static void main(String[] args) {
        listNodeFirst = new ListNode(5);
        listNodeFirst.setNext(new ListNode(9));
        listNodeFirst.getNext().setNext(new ListNode(9));
        listNodeSecond = new ListNode(9);
        listNodeSecond.setNext(new ListNode(9));
        listNodeSecond.getNext().setNext(new ListNode(9));
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        listNodeThird = addTwoNumbers.addTwoNumbers(listNodeFirst, listNodeSecond);
        System.out.println(listNodeThird.getNum() + " -> " + listNodeThird.getNext().getNum() + " -> " + listNodeThird.getNext().getNext().getNum());
    }
}
