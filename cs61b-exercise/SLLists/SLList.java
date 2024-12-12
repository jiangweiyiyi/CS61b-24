

/**
 * @author luo
 * @version 1.0
 */
public class SLList {
    /**
     * 链表作为静态私有内部类
     * 两个属性item与IntNode
     *
     * sllist两个私有属性：sentinel与size
     * 空构造函数与int有参构造，带上sentinel都
     * 方法：addFirst,getFirst,addLast,size
     */
    private static class IntNode{
        int item;
        IntNode next;

        public IntNode(int item, IntNode next){
            this.item = item;
            this.next = next;
        }

        @Override
        public String toString() {
            return "IntNode{" +
                    "item=" + item +
                    ", next=" + next +
                    '}';
        }
    }

    private IntNode sentinel;
    private int size;

    //两个构造函数，要确保不会出现空指针
    public SLList(){
        size = 0;
        sentinel = new IntNode(63, null);
    }
    public SLList(int x){
        size = 1;
        sentinel = new IntNode(63, null);
        sentinel.next = new IntNode(x, null);
    }

    public void addFirst(int x){
        size += 1;
        sentinel.next = new IntNode(x, sentinel.next);
    }
    public int getFirst(){
        return sentinel.next.item;
    }
    public void addLast(int x){
        size += 1;
        IntNode p = sentinel;
        while(p.next != null){
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }
    public int getSize(){
        return size;
    }

    @Override
    public String toString() {
        return "SLList{" +
                "sentinel=" + sentinel +
                '}';
    }

    public static void main(String[] args) {
        SLList slList = new SLList(1);
        slList.addFirst(1);
        slList.addFirst(2);
        slList.addFirst(3);
        slList.addFirst(4);
        slList.addFirst(5);
        slList.addLast(6);
        System.out.println(slList);
        System.out.println(slList.size);
    }
}
