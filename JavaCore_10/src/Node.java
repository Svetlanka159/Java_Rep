public class Node {
    public int nodeValue;
    public Node leftValue;
    public Node rightValue;

    public Node(int nodeValue) {
        this.nodeValue = nodeValue;
        this.leftValue = null;
        this.rightValue = null;
    }

    public void addNode(int value) {
        Node node = new Node(value);
        node.nodeValue = value;
        if (this.nodeValue > value) {
            System.out.println("Переданное значение " + value + " меньше, чем " + this.nodeValue + ". Поэтому должно уйти в левое поддерево.");
            if (this.leftValue == null) {
                this.leftValue = node;
                System.out.println("Слева от значения " + this.nodeValue + " создаем новый левый узел " + value);
            }
            else {
                this.leftValue.addNode(value);
            }
        }
        else {
            System.out.println("Переданное значение " + value + " больше, чем " + this.nodeValue + ". Поэтому должно уйти в правое поддерево.");
            if (this.rightValue == null){
                this.rightValue = node;
                System.out.println("Справа от значения " + this.nodeValue + " создаем новый правый узел " + value);
            }
            else {
                this.rightValue.addNode(value);
            }
        }
    }

    public static void addNewNode(Node rootValue, int newValue){
        rootValue.addNode(newValue);
    }

    public static int printSortASCValue(Node value){

        if(value.leftValue != null){
            //System.out.println("Печатаем левое значение для узла " + value.nodeValue+":");
            printSortASCValue(value.leftValue);
        }
        System.out.println(value.nodeValue);
        //System.out.println();

        if(value.rightValue != null){
            //System.out.println("Печатаем правое значение для узла " + value.nodeValue+":");
            printSortASCValue(value.rightValue);
        }
        return value.nodeValue;
    }
}
