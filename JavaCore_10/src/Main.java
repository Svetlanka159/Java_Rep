public class Main {
    public static void main(String[] args) {
        Node root = new Node(20); //конструктором задаем начальное корневое значение бинарного дерева
        int arr[] = {14, 11, 16, 5, 15, 18, 8, 23, 22, 27, 24, 150}; //в массиве передаем все остальные значения бинарного дерева
        for(int i=0; i<arr.length; i++){
            root.addNewNode(root, arr[i]);
        }
        System.out.println();
        Node.printSortASCValue(root);
    }
}
