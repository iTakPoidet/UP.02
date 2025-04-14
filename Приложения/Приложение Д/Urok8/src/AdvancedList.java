import java.util.Objects;

public class AdvancedList extends mebel_List{
    int n;
    public AdvancedList(int n) {
        super(n);
        this.n = n;
    }
    void addNodeTag(int n, String prov){
        nodeMebel current = begin;
        for (int i = 0; current.getNext() != null && i < n; i++){
            if (Objects.equals(current.getMebel().getName(), prov)){
                nodeMebel nodeMebel = new nodeMebel(generationMass());
                nodeMebel.setNext(current.getNext());
                current.setNext(nodeMebel);
            }
            current = current.getNext();
        }
    }
    void addNodeEnd (){
        nodeMebel current = begin;
        while (current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(new nodeMebel(generationMass()));
    }
    void removeNodeTag(String prov){
        nodeMebel current = begin;
        for (int i = 0; i < n; i++ ){

            if (Objects.equals(current.getMebel().getData(), prov)){
                if(current.getNext().getNext() == null || current.getNext() != null){
                    current.setNext(current.getNext().getNext());
                    i = i + 1;
                }else {
                    current.setNext(null);
                }
            }
            current = current.getNext();
        }
    }


    /*void removeNodeTag(String prov){
        nodeMebel current = begin;
        while (current!=null){
            mebel m=current.getMebel();

            if (Objects.equals(m.getData(), prov)){
                if (current.getNext()==null){

                    current=null;
                    continue;
                }
                current.setNext(current.getNext().getNext());

            }
            current=current.getNext();
        }
    }*/
}