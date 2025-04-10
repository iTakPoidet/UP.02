public class nodeMebel {
    private mebel odj;
    private nodeMebel next = null;
    public nodeMebel(mebel odj) {
        this.odj = odj;
    }

    public nodeMebel getNext() {
        return next;
    }

    public void setNext(nodeMebel next) {
        this.next = next;
    }

    public mebel getMebel() {
        return odj;
    }
    public String toString(){
        return odj.toString();
    }
}
