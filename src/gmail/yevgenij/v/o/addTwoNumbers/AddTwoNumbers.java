package gmail.yevgenij.v.o.addTwoNumbers;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode lFirst = l1;
        ListNode lSecond = l2;
        ListNode lThird;
        ListNode l3;
        int plus = 0;
        lThird = new ListNode((lFirst.getNum() + lSecond.getNum() + plus) % 10);
        l3 = lThird;
        for (lFirst = lFirst.getNext(); lFirst != null; lFirst = lFirst.getNext()) {
            lSecond = lSecond.getNext();
            lThird.setNext(new ListNode((lFirst.getNum() + lSecond.getNum() + plus) % 10));
            lThird = lThird.getNext();
            plus = (lFirst.getNum() + lSecond.getNum() + plus) / 10;
        }
        return l3;
    }
}