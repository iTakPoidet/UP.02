public class nodeMebel {
    private mebel mebel_list;
    private nodeMebel next = null;
    public nodeMebel(mebel mebel_list) {
        this.mebel_list = mebel_list;
    }
    public nodeMebel(){}

    public nodeMebel getNext() {
        return next;
    }

    public void setNext(nodeMebel next) {
        this.next = next;
    }

    public mebel getMebel() {
        return mebel_list;
    }

    public void setMebel(mebel mebel_list) {
        this.mebel_list = mebel_list;
    }

    public String toString(){
        return mebel_list.toString();
    }
}
