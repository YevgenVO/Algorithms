package gmail.yevgenij.v.o.addTwoNumbers;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode lThird;
        ListNode l3;
        int plus = 0;
        lThird = new ListNode((l1.getNum() + l2.getNum() + plus) % 10);
        l3 = lThird;
        for (l1 = l1.getNext(); l1 != null; l1 = l1.getNext()) {
            l2 = l2.getNext();
            lThird.setNext(new ListNode((l1.getNum() + l2.getNum() + plus) % 10));
            lThird = lThird.getNext();
            plus = (l1.getNum() + l2.getNum() + plus) / 10;
        }
        return l3;
    }
}